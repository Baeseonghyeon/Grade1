package Hw03;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class cal extends JFrame{
	private JPanel p,p1,p2,p3;
	private JTextField input;
	private JButton b1;
	
	public cal() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p=new JPanel();//마지막 패널
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));// 세로로 정렬

		p1=new JPanel();//첫번째 패널
		input=new JTextField(25);//크기 25
		p1.add(input);
		
		p2=new JPanel(new GridLayout(0,4,3,3));//그리드 레이아웃을 지정자로함
		b1=new JButton("C");
		p2.add(b1);
		
		p3=new JPanel();
		p3.setLayout(new GridLayout(4,4,3,3));// 44를 간격33으로 만듬
		p3.add(new JButton("7"));
		p3.add(new JButton("8"));
		p3.add(new JButton("9"));
		p3.add(new JButton("/"));
		p3.add(new JButton("4"));
		p3.add(new JButton("5"));
		p3.add(new JButton("6"));
		p3.add(new JButton("*"));
		p3.add(new JButton("1"));
		p3.add(new JButton("2"));
		p3.add(new JButton("3"));
		p3.add(new JButton("-"));
		p3.add(new JButton("0"));
		p3.add(new JButton("back"));
		p3.add(new JButton("="));
		p3.add(new JButton("+"));
		
		
		p.add(p1);//p에다가 p1p2p3를 넣음
		p.add(p2);
		p.add(p3);
		
		add(p);
		pack();
		setVisible(true);
		
	}
}
public class 과제3_2 {

	public static void main(String[] args) {
		cal c=new cal();
	}

}
