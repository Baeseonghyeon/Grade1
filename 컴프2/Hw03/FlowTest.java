package Hw03;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel;
		
		panel=new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		panel.add(new JButton("b1"));
		panel.add(new JButton("b2"));
		panel.add(new JButton("b3"));
		panel.add(new JButton("b4"));
		panel.add(new JButton("b5"));
		add(panel);//패널을 프레임에 추가
		pack();
		setVisible(true);
	}
}

public class FlowTest {

	public static void main(String[] args) {
		MyFrame f=new MyFrame();
	}

}
