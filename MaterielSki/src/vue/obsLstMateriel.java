/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.util.Observable;
import java.util.Observer;
import metier.Action;
import java.awt.List;
import metier.ListeMateriel;

/**
 *
 * @author Aurélien Hamouti
 */
public class obsLstMateriel implements Observer {
    List lstMateriel;
    
    public obsLstMateriel(List lstMateriel){
        this.lstMateriel = lstMateriel;
    }
    
    public void update (Observable o, Object arg) {
        switch (((Action)arg).getAction()) {
            case Action.LOAD:((ListeMateriel)o).setPos(ListeMateriel.NO_POS); lstMateriel.removeAll(); for (int i=0; i < ((ListeMateriel)o).size(); i++) { lstMateriel.add(((ListeMateriel)o).getMateriel(i).toString()); } break;
            case Action.ADD: lstMateriel.add(((ListeMateriel)o).getMateriel(((Action)arg).getPos()).toString()); break;
            case Action.DEL: lstMateriel.remove(((Action)arg).getPos()); break;
            case Action.UPD: 
                int[] selectedIndexes = lstMateriel.getSelectedIndexes(); 
                ((ListeMateriel)o).setPos(ListeMateriel.NO_POS); lstMateriel.removeAll(); for (int i=0; i < ((ListeMateriel)o).size(); i++) { lstMateriel.add(((ListeMateriel)o).getMateriel(i).toString());}
                for(int i = 0;i<selectedIndexes.length;i++){
                    lstMateriel.select(selectedIndexes[i]);
                }break;   
        }
    }
}
