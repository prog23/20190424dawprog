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
		Graphics2D comp2D = (Graphics2D) g;
        comp2D.setColor(Color.BLACK);
        int señor = 10;
        switch(señor) {
        case 9:
        	Line2D.Float base = new Line2D.Float(470F, 470F, 30F, 470F);
        	comp2D.draw(base);
        	break;
        case 8:
        	Line2D.Float vertical = new Line2D.Float(30F, 470F, 30F, 30F);
        	comp2D.draw(vertical);
        	break;
        case 7:
        	Line2D.Float top = new Line2D.Float(30F, 30F, 350F, 30F);
        	comp2D.draw(top);
        	break;
        case 6:
        	Line2D.Float cuerda = new Line2D.Float(150F, 30F, 30F, 150F);
        	comp2D.draw(cuerda);
        	break;
        case 5:
        	Float cabeza = new Arc2D.Float(320F, 120F, 61F, 61F, 0F, 360F, Arc2D.OPEN);
        	comp2D.draw(cabeza);
        	break;
        case 4:
        	Line2D.Float cuerpo = new Line2D.Float(350F, 180F, 350F, 290F);
        	comp2D.draw(cuerpo);
        	break;
        case 3:
        	Line2D.Float brazo1 = new Line2D.Float(350F, 200F, 300F, 250F);
        	comp2D.draw(brazo1);
        	break;
        case 2:
        	Line2D.Float brazo2 = new Line2D.Float(350F, 200F, 400F, 250F);
        	comp2D.draw(brazo2);
        	break;
        case 1:
        	Line2D.Float pierna1 = new Line2D.Float(350F, 290F, 300F, 390F);
        	comp2D.draw(pierna1);
        	break;
        case 0:
        	Line2D.Float pierna2 = new Line2D.Float(350F, 290F, 400F, 390F);
        	comp2D.draw(pierna2);
        	break;
        }
      
        
	}
		
	}
	

