package Hw02;
import java.awt.*;
import javax.swing.*;
class MyFrame02 extends JFrame{
	/*private JButton button;
	private JTextField text1,text2;
	private JPanel panel;
	public MyFrame02() {
		setTitle("MyFrame");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel =new JPanel();
		
		text1=new JTextField(20);
		text1.setText("수정이 가능합니다.");
		
		text2=new JTextField(20);
		text2.setText("수정이 불가능합니다.");
		text2.setEditable(false);
		
		button = new JButton("버튼");
		
		panel.add(text1);
		panel.add(text2);
		panel.add(button);
		
		add(panel);
		
		setVisible(true);
	}*/
	private JButton button;
	private JLabel label;
	
	public MyFrame02() {
		setTitle("MyFrame");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new FlowLayout());
		
		
		button=new JButton("버튼");
		label = new JLabel("레이블입니다.");
		
		add(label);
		add(button);
		setVisible(true);
		
	}
}
public class Practice02 {

	public static void main(String[] args) {
		JFrame f=new JFrame("Frame Test");
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		new MyFrame02();
	}

}
