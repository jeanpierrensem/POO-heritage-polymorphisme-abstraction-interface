package exercice4;

public class Program {
    public static void main(String...args){
        //— déclarez et intentiez un ingénieur ;
        Ingenieur unIngenieur = new Ingenieur("DUPONT", "Jean Mark", "jeamdupont@gmail.com", "76453967", 120000.9, "DevOps");
        unIngenieur.setSalaire(unIngenieur.calculerSalaire());
        // — déclarez et intentiez un manager ;
        Manager unManager = new Manager("CHEVALIER", "laurent","laurentchevalier@gmail.com","783409876",120000.9, "conformite");
        unManager.setSalaire(unManager.calculerSalaire());



       // — affichez les informations de l’ingénieur et du manager (nom, prénom, salaire,
        // service, et spécialité)

        System.out.println("affichez les informations de l’ingénieur");
        System.out.println(unIngenieur.toString());
        System.out.println("affichez les informations d'un manager");
        System.out.println(unManager.toString());

    }
}
