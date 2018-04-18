package domaine;

public class Materiel implements Comparable {
    public static final String MONNAIE = "CHF";

    private int no;
    private String nom;
    private double prix;
    private int rabais;

    public Materiel(int no, String nom, double prix, int rabais) {
        this.no=no; this.nom=nom; this.prix=prix; this.rabais=rabais;
    }

    public int getNo() { return no; }
    public String getNom() { return nom; }
    public double getPrix() { return prix; }
    public int getRabais() { return rabais; }
    public void setRabais(int rabais) { this.rabais=rabais; }

    public String toString() { return nom + " (" + prix + " " + MONNAIE + ")" + (rabais > 0 ? "   Rabais:"+rabais+"%" : ""); }
    public boolean equals(Object obj) { return no == ((Materiel)obj).no; }
    public int compareTo(Object obj) { return nom.compareToIgnoreCase(((Materiel)obj).nom); }
}