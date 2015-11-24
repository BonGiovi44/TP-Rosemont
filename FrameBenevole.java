import java.awt.*;
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
//classe pour frame option bénévole
public class FrameBenevole extends JFrame{
	static JLabel lNom;
	static JTextField nom;
	static JButton enregistrerB, retirer,retour;
	static Box panelB;//box panelB
	static boolean t;
	
	public FrameBenevole(){
		//titre&dimensions de la fenetre de l'option donateur
		setTitle("GestiDon, Benevole");
		setSize(300,400);
		
		//craetion panelB&Layout
		panelB = Box.createVerticalBox();
		panelB.add(Box.createVerticalStrut(20));
		
		//Option de s'enregistrer en JButton
		enregistrerB = new JButton("Je veux m'enregistrer");
		enregistrerB.setAlignmentX(enregistrerB.CENTER_ALIGNMENT);
		enregistrerB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				//fermeture frame benevole pour formulaire d'enregistremetn
				Gestion.iType(t=false);
				fermerFrameB();
				FrameDonateur.frameFormulaire = new FrameFormulaire();
				FrameDonateur.frameFormulaire.setVisible(true);
				FrameDonateur.frameFormulaire.add(FrameFormulaire.getFrameF());
			}
		});
		panelB.add(enregistrerB);
		panelB.add(Box.createVerticalStrut(20));
		
		//option de se retirer de la liste des benevoles
		retirer = new JButton("Je veux retirer mon nom");
		retirer.setAlignmentX(retirer.CENTER_ALIGNMENT);
		retirer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				int code = Integer.parseInt(JOptionPane.showInputDialog("Veuiller entrer votre code de benevole"));
				if(JOptionPane.showConfirmDialog(null, "Etes-vous sûr de vouloir vous retirer?")==JOptionPane.YES_OPTION)
				{
					Gestion.retirer(1, code);
					JOptionPane.showMessageDialog(null, "Operation reussi.");
				}
			}
		});
		panelB.add(retirer);
		panelB.add(Box.createVerticalStrut(20));
		
		//option de retourner au menu principal
		retour = new JButton("Menu principal");
		retour.setAlignmentX(CENTER_ALIGNMENT);
		retour.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				fermerFrameB();
				Frame.ouvrirFrame();
			}
		});
		panelB.add(retour);

		add(panelB);
		
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
	static Box getPanelB(){
		return panelB;
	}
	//fermeture frameD
	void fermerFrameB()
	{
		Frame.getFrameBenevole().setVisible(false);
	}

}