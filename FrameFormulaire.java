/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//classe pour les formulaires de bénévoles et donateurs
public class FrameFormulaire extends JFrame {
	//declarations
	static JLabel lNom, lPrenom, lAdresse, lTel;
	static JPanel panelF;
	static JTextField nom, prenom, adresse, tel;
	static JButton confirm, cancel;
	static JDialog dialog;
	static String type;

	public FrameFormulaire(){
		//caracteristiques du frame
		setTitle("Formulaire");
		setSize(500,500);
		
		//creation et ajout du panel
		panelF = new JPanel();
		add(panelF);
		
		//Layout & constraints
		GridBagLayout gbl = new GridBagLayout();
		panelF.setLayout(gbl);
		GridBagConstraints constraints = new GridBagConstraints();
		
		//creation des components & ajouts avec les contraintes
		lNom = new JLabel("Nom");
		constraints.gridx=0;
		constraints.gridy=0;
		panelF.add(lNom, constraints);
		lPrenom = new JLabel("Prenom");
		constraints.gridx=0;
		constraints.gridy=1;
		panelF.add(lPrenom, constraints);
		lAdresse = new JLabel("Adresse");
		constraints.gridx=0;
		constraints.gridy=2;
		panelF.add(lAdresse, constraints);
		lTel = new JLabel("Numero de telephone");
		constraints.gridx=0;
		constraints.gridy=3;
		panelF.add(lTel, constraints);
		nom = new JTextField("Entrez votre nom");
		constraints.gridx=1;
		constraints.gridy=0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		panelF.add(nom, constraints);
		prenom = new JTextField("Entrez votre prenom");
		constraints.gridx=1;
		constraints.gridy=1;
		panelF.add(prenom, constraints);
		adresse = new JTextField("Entrez votre adresse ici");
		constraints.gridx=1;
		constraints.gridy=2;
		panelF.add(adresse, constraints);
		tel = new JTextField("Entrez vore numero de telephone ici");
		constraints.gridx=1;
		constraints.gridy=3;
		panelF.add(tel, constraints);
		confirm = new JButton("confirmer");
		constraints.gridx=0;
		constraints.gridy=4;
		panelF.add(confirm, constraints);
		cancel = new JButton("annuler");
		constraints.gridx=1;
		constraints.gridy=4;
		panelF.add(cancel, constraints);//*/
	
		
		//event confirmer
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				if(JOptionPane.showConfirmDialog(null,"Etes-vous sur que les informations sont exactes?")==JOptionPane.YES_OPTION){
					if(Gestion.type==true){
						Gestion.addDonateur(nom.getText(), prenom.getText(), adresse.getText(), tel.getText());
						fermerFrameF();
						Frame.getFrameDonateur();
						Frame.getFrameDonateur().setVisible(true);
						JOptionPane.showMessageDialog(null,"Bienvenue ! Votre code est:"+(Gestion.personnesAjoutees+1));
					}else{
						Gestion.addBenevole(nom.getText(), prenom.getText(), adresse.getText(), tel.getText());
						fermerFrameF();
						Frame.getFrameBenevole();
						Frame.getFrameBenevole().setVisible(true);
						JOptionPane.showMessageDialog(null,"Bienvenue ! Votre code est:"+(Gestion.personnesAjoutees+1));
					}//fin else por identifier benevole ou donateur
				}//fin if JOptionYesNO
			}
		});
		//event annuler
		cancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				if(JOptionPane.showConfirmDialog(null,"Tous les informations seront perdues ! Etes-vous sur de vouloir annuler l'inscription?")==JOptionPane.YES_OPTION)
					{
						fermerFrameF();
						GestiDon.getFrame();
						GestiDon.getFrame().setVisible(true);
					}
			}
		});//*/
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
	
	static JPanel getFrameF(){
		return panelF;
	}
	
	void fermerFrameF(){
		FrameDonateur.frameFormulaire.setVisible(false);
	}
	
}

