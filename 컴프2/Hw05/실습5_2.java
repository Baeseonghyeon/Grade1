package Hw05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MileToKilloFrame2 extends JFrame{
	private JPanel p,p1;
	private JTextField inputTextField,outputTextField;
	private JButton b1;
	public MileToKilloFrame2() {
		setTitle("마일을 킬로미터로 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p=new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		
		p1=new JPanel();
		p1.add(new JLabel("거리를 마일 단위로 입력하시오."));
		inputTextField=new JTextField(10);
		p1.add(inputTextField);
		
		b1=new JButton("변환");
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		outputTextField=new JTextField(30);
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				double killo;
				killo=Double.parseDouble(inputTextField.getText())*1.609;
				outputTextField.setText(inputTextField.getText()+"마일은"+ String.format("%.3f", killo)+"킬로미터 입니다.");
				
			}
		});
		
		
		p.add(p1);
		p.add(b1);
		p.add(outputTextField);
		
		add(p);
		pack();
		setVisible(true);
	}
	
}
public class 실습5_2 {

	public static void main(String[] args) {
		MileToKilloFrame2 m=new MileToKilloFrame2();
	}

}
