import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class BorderTest extends JFrame {
	public BorderTest() {
		setTitle("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(new JButton("Center"),BorderLayout.CENTER);
		add(new JButton("Center2"),BorderLayout.CENTER);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderTest();
	}

}
