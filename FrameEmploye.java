/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;
import java.awt.event.*;

//classe pour frame de l'employé
public class FrameEmploye extends JFrame{

	public FrameEmploye()
	{
		setTitle("Employe - Gestidon");
		setSize(600,500);
		
		JLabel lblNewLabel = new JLabel("GestiDon - Status:");
		getContentPane().add(lblNewLabel, BorderLayout.SOUTH);
		
		JToolBar toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.NORTH);
		
		
		JPanel panelEnr = new JPanel();
		getContentPane().add(panelEnr, BorderLayout.WEST);
		GridBagLayout gbl_panelEnr = new GridBagLayout();
		gbl_panelEnr.columnWidths = new int[]{137, 86, 280, 0};
		gbl_panelEnr.rowHeights = new int[]{19, 20, 0, 20, 20, 20, 20, 20, 0, 0};
		gbl_panelEnr.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelEnr.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		gbc_lblSalire.insets = new Insets(0, 0, 5, 5);
		gbc_lblSalire.gridx = 0;
		gbc_lblSalire.gridy = 7;
		panelEnr.add(lblSalire, gbc_lblSalire);
		
		JTextField champSalaire = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.anchor = GridBagConstraints.NORTH;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 7;
		panelEnr.add(champSalaire, gbc_textField_4);
		champSalaire.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Code");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 8;
		panelEnr.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JTextField champCode = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 0, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 8;
		panelEnr.add(champCode, gbc_textField_8);
		champCode.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmMenu = new JMenuItem("Acceuil");
		mntmMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				GestiDon.getFrame().setVisible(true);
				Frame.getFrameEmploye().setVisible(false);
			}
		});
		mnNewMenu.add(mntmMenu);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.lang.System.exit(0);
				
			}
		});
		JButton btnEditer = new JButton("Sauvegarger");
		btnEditer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employe unEmploye = Gestion.trouverEmploye(Integer.parseInt(champCode.getText()));
				unEmploye.setNom(champNom.getText());
				unEmploye.setPrenom(champPrenom.getText());
				unEmploye.setCouriel(champCouriel.getText());
				unEmploye.setAdresse(champAdresse.getText());
				unEmploye.setTelephone(champNumero.getText());
			}
		});
		
		toolBar.add(btnEditer);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut);
		
		JButton btnInfo = new JButton("Information");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Employe unEmploye = Gestion.trouverEmploye(Integer.parseInt(champCode.getText()));
				champNom.setText(unEmploye.getNom());
				champPrenom.setText(unEmploye.getPrenom());
				champCouriel.setText(unEmploye.getCouriel());
				champAdresse.setText(unEmploye.getAdresse());
				champNumero.setText(unEmploye.getTelephone());
				champTH.setText(Integer.toString(unEmploye.getTauxHoraire()));
				champHT.setText(Integer.toString(unEmploye.getHeuresTravaille()));
				
				
			}
		});
		toolBar.add(btnInfo);
		
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
