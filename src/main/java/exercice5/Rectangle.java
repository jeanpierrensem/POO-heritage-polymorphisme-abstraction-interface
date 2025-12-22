package exercice5;

public class Rectangle extends  Figure {
    private double longueur;
    private double largeur;


    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public Rectangle(String nom, double longueur, double largeur){
        super.nom = nom;
        this.largeur = largeur;
        this.longueur = longueur;
    }
    @Override
    public double calculerAire() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return (longueur + largeur) * 2;
    }



    @Override
    public String afficherDetails() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", nom='" + nom + '\'' +
                ", Périmètre=" + calculerPerimetre() +
                ", Aire=" + calculerAire() +
                '}';
    }
}
