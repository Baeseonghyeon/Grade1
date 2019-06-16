import java.awt.*;

import javax.swing.*;
class MyFrame3 extends JFrame{
	public MyFrame3() {
		setSize(100,300);
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		panel=new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		add(panel);
		setVisible(true);
		
	}
}
public class FlowTest {
	

	public static void main(String[] args) {
		new MyFrame3();
	}

}
