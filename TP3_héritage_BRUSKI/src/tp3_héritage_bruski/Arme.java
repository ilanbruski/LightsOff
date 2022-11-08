/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_héritage_bruski;

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
    if ((niveau_attaque <0)||(niveau_attaque>100)){//condition pour que l
    chaine_a_retourner = "Erreur : le niveau d'attaque doit être compris entre 0 et 100";//dans
    }
    System.out.println(chaine_a_retourner);//affichage de la reponse 
    return chaine_a_retourner ; //on retourne en interne la réponse
}
}



    
    
    
    
