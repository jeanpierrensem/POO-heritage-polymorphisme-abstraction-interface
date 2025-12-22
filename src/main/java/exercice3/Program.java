package exercice3;

public class Program {
    public static void main(String... args){
        //création d'une
        Voiture uneVoiture = new Voiture("BMW", 10000.0, "m4");
        uneVoiture.emettreSon();
        uneVoiture.afficherInformations();

        //création d'un avion
        Avion  unAvion = new Avion("Air force One", 700000.0, "BOEIN", "100 KM/H");
        unAvion.emettreSon();
        unAvion.afficherInformations();

        //création d'une moto
        Moto uneMoto = new Moto("BMW Motorrad", 20000.0, "BMW", "400 Cheveaux");
        uneMoto.emettreSon();
        uneMoto.afficherInformations();

    }
}
