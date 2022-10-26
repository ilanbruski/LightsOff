/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_bruski;

import java.util.Scanner;

/**
 *
 * @author ilanb
 */
public class TP2_convertisseurObjet_BRUSKI {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {//première méthode qui sera lancée lors de l’exécution du programme
        
    Convertisseur temperature = new Convertisseur();//création d'un objet référencé par la variable temperature 1
    double result1 = temperature.CelciusVersFarenheit(45);//resultat de la conversion de temperature 1
    System.out.println(result1);// affichage du resultat
    //procédure analogue pour les autres conversions
    double result2 = temperature.FarenheitVersCelcius(150); 
    System.out.println(result2);
    double result3 = temperature.CelciusVersKelvin(70);
    System.out.println(result3);
    double result4 = temperature.KelvinVersCelcius(12);
    System.out.println(result4);
    double result5 = temperature.KelvinVersFarenheit(200);
    System.out.println(result5);
    double result6 = temperature.FarenheitVersKelvin(125);
    System.out.println(result6);
    
    
    Scanner sc; //initalisation de la variable sc de type Scanner
    sc = new Scanner(System.in);//création d'objet
    
    
    System.out.println("Saisissez la temperature a convertir :");//affichage
    double temperature1 = sc.nextDouble();//l'utilisateur saisit une temperature
    System.out.println("Entrez l'unite de la temperature initiale :\n 1 - Celcius\n 2 - Kelvin\n 3 - Farenheit");//affichage
    int unit1 = sc.nextInt();//l'utilisateur saisit l'unité de base de la temperature
    if ((unit1 <1)||(unit1>3)){//condition pour que le nombre soit compris entre 1 et 3
        System.out.println("Erreur, vous n'avez pas selectionne d'unite valide");//affichage d'erreur
    }
    System.out.println("Entrez l'unite de la temperature finale :\n 1 - Celcius\n 2 - Kelvin\n 3 - Farenheit");//affichage
    int unit2 = sc.nextInt();//l'utilisateur saisit l'unité voulue de la temperature
    //procedure analogue qu'en lignes 42 et 43
    if ((unit2 <1)||(unit2>3)){
        System.out.println("Erreur, vous n'avez pas selectionne d'unité valide");
    }
    
    
    if (unit1==unit2){  //condition : si l'unité de depart et l'unité voulue sont les mêmes
        System.out.println("Erreur : les unites sont identiques, donc il n'y a pas de conversion a effectuer !");//affichage d'erreur à l'utilisateur
    }
    if ((unit1==1) && (unit2==2)){//condition : si l'unité de depart est le Celcius et l'unité voulue est le Kelvin
        double resultat = temperature.CelciusVersKelvin(temperature1);//le resultat prend la valeur de la temperature convertie
    System.out.println("Votre temperature prend, une fois convertie, une valeur de " + resultat + " degres !");//on affiche enfin le resultat
    }
    //procédure analogue pour les autres conversions :
    if ((unit1==1)&&(unit2==3)){
        double resultat = temperature.CelciusVersFarenheit(temperature1);
    System.out.println("Votre temperature prend, une fois convertie, une valeur de " + resultat + " degres !");//
    }           
    if ((unit1==2)&&(unit2==1)){
        double resultat = temperature.KelvinVersCelcius(temperature1);
    System.out.println("Votre temperature prend, une fois convertie, une valeur de " + resultat + " degres !");
    }           
    if ((unit1==2)&&(unit2==3)){
        double resultat = temperature.KelvinVersFarenheit(temperature1);
    System.out.println("Votre temperature prend, une fois convertie, une valeur de " + resultat + " degres !");
    }         
    if ((unit1==3)&&(unit2==1)){
        double resultat = temperature.FarenheitVersCelcius(temperature1);
    System.out.println("Votre temperature prend, une fois convertie, une valeur de " + resultat + " degres !");
    }           
    if ((unit1==3)&&(unit2==2)){
        double resultat = temperature.FarenheitVersKelvin(temperature1);
    System.out.println("Votre temperature prend, une fois convertie, une valeur de " + resultat + " degres !");
    }
}
}

  

