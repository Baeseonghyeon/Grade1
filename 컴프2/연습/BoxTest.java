import java.awt.*;
import javax.swing.*;
public class BoxTest extends JFrame{
	public BoxTest() {
		JPanel p=new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		p.add(new JButton("1"));
		p.add(new JButton("1"));

		p.add(new JButton("1"));
		add(p);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new BoxTest();
	}

}
