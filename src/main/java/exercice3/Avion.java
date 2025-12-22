package exercice3;

public class Avion extends Vehicule{
    private String compagnie;
    private String vitesseMax ;
    public void emettreSon(){
        System.out.println("L'avion fait un bruit de moteur puissant");
    }

    public Avion(String nom, double prix, String compagnie, String vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }


    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public String getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(String vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
}
