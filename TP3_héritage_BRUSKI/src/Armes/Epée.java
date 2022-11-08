package Armes;



import Armes.Arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilanb
 */
public class Epée extends Arme {//classe qui herite de arme
    int indice_finesse;
    
    public Epée(String nom, int niveau_attaque, int a){//constructeur
        super(nom, niveau_attaque);//condition pour que l'indice soit compris entre 0 et 100
        if ((a>0)||(a<100)){
            indice_finesse = a;
        }
            else {
            indice_finesse = 0;    
        }
        }
    }
