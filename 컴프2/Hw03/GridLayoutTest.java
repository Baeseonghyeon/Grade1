package Hw03;
import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(3,1));//별표 3,1 >> 1,3 무엇?
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
		
		pack();
		setVisible(true);
	}
}
public class GridLayoutTest {

	public static void main(String[] args) {
		MyFrame2 f=new MyFrame2();
	}

}
