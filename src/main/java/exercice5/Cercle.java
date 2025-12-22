package exercice5;

public class Cercle extends Figure {
    private double rayon;

    public Cercle(String nom, double rayon) {
        super.nom = nom;
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return 3.14 * rayon * rayon;
    }

    @Override
    public double calculerPerimetre() {
        return 2*3.14* rayon;
    }

    @Override
    public String afficherDetails() {
        return "Cercle{" +
                "rayon=" + rayon +
                ", nom='" + nom + '\'' +
                ", Aire ='" + calculerAire() + '\'' +
                ", Périmètre='" + calculerPerimetre() + '\'' +
                '}';
    }

}
