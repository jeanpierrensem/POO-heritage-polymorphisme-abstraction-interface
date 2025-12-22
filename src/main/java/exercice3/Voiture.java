package exercice3;

import java.util.*;

public class Voiture extends Vehicule{
    private String modele;
    private Date annee;

    public Voiture(String nom, double prix, String modele) {
        super(nom, prix);
        this.modele = modele;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void emettreSon(){
        System.out.println("la voiture vrombit");
    }
}
