/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_bruski;

/**
 *
 * @author ilanb
 */
public class TP2_Bieres_BRUSKI {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {//première méthode qui sera lancée lors de l’exécution du programme

        BouteilleBiere uneBiere = new BouteilleBiere ("Cuvee des trolls", 7.0 , "Dubuisson");//création d'un objet référencé par la variable uneBiere et affectation des valeurs aux attributs de l'objet
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneautreBiere = new BouteilleBiere ("Leffe", 6.6 , "Abbaye Leffe");//l'objet bouteille de bière est désormais créé et il est référencée par la variable uneBiere
        uneBiere.lireEtiquette();//appel de la methode lireEtiquette
        
        //procédure analogue pour les autres bières
        
        BouteilleBiere Chouffe = new BouteilleBiere ("La Chouffe",8.0,"Brasserie d'Achouffe" );

        BouteilleBiere Moine = new BouteilleBiere ("Triple Moine",7.3,"Brasserie du Bocq" );
        
        BouteilleBiere Pietra = new BouteilleBiere ("Pietra",6.5,"Brasserie Pietra" );
        boolean r = Pietra.Decapsuler(); // resultat du decapsulage de la bierre Pietra
        
        System.out.println(uneBiere) ; //on affiche les information d'une biere
        System.out.println(Chouffe);
        System.out.println(Moine);
    }
    
}
