package exercice3;

public class Vehicule {
    private String nom;
    private double prix;

    private void emettreSon(){
        System.out.println("Le véhicule émet un son inconnu");
    }

    public void afficherInformations(){
        System.out.println( "Vehicule{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}');
    }


    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public Vehicule() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
