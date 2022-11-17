/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_héritage_bruski;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epée;
import Armes.Baton;
import Armes.Arme;

import Armes.*;//pour utiliser ces classes dans un autre package
import Personnages.*;
import java.util.ArrayList;

/**
 *
 * @author ilanb
 */
public class TP3_héritage_BRUSKI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    
    //creation de 2 nouveaux batons et de 2 nouvelles épées
    Baton Chène = new Baton ("Chène", 4, 5);
    Baton Charme = new Baton ("Charme", 5, 6);
    Epée Excalibur = new Epée ("Excalibur", 7, 5);
    Epée Durandal = new Epée ("Durandal", 4, 7);
    
    
    //creation d'un tableau dynamique
    ArrayList<Arme>n_Arme=new ArrayList<Arme>();//on crée un tableau liste
    n_Arme.add(Chène);
    n_Arme.add(Charme);
    n_Arme.add(Excalibur);
    n_Arme.add(Durandal);
    
    
    int taille = n_Arme.size();
    int longueur=taille-1;
    for (int i=0; i<longueur; i++){
    System.out.println(n_Arme.get(i)+",");//on affiche la taille de la liste
    
    //création de 4 nouveaux personnages
    Magicien Gandalf = new Magicien ("Gandalf",65,true);
    Magicien Garcimore = new Magicien ("Garcimore",44,false);
    Guerrier Conan = new Guerrier ("Conan",78,false);
    Guerrier Lanister = new Guerrier ("Lanister",45,true);
    //création d'un guerrier ,d'un magicien, de 3 batons et 3 épées
    Magicien Dumbledore = new Magicien("Dumbledore", 87, true);
    Guerrier Napoléon = new Guerrier("Napoléon", 91, false);
    Baton Baguette = new Baton ("Baguette", 7, 11);
    Baton Curedent = new Baton ("Curedent", 4, 2);
    Baton Paille = new Baton ("Paille", 1, 11);
    Epée Tranchante = new Epée ("Tranchante", 45, 5);
    Epée Coupante = new Epée ("Coupante", 20, 4);
    Epée Frappante = new Epée ("Frappante", 32, 7);

    //on ajoute 2 épées et 1 baton au guerrier, puis on l'équipe (analogie pour le magicien)
       Napoléon.Ajouter_Arme(Tranchante);
       Napoléon.Ajouter_Arme(Coupante);
       Napoléon.Ajouter_Arme(Curedent);
       Napoléon.equiperarme("Excalibur");
       
       Dumbledore.Ajouter_Arme(Baguette);
       Dumbledore.Ajouter_Arme(Paille);
       Dumbledore.Ajouter_Arme(Frappante);
       
       
       //affichage de leur caractéristiques
       System.out.println(Napoléon);
       System.out.println(Dumbledore);



       Magicien1.ajoutearme(Baton2);

       Magicien1.ajoutearme(Epée2);

       Guerrier1.ajoutearme(Epée1);

       Guerrier1.ajoutearme(Epée3);

       Guerrier1.ajoutearme(Baton3);
    //creation d'un tableau dynamique
    ArrayList<Personnage>n_Personnage=new ArrayList<Personnage>();//on crée un tableau liste
    n_Personnage.add(Gandalf);
    n_Personnage.add(Garcimore);
    n_Personnage.add(Conan);
    n_Personnage.add(Lanister);
    
    int distance = n_Personnage.size();
    int size=taille-1;
    for (int k=0; k<size; k++){
    System.out.println(n_Personnage.get(k)+",");//on affiche la taille de la liste
    }
    }
    }
}

