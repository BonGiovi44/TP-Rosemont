/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.border.TitledBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;


//class pour le menu du superviseur
public class FrameSuperviseur extends JFrame{

	public FrameSuperviseur()
	{
		Superviseur unSuperviseur = new Superviseur();
		setTitle("Superviseur - Gestidon");
		//Precise la taille par default du frame sup.
		setBounds(100, 100, 502, 371);
		//Set la taille du frame au maximum
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//Applique le look de windows à l'application! 
		try{
			 UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			 } catch (Exception e) {System.out.println("Erreur de look and feel");} 
		//Creation d'un conteneur pour chaque onglets
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		//Creation d'un panel pour le premier onglet
		JPanel panelEnr = new JPanel();
		TitledBorder panelEnrBorder = new TitledBorder("Informations Employes");//Creations d'un cadre avec titre pour le panel enr. employe 
		panelEnr.setBorder(panelEnrBorder);//Ajout du cadre a enr. Employe
		tabbedPane.addTab("Enregistrer Emp.", null, panelEnr, null);//Ajout du premier onglet dans son conteneur
		GridBagLayout gbl_panelEnr = new GridBagLayout();//Creation d'un gridbag Layout pour le panel enr. emplo.
		gbl_panelEnr.columnWidths = new int[]{137, 86, 280, 0};
		gbl_panelEnr.rowHeights = new int[]{19, 20, 0, 20, 20, 20, 20, 20, 0};
		gbl_panelEnr.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelEnr.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelEnr.setLayout(gbl_panelEnr);
		
		//Creation d'un label pour nom
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);//On ajuste l'alignement 
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();//Creation de contraintes
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelEnr.add(lblNewLabel_1, gbc_lblNewLabel_1);//Ajoute le label dans le premier onglet
		
		//Creation d'un champ de texte pour le nom
		JTextField champNom = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panelEnr.add(champNom, gbc_textField);
		champNom.setColumns(10);
		
		//Creation d'un label pour le prenom
		JLabel lblNewLabel_2 = new JLabel("Prenom");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panelEnr.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		//Creation d'un champ de texte pour prenom
		JTextField champPrenom = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panelEnr.add(champPrenom, gbc_textField_1);
		champPrenom.setColumns(10);
		
		//Creation d'un champ de texte pour le numero de telephone
		JLabel lblNumero = new JLabel("Numero de telephone");
		GridBagConstraints gbc_lblNumero = new GridBagConstraints();
		gbc_lblNumero.anchor = GridBagConstraints.EAST;
		gbc_lblNumero.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero.gridx = 0;
		gbc_lblNumero.gridy = 2;
		panelEnr.add(lblNumero, gbc_lblNumero);
		
		//Creation d'un champ de texte pour le numero de telephone
		JTextField champNumero = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 2;
		panelEnr.add(champNumero, gbc_textField_7);
		champNumero.setColumns(10);
		
		//Creation d'un label pour l'adresse
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblAdresse = new GridBagConstraints();
		gbc_lblAdresse.anchor = GridBagConstraints.EAST;
		gbc_lblAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse.gridx = 0;
		gbc_lblAdresse.gridy = 3;
		panelEnr.add(lblAdresse, gbc_lblAdresse);
		
		//Creation d'un champ de texture pour l'adresse
		JTextField champAdresse = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		panelEnr.add(champAdresse, gbc_textField_2);
		champAdresse.setColumns(10);
		
		//Creation d'un label pour le couriel
		JLabel lblNewLabel_3 = new JLabel("Couriel");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		panelEnr.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		//Creation d'un champ de texture pour le couriel
		JTextField champCouriel = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		panelEnr.add(champCouriel, gbc_textField_3);
		champCouriel.setColumns(10);
		
		//Creation d'un label pour les heures travaille
		JLabel lblHeuresTravailles = new JLabel("Heures travaill\u00E9es");
		GridBagConstraints gbc_lblHeuresTravailles = new GridBagConstraints();
		gbc_lblHeuresTravailles.anchor = GridBagConstraints.EAST;
		gbc_lblHeuresTravailles.insets = new Insets(0, 0, 5, 5);
		gbc_lblHeuresTravailles.gridx = 0;
		gbc_lblHeuresTravailles.gridy = 5;
		panelEnr.add(lblHeuresTravailles, gbc_lblHeuresTravailles);
		
		//Creation d'un champ de texture pour les heures travaille
		JTextField champHT = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.anchor = GridBagConstraints.NORTH;
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		panelEnr.add(champHT, gbc_textField_5);
		champHT.setColumns(10);
		
