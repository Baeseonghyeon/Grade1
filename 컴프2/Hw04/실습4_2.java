package Hw04;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.*;

import javax.swing.*;

public class 실습4_2 extends JFrame{
	public 실습4_2() {
		setSize(600,130);
		setTitle("Java 2D Shapes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new  MyPanel42();
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 실습4_2();
	}

}
class MyPanel42 extends JPanel{
	ArrayList<Shape> shapeArray=new ArrayList<Shape>();
	
	public MyPanel42() {
		Shape s;
		s=new Rectangle2D.Float(10,10,70,80);
		shapeArray.add(s);
		
		s=new RoundRectangle2D.Float(110,10,70,80,20,20);
		shapeArray.add(s);
		
		s=new Ellipse2D.Float(210,10,80,80);
		shapeArray.add(s);
		
		s=new Arc2D.Float(310,10,80,80,90,90,Arc2D.OPEN);
		shapeArray.add(s);
		
		s=new Arc2D.Float(410,10,80,80,0,180,Arc2D.CHORD);
		shapeArray.add(s);
		
		s=new Arc2D.Float(510,10,80,80,45,90,Arc2D.PIE);
		shapeArray.add(s);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 =(Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		for(Shape s: shapeArray) {
			g2.draw(s);
		}
	}
}