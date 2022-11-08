/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author ilanb
 */
public class Magicien extends Personnage{//heritant de personnage
    boolean confirmé;
    
    public Magicien (String nom, int niveau_de_vie, boolean a){//constructeur
        super(nom, niveau_de_vie);
           if (a = true){
            confirmé = a;
        }
            else {
            confirmé = false;    
        }
    }
}

