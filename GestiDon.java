/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//classe qui exécute la méthode main (et crée des frame)
public class GestiDon {
	static Frame frame;
	public static FrameSuperviseur frameSuperviseur;
	//creation du frame et ouverture
	public static void main(String[] args) {
		frame = new Frame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		 try {
	            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 
		/* frame.addWindowListener(new java.awt.event.WindowAdapter(){
			 @Override
			 public void windowClosing(java.awt.event.WindowEvent windowEvent){
				 if(JOptionPane.showConfirmDialog(null,"Etes-vous sur de vouloir de fermer l'application de cette façon? Il y a un risque de perte d'informations.")==JOptionPane.YES_OPTION){
				 }else{
					 frame.set;
				 }
			 }
		 });*/
		frameSuperviseur = new FrameSuperviseur();
		frameSuperviseur.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		

	}
	
	//methode puor prendre le frame (menu principal)
	static Frame getFrame()
	{		
		return frame;
	}
	//methode  pour prendre frame superviseur
	static FrameSuperviseur getFrameSuperviseur()
	{
		return frameSuperviseur;
	}

}
