package exercice7;

public abstract class Paiement {

    public abstract  void effectuerPaiement(double montant);
    public double  montant;
    public String numero;

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Paiement() {
    }

    public Paiement(double montant, String numero) {
        this.montant = montant;
        this.numero = numero;
    }
}
