/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_bruski;

/**
 *
 * @author ilanb
 */
public class Convertisseur {//creation d'une classe nomée convetisseur
       
    public int nbConversions ;{//nbconversion permet de comptr le nombre de conversions qui seront effectuées par le convertisseur
        nbConversions = 0 ;// Ce nombre doit être initialisé à 0 et pas de paramètres dans ce constructeur
    }

public void convertisseur (){}
    
public double CelciusversKelvin (double tc){//ajout de la méthode signifiée
    return tc; //renvoi du resultat
    //procédure similaire pour lesmethodes suivantes
}   
public double KelvinversCelcius (double tc){
    return tc;
}
public double FarenheitVersCelcius (double tc){
    return tc;
}
public double CelciusversFarenheit (double tc){
    return tc;
}
public double FarenheitversKelvin (double tc){
    return tc;
}
public double KelvinversFarenheit (double tc){
    return tc;
}
@Override
public String toString () {//La méthode toString() doit retourner le nombre de conversions effectuées
 return "nb de conversions"+ nbConversions;//On augmente le nombre de conversions de 1 à chaque fois qu’une conversion est effectuée
}
}
