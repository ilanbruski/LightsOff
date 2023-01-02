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

public class LightsOff extends JFrame implements ActionListener{ //on crée la classe lightsoff
	public static void main(String[] args){
		LightsOff light = new LightsOff();		//créarion d'un nouvel objet, qui est un jeu
		light.setVisible(true);					//rend l'objet lightsoff visible
	}
	
	//disposition du plateau de jeu privé
	private JButton[][] gameButtons;					//ce tableau à deux dimensions contiendra une référence pour tous les boutons du tableau.
	private JButton manual;								//un bouton pour le "Enter Manual Setup".
	private JLabel wins;								//un label utilisé pour indiquer à l'utilisateur combien de victoires il a actuellement.
	private int winCount;								//une variable de comptage pour contenir le nombre actuel de victoires.
        public LightsOff(){
	
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
				if(random == 2){							//utilise la variable aléatoire pour changer la couleur du bouton en jaune, activé.
					backgroundColor(button);
				}
				button.addActionListener(this);			//ajoute un actionlistener à chaque bouton.
				buttonPanel.add(button);				//ajoute le bouton au buttonPanel.
			}
		}
		
		mainPanel.add(buttonPanel, "Center");			//ajoute le buttonPanel au mainPanel.
		
		//Crée les boutons utilisés pour les différents contrôles.
		JButton random = new JButton("Randomize");		//Crée un nouveau bouton qui sera utilisé pour que les lumières aléatoires s'allument ou s'éteignent.
		random.setName("Random");						//définit le nom du bouton Randomizen.
		random.addActionListener(this);					//ajoute un actionlistener.
		manual = new JButton("Enter Manual Setup");		//Crée un nouveau bouton qui sera utilisé par l'utilisateur pour changer manuellement le tableau.
		manual.setName("Manual");						//définit le nom du bouton de configuration manuelle.
		manual.addActionListener(this);					//ajoute un actionlistener.
		
		JPanel controls = new JPanel();			  		//Crée un nouveau JPanel qui contiendra les différents boutons de contrôle.
		controls.setLayout(new GridLayout(1,2));		//définit la disposition des contrôles JPanel.
		controls.add(random,"South");					//ajoute le bouton de randomisation aux contrôles JPanel.
		controls.add(manual,"South");					//ajoute le bouton manuel aux contrôles Jpanel.
		mainPanel.add(controls,"South");				//ajoute les contrôles JPanel au mainPanel.
		
		//Labels
		JPanel label = new JPanel();					//crée un nouveau JPanel pour les labels à ajouter au plateau de jeu.
		label.setLayout(new GridLayout(1,1));			//définit la disposition des labels JPanel.
		label.add(wins = new JLabel());					//ajoute le label wins au label JPanel.
		wins.setText("Wins: " + winCount);				//définit le texte de l'étiquette de victoires.
		mainPanel.add(label, "North");					//le label JPanel est ajouté au mainPanel.
		
		setContentPane(mainPanel);						//définit le volet de contenu du cadre.
	}
        
	//cette methode sera utilisée dès qu'un bouton est cliqué
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton button = (JButton)e.getSource();		//obtient le bouton actuel qui a été cliqué.
		String location = button.getName();				//obtient le nom du bouton actuel
		if(location.equals("Random")){					//si le bouton "Aléatoire" est cliqué, alors la méthode aléatoire est appelée.
			randomSetting();
			return;
		}
		if(location.equals("Manual Exit")){				//si le bouton "Quitter le mode manuel" est cliqué, le nom et le texte sont modifiés et le jeu revient à un état normal.
			manual.setText("Enter Manual Setup");
			manual.setName("Manual");
			return;
		}
		if(location.equals("Manual")){					//si le bouton "Enter Manual Setup" est cliqué, le nom et le texte sont modifiés.
			manual.setText("Exit Manual Mode");
			manual.setName("Manual Exit");
			return;
		}
		if(manual.getName().equals("Manual Exit")){		//pendant que le nom du bouton manuel est défini, comme "Manual Exit", le réglage manuel sera appelé sur le bouton actuel. 
			manualSetting(button);
			return;
		}
		char colChar = location.charAt(0);				//obtient le caractère char à la position 0 du nom du bouton.
		char rowChar = location.charAt(1);				//obtient le caractère char en position 1 du nom du bouton.
		int col = Character.getNumericValue(colChar);	//cet int converti à partir du char de pos 0 sera utilisé comme indicateur de colonne.
		int row = Character.getNumericValue(rowChar);	//cet int converti à partir du char de pos 0 sera utilisé comme indicateur de ligne.
		
		//boutons temporaires pour les emplacements adjacents à côté du bouton sélectionné.
		JButton tempSelected = new JButton();			//un bouton temp pour le bouton sélectionné
		JButton tempTop = new JButton();				//un bouton temporaire pour le bouton au-dessus du bouton sélectionné
		JButton tempLeft = new JButton();				//un bouton temp pour le bouton à gauche du bouton sélectionné
		JButton tempRight = new JButton();				//un bouton temp pour le bouton à droite du bouton sélectionné
		JButton tempBottom = new JButton();				//un bouton temp pour le bouton sous le bouton sélectionné
		
		tempSelected = gameButtons[col][row];			//obtient le bouton actuel sélectionné et le stocke dans la temp.
		backgroundColor(tempSelected);					//appelle la méthode backgroundColor pour changer la couleur du bouton.
		
		//chaque bouton est tenté, mais s'il dépasse le tableau, il est intercepté et rien n'est fait.
		try {
			tempTop = gameButtons[col-1][row];			//récupère le bouton qui se trouve au-dessus du bouton sélectionné et le stocke dans temp.
			backgroundColor(tempTop);					//appelle la méthode backgroundColor pour changer la couleur du bouton.
		}
		catch(ArrayIndexOutOfBoundsException i){	
		}
		try{
			tempLeft = gameButtons[col][row-1];			//récupère le bouton qui reste au bouton sélectionné et le stocke dans temp.
			backgroundColor(tempLeft);					//appelle la méthode backgroundColor pour changer la couleur du bouton.
		}
		catch(ArrayIndexOutOfBoundsException i){	
		}
		try{
			tempRight = gameButtons[col][row+1];		//obtenir le bouton qui correspond au bouton sélectionné et le stocker dans temp.
			backgroundColor(tempRight);					//appelle la méthode backgroundColor pour changer la couleur du bouton.
		}
		catch(ArrayIndexOutOfBoundsException i){	
		}
		try{
			tempBottom = gameButtons[col+1][row];		//récupère le bouton qui se trouve sous le bouton sélectionné et le stocke dans temp.
			backgroundColor(tempBottom);				//appelle la méthode backgroundColor pour changer la couleur du bouton.
		}
		catch(ArrayIndexOutOfBoundsException i){	
		}
		isWon();										//la méthode isWon est appelée pour voir si la partie est gagnée ou non, c'est-à-dire si toutes les lumières sont éteintes.
	}
	
	//Modifie la couleur du bouton envoyé en tant que paramètre en jaune ou en noir, selon la couleur actuelle du paramètre. 
	//@param b JButton object.
	private void backgroundColor(JButton b)
	{
		if(b.getBackground()==Color.BLACK){			//le bouton b est noir, puis il est changé en jaune, sinon il est changé en noir.							
			b.setBackground(Color.YELLOW);
		}
		else{
			b.setBackground(Color.BLACK);
		}
	}
	//Cette méthode génère un nombre aléatoire pour chaque bouton dans un tableau à deux dimensions et changera la couleur du bouton si l'entier généré aléatoirement est égal à 2
	private void randomSetting(){
		for(JButton b[]: gameButtons)					//se déplace à travers chaque JButton dans le tableau à deux dimensions.
		{
			for(JButton c : b){
				int random = (int)(Math.random()*6);	//génère un nombre aléatoire entre 0 et 5.
				if(random == 2){							//si le nombre est égal à 2, la couleur du bouton est modifiée.
					backgroundColor(c);
				}
			}
		}
	}
	//Cette méthode utilise le backgroundColor pour changer la couleur du JButton envoyé en paramètre
	//@param b JButton object.
	private void manualSetting(JButton b){
		JButton temp = new JButton();		//crée un JButton temporaire.
		temp = b;							//définit le paramètre comme la température.
		backgroundColor(temp);				//appelle la méthode backgroundColor pour changer la couleur du bouton actuel.
        }
	// Cette méthode est utilisée pour déterminer si le plateau de jeu est dans un état gagnant.
	private void isWon()
	{
		int count = 0;						//une variable de comptage.
		for(JButton b[]: gameButtons){		//parcourt le tableau à deux dimensions pour chaque JButton
			for(JButton c: b){
				if(c.getBackground()==Color.BLACK){		//si la couleur actuelle du JButton est noire, alors le compte est incrémenté.
					count++;
				}
			}
		}
		if(count == 25)									//si le décompte est égal à 25, le plateau de jeu est dans un état gagnant.
		{
			JOptionPane.showMessageDialog(this, "Bravo, vous avez gagné!");		// l'utilisateur a notifié que le jeu a été gagné.
			winCount++;																	//winCount variable incrémentée de 1.
			wins.setText("Victoires: " + winCount);											//définit le statut des gains actuels à l'utilisateur.
			restart();																	//réinitialise le plateau de jeu actuel une fois la partie gagnée.
		}	
	}
	//Cette méthode est utilisée pour redémarrer le plateau de jeu actuel et utilise la méthode backgroundColor..
	private void restart(){
		for(JButton b[]: gameButtons){					//se déplace dans le tableau à deux dimensions pour chaque JButton.
			for(JButton c : b){
				int random = (int)(Math.random()*4);	//génère aléatoirement un nombre compris entre 0 et 3.
				if(random == 2){							//si le nombre est deux, la couleur actuelle du JButton est modifiée.
					backgroundColor(c);
				}
			}
		}
	}
}
