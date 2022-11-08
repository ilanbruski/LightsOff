/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author ilanb
 */
public class Personnage {
    String nom;
    int niveau_de_vie;
    
    
    
    public Personnage (String unnom,int unniveau_de_vie){
        nom = unnom;
        niveau_de_vie = unniveau_de_vie;
    }
    
    
    
@Override //ecraser    
public String toString(){//pour pouvoir visualiser les attributs
    String chaine_a_retourner;//initalisation d'une variable pour renvoyer les infos
    chaine_a_retourner = "Le personnage " + nom + " possède un niveau de vie de " + niveau_de_vie +".";
    System.out.println(chaine_a_retourner);//affichage de la reponse 
    return chaine_a_retourner ; //on retourne en interne la réponse
}
}
