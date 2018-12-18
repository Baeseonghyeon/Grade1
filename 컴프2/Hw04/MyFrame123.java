package Hw04;
import java.awt.*;
import javax.swing.*;

class MyPanel123 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("안녕하세요?", 10, 10);
		g.drawLine(10, 20, 110, 20);
		g.drawRect(10, 30, 100, 100);
	}
}
public class MyFrame123 extends JFrame{
	public MyFrame123() {
		setTitle("MyFrame");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel123 p=new MyPanel123();
		setVisible(true);
		add(p);
	}
	public static void main(String[] args) {
		MyFrame123 frame=new MyFrame123();
	}

}
