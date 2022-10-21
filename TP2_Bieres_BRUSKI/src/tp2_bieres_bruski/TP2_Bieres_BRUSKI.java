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
    
    
    
    public static void main(String[] args) {

        BouteilleBiere uneBiere = new BouteilleBiere ("Cuvee des trolls", 7.0 , "Bubuisson");
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneautreBiere = new BouteilleBiere ("Leffe", 6.6 , "Abbaye Leffe");
        uneBiere.lireEtiquette();
        
        BouteilleBiere premiereBiere = new BouteilleBiere ("La Chouffe",8.0,"Brasserie d'Achouffe" );

        BouteilleBiere deuxiemeBiere = new BouteilleBiere ("Triple Moine",7.3,"Brasserie du Bocq" );

        BouteilleBiere troisiemeBiere = new BouteilleBiere ("Pietra",6.5,"Brasserie Pietra" );
        boolean r = troisiemeBiere.Decapsuler();


    }
    
}
