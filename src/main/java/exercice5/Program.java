package exercice5;

public class Program {
  public static void main(String...args){

      Figure unCercle = new Cercle("Cercle1", 10.3);
      Figure unRectangle = new Rectangle("unRectangle", 10.3, 14.0);

      //calcul aire et périmètre du Cercle
      System.out.println(unCercle.afficherDetails());


      //Calcul aire et périmètre du Rectangle
      System.out.println(unRectangle.afficherDetails());
  }


}
