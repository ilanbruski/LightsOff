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
    Arme arme_p ; 
    //creation d'un tableau dynamique pour que les personnages stockent les armes
    ArrayList<Arme>tab2 = new ArrayList<Arme>();
    Arme arme_en_main;//nouvel attribut
    

    
        public Personnage (String unnom,int unniveau_de_vie){//constructeur
        nom = unnom;
        niveau_de_vie = unniveau_de_vie;
        arme_p = null;//pour signifier que le personnage n’est pas armé   
        
        }
        
            //création d'une methode pour ajouter une arme
    public void Ajouter_Arme (Arme unearme){
        if (tab2.size()<5){
        tab2.add(unearme);
        }
    }
    
    //ajout du getter
    public Arme getArme_en_main() {
    return arme_en_main;

    }
    
    //création d'une méthode pour équiper un personnage
    public void equiperarme(String nomdarme){
    for(int j=0;j<tab2.size();j++){
    if (tab2.get(j).getNom().equals(nomdarme)){
      arme_en_main=tab2.get(j);
      System.out.println("L'arme a été trouvée et equipée");

    }
    }
    }

    
@Override //ecraser    
public String toString(){//pour pouvoir visualiser les attributs
    String chaine_a_retourner;//initalisation d'une variable pour renvoyer les infos
    chaine_a_retourner = "Le personnage " + nom + " possède un niveau de vie de " + niveau_de_vie +" et est équipé de l'arme "+ arme_en_main +".";
    return chaine_a_retourner ; //on retourne en interne la réponse
    
    
}
}
