/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import javax.swing.*;
import java.awt.event.*;

//classe pour le frame/menu principal et qui donne accès aux autres frame
public class Frame extends JFrame {
	static FrameDonateur frameDonateur;
	static FrameBenevole frameBenevole;
	static FrameEmploye frameEmploye;
	//static WindowListener exitListener;
	static JPanel panel1;
	//constructeur frame
	public Frame(){
	//creation d'un superviseur
	Superviseur unSuperviseur = new Superviseur();
	
		//titre du frame
		setTitle("GestiDon");
		//dimensions du frame
		setSize (300,500);		
		
	//creation panel
		panel1 = new JPanel();
		GridBagLayout gbl = new GridBagLayout();
		panel1.setLayout(gbl);
		GridBagConstraints constraints = new GridBagConstraints();

		
	//titre
		JLabel titre = new JLabel("GestiDon");
		titre.setFont(new Font("Courier New",Font.BOLD,32));
		titre.setBackground(Color.LIGHT_GRAY);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridwidth=2;
		constraints.gridx=0;
		constraints.gridy=0;	
		panel1.add(titre, constraints);
		
	//Bouton Superviseur
		//creation bouton superviseur
		JButton superviseur = new JButton();
		constraints.gridx=1;
		constraints.gridy=2;
		superviseur.setBackground(Color.ORANGE);
		superviseur.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{		
				//fermerFrame();
				//Creation d'une boite pour rentrer un mot de passe dans un JOptionPane personnalise
				JPanel panelPass = new JPanel();
				JLabel label = new JLabel("Password:");
				JPasswordField pass = new JPasswordField(10);
				panelPass.add(label);
				panelPass.add(pass);
				String[] options = new String[]{"OK", "Cancel"};
				int option = JOptionPane.showOptionDialog(null, panelPass, "Acces Superviseur",
				                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
				                         null, options, options[1]);
				if(option == 0)
				{
				    String password = new String(pass.getPassword());
				    String dpass = "Dons";
				 
				    if(password.equals(dpass))
				    {
				    	ouvrirFrameS();
				    	fermerFrame();
				    	JOptionPane.showMessageDialog(null, "Bienvenue!");
				    }else
				    {
				    	JOptionPane.showMessageDialog(null, "Mot de passe incorrect!");
				
				    }
				}
			}	
		});
		panel1.add(superviseur, constraints);
		//creation label
		JLabel ls = new JLabel("Superviseur");//label superviseur
		constraints.gridwidth=1;
		constraints.gridx=0;
		constraints.gridy=2;	
		panel1.add(ls, constraints);

		
	//Bouton Employe
		//creation bouton employe
		JButton employe = new JButton();
		constraints.gridx=1;
		constraints.gridy=3;
		employe.setBackground(Color.CYAN);
		employe.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent event)
			{	
				//hide main menu
				fermerFrame();
				//creation et ajout frame employe
				frameEmploye = new FrameEmploye();
				frameEmploye.setVisible(true);
				frameEmploye.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

			}
		});
		panel1.add(employe,constraints);
		//creation label employe
		JLabel le = new JLabel("Employe");
		constraints.gridx=0;
		constraints.gridy=3;
		panel1.add(le,constraints);
		
		
		
	//Bouton Donateur

		//craetion bouton donateur
		JButton donateur = new JButton();
		constraints.gridx=1;
		constraints.gridy=4;
		donateur.setBackground(Color.MAGENTA);
		donateur.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				//fermer frame
				fermerFrame();
				//creation&ouverture frame pour fenetre options des donateurs
				frameDonateur = new FrameDonateur();
				frameDonateur.setVisible(true);
				frameDonateur.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				frameDonateur.add(FrameDonateur.getPanelD());
			}
			
		});
		panel1.add(donateur,constraints);
		//craetion label donateur
		JLabel ld = new JLabel("Donateur");
		constraints.gridx=0;
		constraints.gridy=4;
		panel1.add(ld,constraints);
		
		
	//Bouton Benevole	
		//creationn bouton
		JButton benevole = new JButton();
		constraints.gridx=1;
		constraints.gridy=5;
		benevole.setBackground(Color.RED);
		benevole.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent event)
			{
				fermerFrame();
				frameBenevole = new FrameBenevole();
				frameBenevole.setVisible(true);
				frameBenevole.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				frameBenevole.add(FrameBenevole.getPanelB());				
			}
			
		});
		panel1.add(benevole,constraints);
		//creation label benevole
		JLabel lb = new JLabel("Benevole");
		constraints.gridx=0;
		constraints.gridy=5;
		panel1.add(lb,constraints);	

		
	//ajout bouton quitter &label
		JButton quit = new JButton();
		constraints.gridx=1;
		constraints.gridy=7;
		quit.setBackground(Color.GREEN);
		quit.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent event)
			{
				fermerFrame();		
			}		
		});
		panel1.add(quit,constraints);
		JLabel lq = new JLabel("Quitter");
		constraints.gridx=0;
		constraints.gridy=7;
		panel1.add(lq,constraints);
		
		//ajout panel
		add(panel1);
		
		//promt on close
				this.addWindowListener( new WindowAdapter() {
		            @Override
		            public void windowClosing(WindowEvent we) {
		                
		            	if(JOptionPane.showConfirmDialog(null, "Are you SUUURE? Des informations risquent d'être perdues")==JOptionPane.YES_OPTION)
		            	{
		                    System.exit(0);
		            	}      	
		            }
		        } );
		
	}
	//mettre visible le menu principal
	static void ouvrirFrame(){
		GestiDon.getFrame().setVisible(true);
	}
	//rendre invisible le menu principal
	void fermerFrame()
	{
		GestiDon.getFrame().setVisible(false);
	}
	//methode pouor prendre le frame des donateurs
		static FrameEmploye getFrameEmploye(){
			return frameEmploye;
		}
	//methode pouor prendre le frame des donateurs
	static FrameDonateur getFrameDonateur(){
		return frameDonateur;
	}
	//methode pour prendre le frame des benevoles
	static FrameBenevole getFrameBenevole(){
		return frameBenevole;
	}
	//methode pour ouvrir le frame superviseur
	void ouvrirFrameS()
	{
		GestiDon.getFrameSuperviseur().setVisible(true);
	}
}
