/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bruski;

/**
 *
 * @author ilanb
 */
public class Voiture {//création d'une nouvelle classe
    // ajout de ses attributs
    String Modele ;
    String Marque ;
    int PuissanceCV ;
    Personne Proprietaire;//ajout d'un attribut reference vers une personne
    
    public Voiture (String p_Marque, String p_Modele, int p_PuissanceCV){//ajout du constructeur
    Modele = p_Modele ;
    Marque = p_Marque ;
    PuissanceCV = p_PuissanceCV ;
    Proprietaire = null; //initalisation de la valeur de propriétaire à null
}
    
    @Override//ecrase
public String toString (){//creation de la methode toString
    String chaine_a_retourner ;//initialisation d'une variable
    chaine_a_retourner = Modele + Marque + " (" + PuissanceCV + ") chevaux" ;//affectation du nom et du prenom a cette variable
return chaine_a_retourner;//renvoi de la variable au systee en interne
}

}