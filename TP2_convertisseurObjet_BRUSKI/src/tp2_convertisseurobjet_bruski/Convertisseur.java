/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_bruski;

/**
 *
 * @author ilanb
 */
public class Convertisseur {//creation d'une classe nommée convetisseur

        public int nbConversions;//nbconversion permet de compterr le nombre de conversions qui seront effectuées par le convertisseur

    public Convertisseur() {//constructeur sans paramètre
        nbConversions = 0;//Ce nombre doit être initalisé à 0
    }
    
    @Override//ecrase
    public String toString () {//La méthode toString() doit retourner le nombre de conversions effectuées
    return "nb de conversions"+ nbConversions;//On augmente le nombre de conversions de 1 à chaque fois qu’une conversion est effectuée
    }


    public double CelciusversKelvin(double tempC) {//ajout de la méthode signifiée
        double tempK;//initalisation de la variable de temperature en kelvin
        tempK = (tempC + 273.15);//formule de conversion de degrès celcius vers degrès Kelvin
        nbConversions+=+1;//il y'a eu donc une conversion (supplemantaire)
    return tempK; //on renvoit le resultat converti en Kelvin
    }
    //procédure similaire pour lesmethodes suivantes :
    
    public double KelvinversCelcius(double tempK) {
        double tempC;
        tempC = tempK - 273.15;
        nbConversions+=+1;
    return tempC;
    }
    public double CelciusversFarenheit(double tempC) {
        double tempF;
        tempF = tempC *(9.0/5.0)+32 ;
        nbConversions+=+1;
    return tempF;
    }
    public double FarenheitVersCelcius(double tempF) {
        double tempC;
        tempC = (tempF-32)*(5.0/9.0);
        nbConversions+=+1;
    return tempC;
    }
    public double KelvinversFarenheit (double tempK){
        double tempF;
        tempF = (tempK-273.15)*(9.0/5.0)+32;
        nbConversions+=+1;
    return tempF;
    }
    public double FarenheitversKelvin(double tempF) {
        double tempK;
        tempK = (tempF-32)*(5.0/9.0)+273.15;
        nbConversions+=+1;
    return tempK;
    }

    
  
    
    
}