/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_bruski;

/**
 *
 * @author ilanb
 */


public class BouteilleBiere {// création d'une classe nommée "Bouteille bière"

    
    String nom ;// le nom est une chaine
    double degreAlcool ;// le degrès est un double
    String brasserie ;// le nom est une chaine
    boolean ouverte ;// l'état (ouverte/fermée) est un booléen

    
//     
public BouteilleBiere(String p_nom, double p_degreAlcool, String p_brasserie) { //création d'un constructeur (il est appelé lors de la création d'objets de type BouteilleBiere)
    nom = p_nom;
    degreAlcool = p_degreAlcool;
    brasserie = p_brasserie;
    ouverte = false;//les bieres sont stockées fermées
}



public void lireEtiquette() {// création d'une methode pour lire l'etiquette
    
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +
    " degres) \nBrasserie : " + brasserie ) ;// affichage d'une phrase contenant toutes les infos
}


public boolean Decapsuler() {// création de la methode pour decapsuler
    if (ouverte == false){//si la bière est fermée
        ouverte = true ;//alors on l'ouvre
        System.out.println("Reussite : biere Ouverte");//puis on affiche que la bière est ouverte
        return true;//et on renvoie au système en interne le booléen vrai
    }
    else {//sinon (si la bière était fermée)
        System.out.println("Erreur : biere deja ouverte");//alors on affiche directement que la bière était déjà ouverte
        return false ;//et on renvoie alors le booléen faux en interne au système
    }
}

public String ToString () {//Creation d'une methode particulière toString()
    String chaine_a_retourner;//initalisation de la variable 
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";//on crée une phrase ui demande si une certaine bière est ouverte
    if (ouverte == true ) chaine_a_retourner += "oui" ; //donc on renvoit la réponse "oui" si la bière est ouverte
    else chaine_a_retourner += "non" ;// sinon, on renvoit bien entendu "non"
    return chaine_a_retourner ;//on retourne en interne la réponse
            
}


}