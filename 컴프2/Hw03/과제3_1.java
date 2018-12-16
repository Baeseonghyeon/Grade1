package Hw03;
import java.awt.*;
import javax.swing.*;
class MyFrame6 extends JFrame{
	private JPanel p,p1,p2;
	private JTextField input1,input2,output;
	private JButton b1;
	public MyFrame6() {
		setTitle("이자계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p=new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));//세로로 정렬
		
		p1=new JPanel(new BorderLayout());//BorderLayout 객체 생성
		p1.add(new JLabel("원금을 입력하시오."),BorderLayout.WEST);//왼쪽 정렬
		input1=new JTextField(5);
		p1.add(input1,BorderLayout.EAST);
		
		p2=new JPanel(new BorderLayout());
		p2.add(new JLabel("이율을 입력하시오"),BorderLayout.WEST);
		input2=new JTextField(5);
		p2.add(input2,BorderLayout.EAST);
		
		b1=new JButton("변환");
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);//중앙으로 만듬
		output=new JTextField(20);
		
		p.add(p1);//p에 p1p2p3를 넣음
		p.add(p2);
		p.add(b1);
		p.add(output);
		
		add(p);
		pack();
		setVisible(true);
	}
}
public class 과제3_1 {

	public static void main(String[] args) {
		MyFrame6 m=new MyFrame6();
	}

}
