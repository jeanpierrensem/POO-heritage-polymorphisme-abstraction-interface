package exercice1;
public class Program {

    public static void main(String...args){
       //— déclarez et intentiez un adhèrent ;
        Adherent totoAdh = new Adherent("toto", "totoPrenom", "toto@gmail.com","75457890", 20, 1);


        // instantiation d'un auteur
        Auteur  aurelien = new Auteur("AuteurNom", "AuteurPrenom", "auteur@gmail.com","5678347856", 40);

        //— déclarez et instanciez un livre qui est écrit par un auteur ;
        Livre programmationJava = new Livre(1676, "Programmation Java", aurelien);

        //infpormation de l'adhérent
       System.out.println(totoAdh.toString());
        //information du livre
        System.out.println(programmationJava.toString());
    }
}
