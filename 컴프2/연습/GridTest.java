import javax.swing.*;
import java.awt.*;
public class GridTest extends JFrame{
	public GridTest() {
		setLayout(new GridLayout(1,3));

		add(new JButton("11"));
		add(new JButton("11"));
		add(new JButton("11"));
		add(new JButton("11"));
		add(new JButton("11"));
		add(new JButton("11"));
		
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridTest();
	}

}
