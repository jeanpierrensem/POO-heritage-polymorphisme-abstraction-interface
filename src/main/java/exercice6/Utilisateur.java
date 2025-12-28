package exercice6;

public class Utilisateur {
    private String nom;

    public Utilisateur() {
    }

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void  emprunterObjet(Empruntable objet){
        objet.emprunter();
    }
}
