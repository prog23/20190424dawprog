package examen.ejercicio1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Arc2D.Float;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;


public class Lienzo extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private int bandera = 0;
	
	public Lienzo(int width, int height) {
		setPreferredSize(new Dimension(width, height));
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);		
		Graphics2D g1 = (Graphics2D) g;
		Line2D l1 = new Line2D.Float(470, 470, 30, 470);
		g1.draw(l1);
		Line2D l2 = new Line2D.Float(30, 470, 30, 30);
		g1.draw(l2);
		Line2D l3 = new Line2D.Float(30, 30, 350, 30);	
		g1.draw(l3);
		Line2D l4 =new Line2D.Float(150, 30, 30, 150);
		g1.draw(l4);
		Line2D l5 = new Line2D.Float(350, 30, 350, 120);
		g1.draw(l5);
		Arc2D l6 =new Arc2D.Float(320, 120, 61, 61, 0, 360, Arc2D.OPEN);
		g1.draw(l6);
		Line2D l7 = new Line2D.Float(350, 180, 350, 290);
		g1.draw(l7);
		Line2D l8 =new Line2D.Float(350, 200, 300, 250);
		g1.draw(l8);
		Line2D l9 = new Line2D.Float(350, 200, 400, 250);
		g1.draw(l9);
		Line2D l10 =new Line2D.Float(350, 290, 300, 390);
		g1.draw(l10);
		Line2D l11 = new Line2D.Float(350, 290, 400, 390);
		g1.draw(l11);
        }
      
        
	}
		
	
	

