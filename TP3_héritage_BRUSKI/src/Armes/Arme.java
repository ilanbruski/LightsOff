/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author ilanb
 */
public class Arme {//classe arme
    String nom ;//attribut nom de l'arme
    int niveau_attaque ;//attribut niveau d'attaque de l'arme

    
    
    public Arme(String unnom, int unniveau_attaque){//constructeur de l'arme
        nom = unnom ;
        niveau_attaque = unniveau_attaque ;
    }
    
    
    
@Override //ecraser    
public String toString(){//pour pouvoir visualiser les attributs
    String chaine_a_retourner;//initalisation d'une variable pour renvoyer les infos
    chaine_a_retourner = "L'arme " + nom + " possède un niveau d'attaque de " + niveau_attaque +".";
    System.out.println(chaine_a_retourner);//affichage de la reponse 
    return chaine_a_retourner ; //on retourne en interne la réponse
}
}



    
    
    
    
