package exercice6;

public class Dvd implements  Empruntable {
    private  boolean isBorrowed ;
    private String  titre;
    private String realisateur;

    public Dvd() {
    }

    public Dvd(String titre, String realisateur, boolean isBorrowed) {
        this.titre = titre;
        this.realisateur = realisateur;
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

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public void emprunter() {
        isBorrowed = true;
        System.out.println("Emprunter un DVD");
    }

    @Override
    public void retourner() {
        isBorrowed = false;
        System.out.println("Retourner un DVD");

    }

    @Override
    public String toString() {
        return "Dvd{" +
                "isBorrowed=" + isBorrowed +
                ", titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                '}';
    }
}
