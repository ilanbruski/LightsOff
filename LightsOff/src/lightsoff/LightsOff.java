
package lightsoff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LightsOff extends JFrame implements ActionListener //on crée la classe lightsoff
{

	public static void main(String[] args) 
	{
		LightsOff light = new LightsOff();		//créarion d'un nouvel objet, qui est un jeu
		light.setVisible(true);					//rend l'objet lightsoff visible

	}
	
	//disposition du plateau de jeu privé
	private JButton[][] gameButtons;					//ce tableau à deux dimensions contiendra une référence pour tous les boutons du tableau.
	private JButton manual;								//un bouton pour le "Enter Manual Setup".
	private JLabel wins;								//un label utilisé pour indiquer à l'utilisateur combien de victoires il a actuellement.
	private int winCount;								//une variable de comptage pour contenir le nombre actuel de victoires.
        public LightsOff()
	{
		winCount = 0;                                                   //définit la variable winCount sur 0.
		//Termine le programme lorsque l'utilisateur ferme le JFrame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Définit le titre et la taille du JFrame.
		setTitle("Lights Out");
		setSize(500, 500);
		
		JPanel mainPanel = new JPanel();				//Le panneau actuel dans lequel tout est placé.
		
		mainPanel.setLayout(new BorderLayout());		//définit la disposition du mainPanel.
		
		//Boutons
		JPanel buttonPanel = new JPanel();				//un nouveau panneau pour contenir tous les boutons du plateau de jeu.
		gameButtons = new JButton[5][5];				//crée un nouveau tableau bidimensionnel qui contiendra 25 boutons.
		buttonPanel.setLayout(new GridLayout(5,5));		//définit la disposition des boutons.					
		
		for(int i = 0; i<5; i++){						//ces deux boucles ajouteront chaque bouton dans le tableau à deux dimensions.
                
			for(int j = 0; j<5; j++){
				int random = (int)(Math.random()*3);	//configure une variable pour un nombre aléatoire, de sorte que les lumières (boutons) seront allumées au hasard.
				JButton button = new JButton();			//crée un nouvel objet JButton.
				gameButtons[i][j] = button;				//ajoute le bouton au tableau.
				button.setName(""+i+j);					//définit le nom de chaque bouton en conséquence où ils apparaissent sur le plateau de jeu.
				button.setBackground(Color.BLACK);		//définit chaque bouton sur noir, désactivé.
				if(random == 2)							//utilise la variable aléatoire pour changer la couleur du bouton en jaune, activé.
				{
					backgroundColor(button);
				}
				button.addActionListener(this);			//ajoute un actionlistener à chaque bouton.
				buttonPanel.add(button);				//ajoute le bouton au buttonPanel.
			}
		}