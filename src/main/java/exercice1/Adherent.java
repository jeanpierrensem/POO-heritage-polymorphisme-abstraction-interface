package exercice1;
public class Adherent extends Personne{

    private int numAdherent ;
    public Adherent(String nom, String prenom, String email, String telephone, int age, int numAdherent) {
        super(nom, prenom, email, telephone, age);
        this.numAdherent = numAdherent ;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + super.getNom() + '\'' +
                ", prenom='" + super.getPrenom() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", telephone='" + super.getTelephone() + '\'' +
                ", numAdherent='" + numAdherent + '\'' +
                ", age=" + super.getAge() +
                '}';
    }

    public int getNumAdherent() {
        return numAdherent;
    }

    public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }
}
