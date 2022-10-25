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
        
    Convertisseur temperature1 = new Convertisseur();//création d'un objet référencé par la variable temperature 1
    double result1 = temperature1.CelciusversFarenheit(45);//resultat de la conversion de temperature 1
    System.out.println(result1);// affichage du resultat
    //procédure analogue pour les autres conversions
    double result2 = temperature1.FarenheitVersCelcius(150); 
    System.out.println(result2);
    double result3 = temperature1.CelciusversKelvin(70);
    System.out.println(result3);
    double result4 = temperature1.KelvinversCelcius(12);
    System.out.println(result4);
    double result5 = temperature1.KelvinversFarenheit(200);
    System.out.println(result5);
    double result6 = temperature1.FarenheitversKelvin(125);
    System.out.println(result6);
    
    Scanner sc; //initalisation de la variable sc de type Scanner
    sc = new Scanner(System.in);//création d'objet
    System.out.println("Saisissez la temperature à convertir");//affichage
    double temp1 = sc.nextDouble();//l'utilisateur saisit une temperature
    System.out.println("entrez l'unité de la température initiale :\n 1 - Celcius\n 2 - Kelvin\3 - Farenheit");//affichage
    int unit1 = sc.nextInt();//l'utilisateur saisit l'unité de base de la temperature
    System.out.println("entrez l'unité de la température finale :\n 1 - Celcius\n 2 - Kelvin\3 - Farenheit");//affichage
    int unit2 = sc.nextInt();//l'utilisateur saisit l'unité voulue de la temperature
    
    if ((unit1==1)&&(unit2==1)){
    }     
    if ((unit1==1)&&(unit2==2)){
    }
    if ((unit1==1)&&(unit2==3)){
    }           
    if ((unit1==2)&&(unit2==1)){
    }           
    if ((unit1==2)&&(unit2==2)){
    }              
    if ((unit1==2)&&(unit2==3)){
    }         
    if ((unit1==3)&&(unit2==1)){
    }           
    if ((unit1==3)&&(unit2==2)){
    }
    if ((unit1==3)&&(unit2==3)){
    }
}
}

  

