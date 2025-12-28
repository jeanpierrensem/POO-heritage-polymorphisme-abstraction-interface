package exercice7;

public class Commande {
    public double montant;
    public Paiement paiement;


    public Commande(double montant, Paiement paiement) {
        this.montant = montant;
        this.paiement = paiement;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setTypePaiement(Paiement paiement) {
        this.paiement = paiement;
    }


    public  void processPayment() {
        paiement.effectuerPaiement(montant);
    }



}
