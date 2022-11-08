/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_héritage_bruski;

/**
 *
 * @author ilanb
 */
class Baton extends Arme {//classe qui herite de arme
    int age;
    
    public Baton(String nom, int niveau_attaque, int a){//constructeur
        super(nom, niveau_attaque);
        if ((a>0)||(a<100)){//condition pour que l'age soit compris entre 0 et 100
            age = a;
        }
            else {
            age = 0;    
        }
        }
    }
