package Hw05;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;


class MyPanel51 extends JPanel implements ActionListener{//패널 클래스
	Random rand=new Random();
	Dice d=new Dice();//다이스 객체 2개생성
	Dice d2=new Dice();
	private int x1,x2,y1,y2;
	private JButton button = new JButton("던지기");
	MyPanel51(){
		setLayout(new BorderLayout());
		add(button, BorderLayout.SOUTH);
		button.addActionListener(this);
	}
	public void ran(int x,int x2) {//겹치지않기위해 주사위의 길이와 연관지어 겹치지않을떄까지 계속 랜덤
		while(Math.abs(x1-x2)<100) {
			x2=rand.nextInt(300);
		}
		while(Math.abs(y1-y2)<100) {
			y2=rand.nextInt(300);
		}
	}
	public void paintComponent(Graphics g) {//다이스 2개 그리기
		super.paintComponent(g);
		x1=rand.nextInt(300);//x,y의 좌표값
		y1=rand.nextInt(300);
		x2=rand.nextInt(300);
		y2=rand.nextInt(300);
		
		ran(x1,x2);//주사위가 겹치지 않게 ran 메소드 설정
		ran(y1,y2);
		
		d.x=x1;
		d.y=y1;
		d2.x=x2;
		d2.y=y2;
		
		d.draw(g);
		d2.draw(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
}
class Dice{
	Random rand=new Random();
	int r=rand.nextInt(6)+1;
	int x;
	int y;
	public void draw(Graphics g) {//draw메소드 
		g.setColor(Color.white);
		g.fillRoundRect(x, y, 100, 100, 20, 20);//x,y에 길이 100이고 굴곡이 20인 객체
		g.setColor(Color.BLACK);
		if(r==1) {
			g.fillOval(x+42, y+42, 20, 20);
		}else if(r==2) {
			g.fillOval(x+65, y+20, 20, 20);
			g.fillOval(x+20, y+65, 20, 20);
		}else if(r==3) {
			g.fillOval(x+65, y+20, 20, 20);
			g.fillOval(x+42, y+42, 20, 20);
			g.fillOval(x+20, y+65, 20, 20);
		}else if(r==4) {
			g.fillOval(x+20, y+20, 20, 20);
			g.fillOval(x+20, y+65, 20, 20);
			g.fillOval(x+65, y+20, 20, 20);
			g.fillOval(x+65, y+65, 20, 20);
		}else if(r==5) {
			g.fillOval(x+20, y+20, 20, 20);
			g.fillOval(x+20, y+65, 20, 20);
			g.fillOval(x+42, y+42, 20, 20);
			g.fillOval(x+65, y+20, 20, 20);
			g.fillOval(x+65, y+65, 20, 20);
			
		}else if(r==6) {
			g.fillOval(x+20, y+20, 20, 20);
			g.fillOval(x+20, y+65, 20, 20);
			g.fillOval(x+20, y+42, 20, 20);
			g.fillOval(x+65, y+20, 20, 20);
			g.fillOval(x+65, y+42, 20, 20);
			g.fillOval(x+65, y+65, 20, 20);
			
		}
	}
}
public class 실습5_1 extends JFrame{
	public 실습5_1() {
		setTitle("주사위 던지기 프로그램");
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel51());
		setVisible(true);
	}
	public static void main(String[] args) {
		new 실습5_1();
	}

}
