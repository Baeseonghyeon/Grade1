package Hw05;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
class cal2 extends JFrame implements ActionListener{
	private JPanel p,p1,p2,p3;
	private JTextField input;//숫자가 표시될 공간
	private JButton b1;
	private JButton b[]=new JButton[17];//각 버튼을 배열로 생성
	double o1=0;
	double o2=0;
	double result=0;
	String operation="";
	boolean m=false;
	public cal2() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p=new JPanel();//마지막 패널
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));// 세로로 정렬

		p1=new JPanel();//첫번째 패널
		input=new JTextField("0",25);//크기 25,초기값 0
		input.setHorizontalAlignment(JTextField.RIGHT);
		p1.add(input);
		
		p2=new JPanel(new GridLayout(0,4,3,3));//그리드 레이아웃을 지정자로함
		b[0]=new JButton("C");
		p2.add(b[0]);
		
		p3=new JPanel();
		p3.setLayout(new GridLayout(4,4,3,3));// 44를 간격33으로 만듬
		b[1]=new JButton("7");
		b[2]=new JButton("8");
		b[3]=new JButton("9");
		b[4]=new JButton("/");
		b[5]=new JButton("4");
		b[6]=new JButton("5");
		b[7]=new JButton("6");
		b[8]=new JButton("*");
		b[9]=new JButton("1");
		b[10]=new JButton("2");
		b[11]=new JButton("3");
		b[12]=new JButton("-");
		b[13]=new JButton("0");
		b[14]=new JButton("back");
		b[15]=new JButton("=");
		b[16]=new JButton("+");
		for(int i=1;i<17;i++) {
			p3.add(b[i]);
		}
		for(int i=0 ; i<b.length ; i++){
			b[i].addActionListener(this);
		}
		
		
		p.add(p1);//p에다가 p1p2p3를 넣음
		p.add(p2);
		p.add(p3);
		
		add(p);
		pack();
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//어떤 버튼을 눌렀나?
		String cmd=e.getActionCommand();
		if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")||cmd.equals("=")) {
			//계산이 처음일경우
			if(m==false) {
			o1=Double.parseDouble(input.getText());
			input.setText("");
			m=true;
			operation=cmd;
			}else {
				
				o2=Integer.parseInt(input.getText());
				input.setText("");
				if(operation.equals("+")) {
					o1+=o2;
				}else if(operation.equals("-")) {
					o1-=o2;
				}else if(operation.equals("*")) {
					o1*=o2;
				}else if(operation.equals("/")) {
					//0으로 나누는 경우
					try {
						int re=0;
						re=(int)o1/(int)o2;
						o1/=o2;
						
					}catch(ArithmeticException e1) {
						input.setText("0으로 나눌수 없습니다.");
					}
				}
				
			}
			operation=cmd;//연산 기호
		
		if(operation.equals("=")&&o2!=0) {//0으로 나누지 않았을때 
				input.setText(o1+"");
			}
		}
		else if(cmd.equals("back")) {
			input.setText(input.getText().substring(0, input.getText().length()-1));//input 중에서 뒤에꺼 하나 지우기
		}else if(cmd.equals("C")) {
			operation="";
			o1=0;
			o2=0;
			input.setText("0");
			m=false;
		}
		else if (input.getText().equals("0")&&m==false) {//처음 0일떄 지우기
			input.setText(cmd);
		} else {
			input.setText(input.getText() + cmd);//추가하기
		}
	

}
}
public class 과제5_1 {

	public static void main(String[] args) {
		new cal2();
	}

}

