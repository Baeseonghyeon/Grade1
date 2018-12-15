package Hw03;
import java.awt.*;
import javax.swing.*;

class MyFrame4 extends JFrame{
	
	public MyFrame4() {
		setTitle("BoxLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		makeButton(panel,"Button1");
		makeButton(panel,"Button2");
		makeButton(panel,"Button3");
		makeButton(panel,"Button4");
		makeButton(panel,"Button5");
		add(panel);
		pack();
		setVisible(true);
		
	}
	
	private void makeButton(JPanel panel,String text) {
		JButton button =new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);//별표
		panel.add(button);
	}
}
public class BoxTest {

	public static void main(String[] args) {
		MyFrame4 f=new MyFrame4();
	}

}
