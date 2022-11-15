/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author ilanb
 */
public class Personnage {//classe
    String nom;
    int niveau_de_vie;
    Arme ajouter ;
    
    //creation d'un tableau dynamique pour que les personnages stockent les armes
    ArrayList<Arme>tab2 = new ArrayList<Arme>();
    
    
    //création d'une methode pour ajouter une arme
    public void Ajouter_Arme (Arme unearme){
        ajouter = unearme ;
        int taille = tab2.size();
        if (taille>5){
        tab2.add(unearme);
        tab2.add (unearme);   
        }
    }
    
    public Personnage (String unnom,int unniveau_de_vie){//constructeur
        nom = unnom;
        niveau_de_vie = unniveau_de_vie;
    }
    
    
    
@Override //ecraser    
public String toString(){//pour pouvoir visualiser les attributs
    String chaine_a_retourner;//initalisation d'une variable pour renvoyer les infos
    chaine_a_retourner = "Le personnage " + nom + " possède un niveau de vie de " + niveau_de_vie +".";
    return chaine_a_retourner ; //on retourne en interne la réponse
    
    
}
}
