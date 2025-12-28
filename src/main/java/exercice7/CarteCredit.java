package exercice7;

public class CarteCredit extends  Paiement {



    private String numeroCarte ;

    public CarteCredit(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public CarteCredit(double montant, String numero, String numeroCarte) {
        super(montant, numero);
        this.numeroCarte = numeroCarte;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Effectuer Paiement pae carte de crédit");
    }

    @Override
    public String toString() {
        return "CarteCredit{" +
                "numeroCarte=" + numeroCarte +
                ", montant=" + montant +
                ", numero=" + numero +
                '}';
    }
}
