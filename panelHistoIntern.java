import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.geom.Rectangle2D;

import javax.swing.border.TitledBorder;
/*Cette classe sert a creer des panels speciaux pour qu'on puisse
 dessiner notre histogramme facilement
 */
class panelHistoIntern extends JPanel{
	//Besoin de ces attributs afin d'initialiser la position des rectangles
	public int rect1Posx;
	public int rect1Posy;
	public int rect2Posx;
	public int rect2Posy;
	public int rect3Posx;
	public int rect3Posy;
		
	public panelHistoIntern(int pos1x,int pos1y,int pos2x,int pos2y,int pos3x,int pos3y)
	{
		this.rect1Posx = pos1x;
		this.rect1Posy = pos1y;
		this.rect2Posx = pos2x;
		this.rect2Posy = pos2y;
		this.rect3Posx = pos3x;
		this.rect3Posy = pos3y;
	}
	//Cette fonction nous permet de dessiner dans un element specifique
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.RED);//set la couleur de notre brosse
		
		//Creation du premier rectangle employe
		Rectangle2D rectEmp = new Rectangle2D.Double(rect1Posx,rect1Posy,20,50);
		g2d.draw(rectEmp);//Dessine le premier rectangle
	}
	
}