		//Creation d'un label pour le taux horaire
		JLabel lblTauxHoraire = new JLabel("Taux Horaire");
		GridBagConstraints gbc_lblTauxHoraire = new GridBagConstraints();
		gbc_lblTauxHoraire.anchor = GridBagConstraints.EAST;
		gbc_lblTauxHoraire.insets = new Insets(0, 0, 5, 5);
		gbc_lblTauxHoraire.gridx = 0;
		gbc_lblTauxHoraire.gridy = 6;
		panelEnr.add(lblTauxHoraire, gbc_lblTauxHoraire);
		
		//Creation d'un champ de texture pour le taux horaire
		JTextField champTH = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.anchor = GridBagConstraints.NORTH;
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		panelEnr.add(champTH, gbc_textField_6);
		champTH.setColumns(10);
		
		//Creation d'un label pour le salaire
		JLabel lblSalire = new JLabel("Salaire");
		GridBagConstraints gbc_lblSalire = new GridBagConstraints();
		gbc_lblSalire.anchor = GridBagConstraints.EAST;
		gbc_lblSalire.insets = new Insets(0, 0, 0, 5);
		gbc_lblSalire.gridx = 0;
		gbc_lblSalire.gridy = 7;
		panelEnr.add(lblSalire, gbc_lblSalire);
		
		//Creation d'un champ de texture pour le salaire
		JTextField champSalaire = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.anchor = GridBagConstraints.NORTH;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 7;
		panelEnr.add(champSalaire, gbc_textField_4);
		champSalaire.setColumns(10);
		
		//Creation d'un label qui sert de barre de status 
		JLabel statusBarLbl = new JLabel("GestiDon - Status:");
		getContentPane().add(statusBarLbl, BorderLayout.SOUTH);//Contrainte pour que le label reste au sud
		//Fin 1.o-------------------------------<
		
		
		//Creation Deuxieme onglet(Employes) et ses elements
		JPanel panel_Emp = new JPanel();
		tabbedPane.addTab("Employes", null, panel_Emp, "Affiche les infos des employes");//Conteneur pour l'onglet employe
		panel_Emp.setLayout(new BorderLayout(0, 0));//Ajout d'un border layout a l'onglet employe
		
		JLabel label_emp = new JLabel("Informations Employe");
		panel_Emp.add(label_emp, BorderLayout.NORTH);
		
		JScrollPane emp_scrollPane = new JScrollPane();//Creation d'une barre de défilement en cas d'un d'debordement des informations
		panel_Emp.add(emp_scrollPane, BorderLayout.CENTER);
		
		JTextPane emp_textPane = new JTextPane();
		emp_scrollPane.setViewportView(emp_textPane);
		//Fin 2.0-------------------------------<
		
		
		//Creation troisieme onglet(Benevoles) et ses elements
		JPanel panel_Ben = new JPanel();
		tabbedPane.addTab("Benevoles", null, panel_Ben, "Affiche les infos des benevoles");
		panel_Ben.setLayout(new BorderLayout(0, 0));
		
		JLabel label_ben = new JLabel("Informations Benevoles: ");
		panel_Ben.add(label_ben, BorderLayout.NORTH);
		
		JScrollPane ben_scrollPane = new JScrollPane();
		panel_Ben.add(ben_scrollPane, BorderLayout.CENTER);
		//Fin 3.o-------------------------------<
		
		
		JTextPane ben_textPane = new JTextPane();
		ben_scrollPane.setViewportView(ben_textPane);
		
		//Creation quatrieme onglet et ses elements
		JPanel panel_Don = new JPanel();
		tabbedPane.addTab("Donateurs", null, panel_Don, "Affiche les infos donateurs");
		panel_Don.setLayout(new BorderLayout(0, 0));
		
		JLabel label_don = new JLabel("Informations Donateurs:");
		panel_Don.add(label_don, BorderLayout.NORTH);
		
		JScrollPane don_scrollPane = new JScrollPane();
		panel_Don.add(don_scrollPane, BorderLayout.CENTER);
		
		JTextPane don_textPane = new JTextPane();
		don_scrollPane.setViewportView(don_textPane);
		//Fin 4.o-------------------------------<
		
		
		//Creation cinquieme onglet et ses elements(Histogrammes)
		JPanel panel_onglet_Histo = new JPanel();
		panel_onglet_Histo.setLayout(new BorderLayout(0, 0));
		tabbedPane.addTab("Histogrammes", null,panel_onglet_Histo,"Histogrammes dynamique");
		JPanel panelHisto = new JPanel();//Onglet contenant l'histogramme
		panelHisto.setBorder(new TitledBorder("Histogramme"));
		panelHisto.setLayout(new BorderLayout(0, 0));
		panel_onglet_Histo.add(panelHisto,BorderLayout.CENTER);
		
