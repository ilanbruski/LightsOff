/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_bruski;

/**
 *
 * @author ilanb
 */
public class TP2_manip_BRUSKI {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    //creation de deux assiettes de tartiflettes avec des calories differentes :
    Tartiflette assiette1 = new Tartiflette (500) ;
    Tartiflette assiette2 = new Tartiflette (600) ;
    Tartiflette assiette3 = assiette2 ; //assiette3 et asstiette2 referencent ici la même tartiflette

    int c = assiette2.nbCalories ;//incrementation des calories de l'assiette 2 à une variable
    //inversion des deux valeurs pour verifier :
    assiette2 = assiette3 ;//seulemnt 2 tartiflettes ont réellemnt été créées, car assiette 2 et 3 referent le même objet
    assiette3.nbCalories = c;
    //affichage des deux nombres de calories respectifs
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;//affichage des calories de l'assiette 2
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;//affichage des calories de l'assiette 3
    //on remarque que les nombres de calories sont identiques donc il n'y a qu'un seul objet
    
    //inversion des valeurs des assiettes 1 et 2 de manière analogue :
    int c2 = assiette2.nbCalories;
    assiette2.nbCalories = assiette1.nbCalories;
    assiette1.nbCalories = c2;
    System.out.println("nb de calories de Assiette1 : " + assiette1.nbCalories);
    System.out.println("nb de calories de Assiette2 : " + assiette2.nbCalories);
    //on remarque que les calories des assiettes 1 et 2 sont inversées par rapport à leur valeur initiale
    
    //les lignes "Moussaka assiette666 = assiette1 ;"
    // et "Moussaka assiette667 = new Tartiflette() ;"
    //sont incorrectes car on ne peut pas convertir de tartiflette ne moussaka
    //une référence objet qui annonce référencer un type d'objet ne peut en referencer un autre seulement si ils sont dans la même classe

Moussaka Tableau [] = new Moussaka[10];//creation d'un tableau de 10 références de Moussaka
//creation de 10 nouveaux objets de type moussaka
    Moussaka grecque = new Moussaka ();
    Moussaka turque = new Moussaka ();
    Moussaka israelienne = new Moussaka ();
    Moussaka russe = new Moussaka ();
    Moussaka armenienne = new Moussaka ();
    Moussaka auxpoivrons = new Moussaka ();
    Moussaka alacourgette = new Moussaka ();
    Moussaka aufromage = new Moussaka ();
    Moussaka auxechalottes = new Moussaka ();
    Moussaka aucumin = new Moussaka ();
}
}
