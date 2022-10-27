/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_bruski;

/**
 *
 * @author ilanb
 */
public class TP2_relation_1_BRUSKI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // ajout des lignes de création et de manipulation des objets
Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");
System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

bob.liste_voitures[0] = uneClio ; //ajout de la relation "Bob est propriétaire d'une Clio"
bob.liste_voitures[1] = uneAutreClio ; //ajout d'une seonde voiture à Bob
bob.nbVoitures = 2 ;
uneClio.Proprietaire = bob ;
une2008.Proprietaire = bob ;
System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] + ", il en a acheté une deuxieme : une " + bob.liste_voitures[1]) ;//pour acceder aux voitures de bob
   
//ajout de deux autres voitures à reno :
reno.liste_voitures[0] = une2008;
reno.liste_voitures[1] = uneMicra;
reno.nbVoitures = 2 ; 
une2008.Proprietaire = reno ;
uneMicra.Proprietaire = reno ;
System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[0] + ", il en a acheté une deuxieme : une " + reno.liste_voitures[1]) ;//pour acceder aux voitures de reno
    }
    
}
