package exercice6;

public class GestionBibliotheque {
    public static void main(String...args){
    //Dans une classe principale appelée GestionBibliotheque, créez quelques
        // instances de Livre, DVD et Utilisateur.

        Empruntable unLivre = new Livre("Java 21", "auteur1", false);
        Empruntable unDvd = new Dvd("Java Dvd", "un Realisateur", false);
        Utilisateur unUtilisateur = new Utilisateur("Marcel dupont");

        //Appelez la méthode emprunterObjet() sur l'utilisateur en passant différentes
        //combinaisons d'objets empruntables (livres et DVD).
        unUtilisateur.emprunterObjet(unLivre);
        unUtilisateur.emprunterObjet(unDvd);

        //Appelez également la méthode retourner() sur certains objets empruntés.
        unLivre.retourner();
        unDvd.retourner();




    }
}
