import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/
//class pour le frame donateur et ses options+évènements
public class FrameDonateur extends JFrame{

	static JButton enregistrerD, donner,retour;
	static Box panelD;
	static FrameDon frameDon;
	static FrameFormulaire frameFormulaire;
	static boolean t;
	
	public FrameDonateur(){
		//titre&dimensions de la fenetre de l'option donateur
		setTitle("GestiDon, Donateur");
		setSize(300,500);
		
		//craetion panelD&Layout
		panelD = Box.createVerticalBox();
		panelD.add(Box.createVerticalStrut(20));
		//Option de s'enregistrer en JButton
		enregistrerD = new JButton("Je veux m'enregistrer");
		enregistrerD.setAlignmentX(enregistrerD.CENTER_ALIGNMENT);
		enregistrerD.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				//fermeture frame dontauer pour formulaire d'enregistremetn
				Gestion.iType(t=true);
				fermerFrameD();
				frameFormulaire = new FrameFormulaire();
				frameFormulaire.setVisible(true);
				frameFormulaire.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				frameFormulaire.add(FrameFormulaire.getFrameF());
			}
		});
		panelD.add(enregistrerD);
		panelD.add(Box.createVerticalStrut(20));
		
		//option d'enregistrer un don
		donner = new JButton("Je veux enregistrer mon don");
		donner.setAlignmentX(donner.CENTER_ALIGNMENT);
		donner.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{		
				//creation&ouverture frame pour fenetre options des donateurs
				fermerFrameD();
				frameDon = new FrameDon();
				frameDon.setVisible(true);
				frameDon.add(FrameDon.getPanelDon());
			}
		});
		panelD.add(donner);
		panelD.add(Box.createVerticalStrut(20));
		
		//option de retourner au menu principal
		retour = new JButton("retour au MENU principal");
		retour.setAlignmentX(retour.CENTER_ALIGNMENT);
		retour.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				fermerFrameD();
				Frame.ouvrirFrame();
			}
		});
		panelD.add(retour);
		
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
	//methode pur prendre panel du frame des donateurs
	static Box getPanelD(){
		return panelD;
	}
	//methode pouor prendre le frame des donateurs

	//fermeture frameD
	void fermerFrameD()
	{
		Frame.getFrameDonateur().setVisible(false);
	}
	static FrameDon getFrameDon(){
		return frameDon;
	}

}