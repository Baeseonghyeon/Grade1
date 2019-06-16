import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice02 {

	public static void main(String[] args) {
		new MyFrame21();
	}

}
class MyFrame21 extends JFrame{
	private JButton button;
	private JLabel label;
	public MyFrame21() {
		setTitle("MyFrame");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		button= new JButton("버튼");
		label=new JLabel("레이블입니다.");
		add(label);
		add(button);
		setVisible(true);
	}
}
