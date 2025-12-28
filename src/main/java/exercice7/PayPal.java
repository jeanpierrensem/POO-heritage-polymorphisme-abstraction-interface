package exercice7;

public class PayPal extends Paiement{
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public PayPal(double montant, String numero, String email) {
        super(montant, numero);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Effectuer paiement avec Paypal");
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "email='" + email + '\'' +
                ", montant=" + montant +
                ", numero=" + numero +
                '}';
    }
}
