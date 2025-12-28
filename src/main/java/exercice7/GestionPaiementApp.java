package exercice7;

public class GestionPaiementApp {
    public static  void main(String...args){
        //Dans une classe principale appelée GestionPaiementApp, créez des instances de
        //Commande avec différents moyens de paiement (CarteCredit et PayPal).

        Paiement uneCarteCredit = new CarteCredit(1000.0,"010101", "0202");
        Paiement unPaypal = new PayPal(2000.0, "0303", "email1@gmail.com");

        Commande commandeCarte = new Commande(1000.2, uneCarteCredit);
        Commande commandePaypal = new Commande(20000.0, unPaypal);

        //Appelez la méthode processPayment() pour chaque commande et observez
        //comment le polymorphisme permet d'utiliser la même méthode pour différents
        //types d'objets.
        commandeCarte.processPayment();
        commandePaypal.processPayment();

    }
}
