package tp2_relation_1_bruski;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilanb
 */
public class Personne {//création d'une nouvelle classe
    // ajout de ses attributs
    String nom ;
    String prenom ;
    int nbVoitures;//ajout d'un nouvel attribut (nombre de voitures possédées)
    Voiture[] liste_voitures;//tableau de reference vers des voitures

    public Personne (String p_nom, String p_prenom){//ajout du constructeur
        nom = p_nom ;
        prenom = p_prenom ;
        liste_voitures = new Voiture [3];//on reserve la mémoire pour ce tableau
        nbVoitures = 0 ;//on initalise le nombre de voiture possédées à 0
}
    
@Override//ecrase
public String toString (){//creation de la methode toString
    String chaine_a_retourner ;//initialisation d'une variable
    chaine_a_retourner = prenom + nom ;//affectation du nom et du prenom a cette variable
return chaine_a_retourner;//renvoi de la variable au systee en interne
}

}