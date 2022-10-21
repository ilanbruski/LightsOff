/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_bruski;

/**
 *
 * @author ilanb
 */



public class BouteilleBiere {
    
    String nom ;
    double degreAlcool ;
    String brasserie ;
    boolean ouverte ;

    
    
public BouteilleBiere(String p_nom, double p_degreAlcool, String p_brasserie) {
    nom = p_nom;
    degreAlcool = p_degreAlcool;
    brasserie = p_brasserie;
    ouverte = false;
}



public void lireEtiquette() {
    
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +
    " degres) \nBrasserie : " + brasserie ) ;
}

public boolean Decapsuler() {
    if (ouverte == false){
        ouverte = true ;
        System.out.println("Reussite : biere Ouverte");
        return true;
    }
    else {
        System.out.println("Erreur : biere deja ouverte");
        return false ;
    }
}


}