		//Creation d'un autre panel interne pour contenir boutons options
		JPanel histoOptionPanel = new JPanel();
		histoOptionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		histoOptionPanel.setBorder(new TitledBorder("Options"));//Cadre du panel option
		panel_onglet_Histo.add(histoOptionPanel,BorderLayout.NORTH);//Ajout du panel option au nord du panel principale
		//Creation et ajout du bouton Generer
		JButton btnGenerer = new JButton("Générer");
		histoOptionPanel.add(btnGenerer);
		
		//Creer un dataset pour l'histogramme
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		//Creation de notre histogramme
		JFreeChart chart = ChartFactory.createBarChart(" ", "type", "nombre de personnes", dataset);
		CategoryPlot p=chart.getCategoryPlot();
		p.setRangeGridlinePaint(Color.BLUE);
		//Permet de genere l'histo!
		btnGenerer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				statusBarLbl.setText("GestiDon - Status: Creation De l'histogramme");
				//On instancie le dataset ici
				dataset.setValue(Gestion.employes.size(), "Employes", "Employe");
				dataset.setValue(Gestion.benevoles.size(), "Benevoles", "Bénévole");
				dataset.setValue(Gestion.donateurs.size(), "Donateurs", "Donateur");
				//Creation d'un panel special pour y placer notre histogramme
				ChartPanel chartPanel = new ChartPanel(chart);
				chartPanel.setPreferredSize(new Dimension(500,300));
				//On Entre l'hitogramme finalement dans le panel afin de l'afficher
				panelHisto.add(chartPanel);
				//on passe au silence le bouton generer parcequ'il n'a plus de raison d'être
				btnGenerer.setEnabled(false);
				statusBarLbl.setText("GestiDon - Status: Histogramme creer avec success");
			}
		});
		//Creation et ajout du bouton Rafraichir
		JButton btnRafraichir = new JButton("Rafraichir");
		histoOptionPanel.add(btnRafraichir);//Ajout du bouton rafraichir au panel d'option
		btnRafraichir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dataset.setValue(Gestion.employes.size(), "Employes", "Employe");
				dataset.setValue(Gestion.benevoles.size(), "Benevoles", "Bénévole");
				dataset.setValue(Gestion.donateurs.size(), "Donateurs", "Donateur");
			}
		});
		//Fin 5.o-------------------------------<
		
		
		//Creation d'une barre d'outil
		JToolBar toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.NORTH);
		//Creation du premier bouton de la barre d'outil(Enregistrer)
		JButton btnEnregistrer = new JButton("Enregistrer");
		//Gestionnaire d'evenement du bouton enregistrer
		btnEnregistrer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				unSuperviseur.EnregistrerEmploye(champNom.getText(),
						champPrenom.getText(),
						champCouriel.getText(),
						champAdresse.getText(),
						champNumero.getText(),
						Integer.parseInt(champHT.getText()),
						Integer.parseInt(champTH.getText()),
						Integer.parseInt(champSalaire.getText())
						);
				JOptionPane.showMessageDialog(null, "Employe enregistrer avec succes son code d'employe est: "+(Gestion.personnesAjoutees));
				
			}
		});
		
		toolBar.add(btnEnregistrer);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut);
		//Creation du deuxieme bouton de la barre d'outil
		JButton btnLister = new JButton("Lister");
		//Gestionnaire d'evenement du bouton lister
		btnLister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp_textPane.setText(Gestion.getListeEmploye());
				ben_textPane.setText(Gestion.getListeBenevoles());
				don_textPane.setText(Gestion.getListeDonateur());
			}
		});
		toolBar.add(btnLister);//Ajout du bouton lister a la barre d'outil
		
		//Creation d'une barre de menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		//Creation du bouton menu Fichier
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		//Creation  de l'option acceuil de menu fichier
		JMenuItem mntmMenu = new JMenuItem("Accueil");
		mntmMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestiDon.getFrameSuperviseur().setVisible(false);
				GestiDon.getFrame().setVisible(true);
			}
		});
		mnNewMenu.add(mntmMenu);
		//Creation de l'option quitter du menu fichier
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.lang.System.exit(0);//Permet de quitter le programme en toute sécuriter! 
			}
		});
		mnNewMenu.add(mntmQuitter);
		//Permet de verifier si on veut vraiment quitter
		this.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                
            	if(JOptionPane.showConfirmDialog(null, "Êtes-vous sûre de vouloir quitter?")==JOptionPane.YES_OPTION)
            	{
                    System.exit(0);
            	}      	
            }
        } );
	
	}

}
