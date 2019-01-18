import javax.swing.*;
import java.awt.*;
class MyFrame33 extends JFrame{
	JButton b1;
	private JButton b2,b3;
	public MyFrame33() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		JPanel p=new JPanel();
		p.setLayout(null);
		b1=new JButton("B1");
		p.add(b1);
		b1.setBounds(20,5,95,30);
		add(p);
		setVisible(true);
	}
}
public class AbsoluteTest {

	public static void main(String[] args) {
		new MyFrame33();
	}

}
