package Hw03;

import java.awt.*;
import javax.swing.*;

class MyFrame1 extends JFrame{
	public MyFrame1() {
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("Line Start"), BorderLayout.WEST);
		add(new JButton("Line End"),BorderLayout.LINE_END);
		add(new JButton("Page_Start"),BorderLayout.PAGE_START);
		add(new JButton("Page_End"),BorderLayout.PAGE_END);
		pack();
		setVisible(true);
	}
}
public class BorderTest {
	public static void main(String[] args) {
		MyFrame1 f=new MyFrame1();
	}

}
