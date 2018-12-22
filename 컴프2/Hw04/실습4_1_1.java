package Hw04;
import java.awt.*;
import javax.swing.*;
class MyPanel411 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillOval(20, 30, 200, 200);
		g.setColor(Color.BLACK);
		g.drawArc(60, 80, 50, 50, 0, 180);
		g.drawArc(150, 80, 50, 50, 180, -180);
		g.drawArc(70, 130, 100, 70, 180, 180);
	}
}
public class 실습4_1_1 extends JFrame{
	public 실습4_1_1() {
		setTitle("도형 그리기 실습");
		
		setSize(280,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(new MyPanel411());
		
	}
	public static void main(String[] args) {
		new 실습4_1_1();
	}

}
