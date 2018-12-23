package Hw04;
import java.awt.*;
import javax.swing.*;
class MyPanel413 extends JPanel{
	Font f1,f2,f3,f4,f5;
	
	public MyPanel413() {
		f1=new Font("Serif",Font.PLAIN,20);
		f2=new Font("San Serif", Font.BOLD,20);
		f3=new Font("Monospaced",Font.ITALIC,20);
		f4=new Font("Dialog",Font.BOLD|Font.ITALIC,20);
		f5=new Font("DialogInput",Font.BOLD,20);
	}
	public void paintComponent(Graphics g) {
		g.setFont(f1);
		g.drawString("Serif 20 points PLAIN", 10, 50);
		g.setFont(f2);
		g.drawString("SanSerif 20 points BOLD", 10, 70);
		g.setFont(f3);
		g.drawString("MonoSpaced 20 points ITALIC", 10, 90);
		g.setFont(f4);
		g.drawString("Dialog 20 points BOLD+ITALIC", 10, 110);
		g.setFont(f5);
		g.drawString("DialogInput 20 points BOLD", 10, 130);
		
	}
}
public class 실습4_1_3 extends JFrame{
	public 실습4_1_3() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("논리 폰트 실습");
		JPanel panel=new MyPanel413();
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		실습4_1_3 s=new 실습4_1_3();
	}

}
