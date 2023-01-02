
package lightsoff;
//bibliotèque des évenements (imports divers)
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

public class LightsOff extends JFrame implements ActionListener//on crée la classe lightsoff
{

	public static void main(String[] args) 
	{
		LightsOff light = new LightsOff();		//crée un nouvel objet lightsoff qui est un jeu
		light.setVisible(true);					//rend l'objet lightsoff visible
	}