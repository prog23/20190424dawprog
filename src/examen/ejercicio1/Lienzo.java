package examen.ejercicio1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Lienzo extends JPanel {

	private static final long serialVersionUID = 1L;
	
	
	public Lienzo(int width, int height) {
		setPreferredSize(new Dimension(width, height));
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}
	
}
