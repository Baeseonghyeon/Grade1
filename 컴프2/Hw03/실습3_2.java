package Hw03;

import java.awt.*;
import javax.swing.*;

class MyFrame32 extends JFrame{
	public MyFrame32() {
		setTitle("Absolute Position Test");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p=new JPanel();
		p.setLayout(null);
		JButton b1=new JButton("Button1");
		JButton b2=new JButton("Button2");
		JButton b3=new JButton("Button3");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		b1.setBounds(20,5,95,30);
		b2.setBounds(55,45,105,70);
		b3.setBounds(180,15,105,90);
		add(p);
		setVisible(true);
	}
}
public class 실습3_2 {

	public static void main(String[] args) {
		new MyFrame32();

	}

}
