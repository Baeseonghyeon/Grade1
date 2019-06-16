import javax.swing.*;

class MyFrame23 extends JFrame{
	private JButton button;
	private JTextField text1,text2;
	private JPanel panel;
	
	public MyFrame23() {
		setTitle("MyFrame");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		text1=new JTextField("수정이가능합니다");
		text2=new JTextField("수정이 불가능합니다");
		text2.setEnabled(false);
		button=new JButton("버튼");
		panel.add(text1);
		panel.add(text2);
		panel.add(button);
		add(panel);
		setVisible(true);
		
	}
}


public class Practice23 {
	public static void main(String args[]) {
		new MyFrame23();
	}
}
