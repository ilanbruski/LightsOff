
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
