package metier;

import domaine.Materiel;
import java.util.Observer;
import dao.MaterielDao;

public class ListeMateriel extends ListeObjects {

    public ListeMateriel(Observer observer) { 
        super(observer);
        aListe = MaterielDao.loadMateriel();
        setChanged(); notifyObservers(new Action(Action.LOAD));
    }
    
    
    public void MettreAJourListe(String p){
        aListe = MaterielDao.getListeMateriel(p); 
        setChanged(); notifyObservers(new Action(Action.LOAD));
    }
    
    public String[] getInfoMateriel(int[] lstIndexes){
        String[] infoMateriel = new String[2];
        double total = 0;
        int cpt = 0;
        for(int i = 0;i<lstIndexes.length;i++){
           total += ((Materiel)aListe.get(lstIndexes[i])).getPrix();//on part du princpipe que les index corresponde, ce qui devrait être le cas vu que la liste chargé n'est pas changée
           cpt++;
        }
        infoMateriel[0] =Double.toString(total);
        infoMateriel[1] = Integer.toString(cpt);
        setChanged(); notifyObservers(new Action(Action.SEL));
        return infoMateriel;
    }
    
    public void MettreAJourRabais(int[] lstIndexes, int rabais){
        for(int i = 0;i<lstIndexes.length;i++){
           ((Materiel)aListe.get(lstIndexes[i])).setRabais(rabais);
           dao.MaterielDao.appliquerRabais(((Materiel)aListe.get(lstIndexes[i])).getNo(), rabais);
        }
        setChanged(); notifyObservers(new Action(Action.UPD));
    }
    
    public void loadMateriel(){ }

    public Materiel getMateriel() { return (Materiel)super.get(); }
    public Materiel getMateriel(int pos) { return (Materiel)super.get(pos); }
}