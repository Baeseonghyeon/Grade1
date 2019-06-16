import java.awt.*;

import javax.swing.*;
public class Home2 extends JFrame{
	private JLabel label;
	private JButton b1,b2,b3,b4,b5;
	private JPanel p1,p2,p3;
	public Home2() {
		setTitle("호텔 에약 어플리케이션");
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		label=new JLabel("자바 호텔에 오신것을 환영합니다. 숙박인원을 확인하세요");
		p1.add(label);
		p2.add(b1=new JButton("1명"));
		p2.add(b2=new JButton("2명"));
		p2.add(b3=new JButton("3명"));
		p2.add(b4=new JButton("4명"));
		p2.add(b5=new JButton("5명"));
		p3.add(p1);
		p3.add(p2);
		add(p3);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Home2();
	}

}
