package exercice6;

public class Livre implements Empruntable {
    public  boolean isBorrowed ;

    private String titre;
    private String auteur;

    public Livre() {
    }

    public Livre(String titre, String auteur, boolean isBorrowed) {
        this.titre = titre;
        this.auteur = auteur;
        this.isBorrowed = isBorrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public void emprunter() {
        System.out.println("Emprunter un LIVRE");
    }

    @Override
    public void retourner() {
        System.out.println("Retourner un LIVRE");
    }

    @Override
    public String toString() {
        return "Livre{" +
                "isBorrowed=" + isBorrowed +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
