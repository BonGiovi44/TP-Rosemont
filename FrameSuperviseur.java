/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//class pour le menu du superviseur
public class FrameSuperviseur extends JFrame{

	
	public FrameSuperviseur()
	{
		Superviseur unSuperviseur = new Superviseur();
		setTitle("Superviseur - Gestidon");
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
		
		JPanel panelEnr = new JPanel();
		tabbedPane.addTab("Enregistrer.Emp", null, panelEnr, null);
		GridBagLayout gbl_panelEnr = new GridBagLayout();
		gbl_panelEnr.columnWidths = new int[]{137, 86, 280, 0};
		gbl_panelEnr.rowHeights = new int[]{19, 20, 0, 20, 20, 20, 20, 20, 0};
		gbl_panelEnr.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelEnr.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelEnr.setLayout(gbl_panelEnr);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelEnr.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JTextField champNom = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panelEnr.add(champNom, gbc_textField);
		champNom.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Prenom");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panelEnr.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JTextField champPrenom = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panelEnr.add(champPrenom, gbc_textField_1);
		champPrenom.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		GridBagConstraints gbc_lblNumero = new GridBagConstraints();
		gbc_lblNumero.anchor = GridBagConstraints.EAST;
		gbc_lblNumero.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero.gridx = 0;
		gbc_lblNumero.gridy = 2;
		panelEnr.add(lblNumero, gbc_lblNumero);
		
		JTextField champNumero = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 2;
		panelEnr.add(champNumero, gbc_textField_7);
		champNumero.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblAdresse = new GridBagConstraints();
		gbc_lblAdresse.anchor = GridBagConstraints.EAST;
		gbc_lblAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse.gridx = 0;
		gbc_lblAdresse.gridy = 3;
		panelEnr.add(lblAdresse, gbc_lblAdresse);
		
		JTextField champAdresse = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		panelEnr.add(champAdresse, gbc_textField_2);
		champAdresse.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Couriel");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		panelEnr.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JTextField champCouriel = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		panelEnr.add(champCouriel, gbc_textField_3);
		champCouriel.setColumns(10);
		
		JLabel lblHeuresTravailles = new JLabel("Heures travaill\u00E9es");
		GridBagConstraints gbc_lblHeuresTravailles = new GridBagConstraints();
		gbc_lblHeuresTravailles.anchor = GridBagConstraints.EAST;
		gbc_lblHeuresTravailles.insets = new Insets(0, 0, 5, 5);
		gbc_lblHeuresTravailles.gridx = 0;
		gbc_lblHeuresTravailles.gridy = 5;
		panelEnr.add(lblHeuresTravailles, gbc_lblHeuresTravailles);
		
		JTextField champHT = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.anchor = GridBagConstraints.NORTH;
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		panelEnr.add(champHT, gbc_textField_5);
		champHT.setColumns(10);
		
		JLabel lblTauxHoraire = new JLabel("Taux Horaire");
		GridBagConstraints gbc_lblTauxHoraire = new GridBagConstraints();
		gbc_lblTauxHoraire.anchor = GridBagConstraints.EAST;
		gbc_lblTauxHoraire.insets = new Insets(0, 0, 5, 5);
		gbc_lblTauxHoraire.gridx = 0;
		gbc_lblTauxHoraire.gridy = 6;
		panelEnr.add(lblTauxHoraire, gbc_lblTauxHoraire);
		
		JTextField champTH = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.anchor = GridBagConstraints.NORTH;
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		panelEnr.add(champTH, gbc_textField_6);
		champTH.setColumns(10);
		
		JLabel lblSalire = new JLabel("Salaire");
		GridBagConstraints gbc_lblSalire = new GridBagConstraints();
		gbc_lblSalire.anchor = GridBagConstraints.EAST;
		gbc_lblSalire.insets = new Insets(0, 0, 0, 5);
		gbc_lblSalire.gridx = 0;
		gbc_lblSalire.gridy = 7;
		panelEnr.add(lblSalire, gbc_lblSalire);
		
		JTextField champSalaire = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.anchor = GridBagConstraints.NORTH;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 7;
		panelEnr.add(champSalaire, gbc_textField_4);
		champSalaire.setColumns(10);
		
		JPanel panel_Emp = new JPanel();
		tabbedPane.addTab("Employes", null, panel_Emp, null);
		panel_Emp.setLayout(new BorderLayout(0, 0));
		
		JLabel label_emp = new JLabel("Informations Employe");
		panel_Emp.add(label_emp, BorderLayout.NORTH);
		
		JScrollPane emp_scrollPane = new JScrollPane();
		panel_Emp.add(emp_scrollPane, BorderLayout.CENTER);
		
		JTextPane emp_textPane = new JTextPane();
		emp_scrollPane.setViewportView(emp_textPane);
		
		JPanel panel_Ben = new JPanel();
		tabbedPane.addTab("Benevoles", null, panel_Ben, null);
		panel_Ben.setLayout(new BorderLayout(0, 0));
		
		JLabel label_ben = new JLabel("Informations Benevoles: ");
		panel_Ben.add(label_ben, BorderLayout.NORTH);
		
		JScrollPane ben_scrollPane = new JScrollPane();
		panel_Ben.add(ben_scrollPane, BorderLayout.CENTER);
		
		JTextPane ben_textPane = new JTextPane();
		ben_scrollPane.setViewportView(ben_textPane);
		
		JPanel panel_Don = new JPanel();
		tabbedPane.addTab("Donateurs", null, panel_Don, null);
		panel_Don.setLayout(new BorderLayout(0, 0));
		
		JLabel label_don = new JLabel("Informations Donateurs:");
		panel_Don.add(label_don, BorderLayout.NORTH);
		
		JScrollPane don_scrollPane = new JScrollPane();
		panel_Don.add(don_scrollPane, BorderLayout.CENTER);
		
		JTextPane don_textPane = new JTextPane();
		don_scrollPane.setViewportView(don_textPane);
		
		JLabel lblNewLabel = new JLabel("GestiDon - Status:");
		getContentPane().add(lblNewLabel, BorderLayout.SOUTH);
		
		JToolBar toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
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
		
		JButton btnLister = new JButton("Lister");
		btnLister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp_textPane.setText(Gestion.getListeEmploye());
				ben_textPane.setText(Gestion.getListeBenevoles());
				don_textPane.setText(Gestion.getListeDonateur());
			}
		});
		toolBar.add(btnLister);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmMenu = new JMenuItem("Accueil");
		mntmMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestiDon.getFrameSuperviseur().setVisible(false);
				GestiDon.getFrame().setVisible(true);
			}
		});
		mnNewMenu.add(mntmMenu);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.lang.System.exit(0);
			}
		});
		mnNewMenu.add(mntmQuitter);
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
	
}
