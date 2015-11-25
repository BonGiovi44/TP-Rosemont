import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/
//classe pour le frame d'enregistrement de dons
public class FrameDon extends JFrame implements ChangeListener{
	static JPanel panelDon;
	static JLabel montant;
	static JComboBox nature;
	static JTextField date, livraison, quantite, donateur;
	static JSlider montantS;
	static JLabel ln, ld, lm,ll,lq, lc;
	static JButton confirmation, annuler;
	static double montantDouble;
	static String montantString;
	
	
	public FrameDon(){
		
		//titre&dimensions
		setTitle("GestiDon, Dons");
		setSize(600,500);
		
		//layout et creation panel & ajout
		panelDon = new JPanel();
		add(panelDon);
		GridBagLayout gbl = new GridBagLayout();
		panelDon.setLayout(gbl);
		GridBagConstraints constraints = new GridBagConstraints();

		//creation liste deroulante & ajout nature et son label
		ln = new JLabel("selectionnez le type de votre don");
		constraints.gridx=0;
		constraints.gridy=0;
		panelDon.add(ln,constraints);
		nature = new JComboBox();
		nature.setEditable(true); //possibilité de modifier texte
		nature.addItem("type1");
		nature.addItem("type2");
		constraints.gridx=1;
		constraints.gridy=0;
		panelDon.add(nature,constraints);
		
		//creation et ajout liste deroulante pour date
		ld = new JLabel("entrez la date ici");
		constraints.gridx=0;
		constraints.gridy=1;
		panelDon.add(ld,constraints);
		date = new JTextField(null,10);
		constraints.gridx=1;
		constraints.gridy=1;
		panelDon.add(date,constraints);
	
		//creation livraison et label
		ll = new JLabel("entrez la methode de livraison");
		constraints.gridx=0;
		constraints.gridy=2;
		panelDon.add(ll,constraints);
		livraison = new JTextField(null,10);
		constraints.gridx=1;
		constraints.gridy=2;
		panelDon.add(livraison,constraints);
		
		//creation slider pour montant
		lm = new JLabel("quel est la valeur de votre don?");
		constraints.gridx=0;
		constraints.gridy=3;
		panelDon.add(lm,constraints);
		montantS = new JSlider();
		montantS.setPaintTicks(true);
		montantS.setMajorTickSpacing(10);
		montantS.setMaximum(1000);
		montantS.setMinimum(0);
		montant= new JLabel(montantString);
		//montant.setSize(7, 1);
		montantS.addChangeListener(this);
		constraints.gridx=2;
		constraints.gridy=3;
		panelDon.add(montant, constraints);
		constraints.gridx=1;
		constraints.gridy=3;
		panelDon.add(montantS,constraints);
		
		//creation de la quantite
		lq = new JLabel("entrez la quantite");
		constraints.gridx=0;
		constraints.gridy=4;
		panelDon.add(lq,constraints);
		quantite = new JTextField(null,3);
		constraints.gridx=1;
		constraints.gridy=4;
		panelDon.add(quantite,constraints);
		
		//creation & ajout pour le donateur
		lc = new JLabel("veuillez entrer votre code de donateur");
		constraints.gridx=0;
		constraints.gridy=5;
		panelDon.add(lc,constraints);
		donateur = new JTextField(null,5);
		constraints.gridx=1;
		constraints.gridy=5;
		panelDon.add(donateur,constraints);
		
		//creation & ajout des boutons confirmations et annuler
		confirmation = new JButton("confirmer");
		confirmation.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{	
			/*	*/
				
				//Gestion.addDon((String)nature.getSelectedItem(),date.getText(), livraison.getText(), Integer.parseInt(quantite.getText()), montantR, Gestion.trouverDonateur(Integer.parseInt(donateur.getText())));
				fermerFrameDon();
				Frame.getFrameDonateur();
				Frame.getFrameDonateur().setVisible(true);
				
			}
		});
		constraints.gridx=0;
		constraints.gridy=6;
		panelDon.add(confirmation,constraints);
		annuler = new JButton("annuler");
		annuler.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{		
				fermerFrameDon();
				Frame.getFrameDonateur();
				Frame.getFrameDonateur().setVisible(true);

			}
		});
		constraints.gridx=1;
		constraints.gridy=6;
		panelDon.add(annuler,constraints);
		
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
	//methode pouor prendre la fenetre d'inscription de don
	static JPanel getPanelDon(){
		return panelDon;
	}
	//fermer fenetre don
		void fermerFrameDon()
		{
			FrameDonateur.getFrameDon().setVisible(false);
		}
		
	public void stateChanged(ChangeEvent e){
		montantDouble = (double) (montantS.getValue());
		DecimalFormat df = new DecimalFormat("###.00");
		montantString = df.format(montantDouble);
		montant.setText(montantString+"$");
		//System.out.println(montantS.getValue());
	}
}