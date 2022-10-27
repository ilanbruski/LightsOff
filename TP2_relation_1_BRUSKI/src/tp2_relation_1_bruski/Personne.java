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

//on ajout la methode ajouter_voiture à la classe Personne pour automatiser un peu
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire != null) { //si la voiture possède déjà un propriétaire
            System.out.println(voiture_a_ajouter + "déjà prise") ;//on affiche qu'elle est déja prise
            return false ;// puis on renvoit faux en interne

        }

        else {//dans le cas où la voiture n'a pas été volée
            if (this.nbVoitures == 3){// si le garage est plein
                System.out.println(this.prenom + this.nom + "a un garage plein car il possède 3 voitures") ;//on affiche à l'utilisateur que le garage est plein
                return false ;//on ne peut rien faire et on renvoit une nouvele fois faux
            }

            else {//sinon, l'ajout est possible :
                this.liste_voitures[nbVoitures] = voiture_a_ajouter ;//on incremente le nombre de voitures possédées par le propriétaire
                nbVoitures += 1 ; //son nombre de voitures augmente de 1
                voiture_a_ajouter.Proprietaire = this  ;//on indique a la voiture le nouveau propriétaire
                return true ;//on rentourne enfin true
                }
        }
    }
}