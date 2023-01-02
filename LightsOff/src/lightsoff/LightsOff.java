
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