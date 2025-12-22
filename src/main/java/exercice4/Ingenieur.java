package exercice4;

public class Ingenieur extends  Employe {

    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire(){
        return super.calculerSalaire() * 0.15;
    }

    @Override
    public String toString() {
        return "Ingenieur{" +
                super.toString() +
                "specialite='" + specialite + '\'' +
                '}';
    }
}
