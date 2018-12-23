package Hw04;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyPanel412 extends JPanel implements ActionListener{
	JButton button;
	Color color =new Color(0,0,0);
	public MyPanel412() {
		setLayout(new BorderLayout());
		button =new JButton("색상 변경");
		button.addActionListener(this);
		add(button,BorderLayout.SOUTH);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(10, 10, 210, 220);
	}
	public void actionPerformed(ActionEvent e) {
		color=new Color((int)(Math.random()*255.0),(int)(Math.random()*255.0),(int)(Math.random()*255.0));
		repaint();
	}
}
public class 실습4_1_2 extends JFrame{
	public 실습4_1_2() {
		setTitle("색상 실습");
		setSize(240,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new MyPanel412());
		setVisible(true);//??
		
	}
	public static void main(String[] args) {
		실습4_1_2 s=new 실습4_1_2();
	}

}
