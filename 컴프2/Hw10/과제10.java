package Hw10;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
class MyPanel extends JPanel {
	JLabel l=new JLabel("@");
	JLabel l2=new JLabel("M");
	JLabel l3=new JLabel("M");
	int x[]=new int[3];
	int y[]=new int[3];
	public MyPanel() throws InterruptedException {
		setLayout(null);
		add(l);
		l.setForeground(Color.red);
		x[1]=200;
		y[1]=200;
		x[2]=100;
		y[2]=100;
		add(l2);
		add(l3);
		(new MyThread()).start();//스레드 시작
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP:
					y[0]-=5;
					break;

				case KeyEvent.VK_DOWN:
					y[0]+=5;
					break;
				case KeyEvent.VK_LEFT:
					x[0]-=5;
					break;
				case KeyEvent.VK_RIGHT:
					x[0]+=5;
					break;
				}
				repaint();
			}
		});
		setFocusable(true);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		l.setBounds(x[0],y[0], 15, 15);
		l2.setBounds(x[1], y[1], 15, 15);
		l3.setBounds(x[2], y[2], 15, 15);
		if(Math.abs(x[0]-x[1])<10&&Math.abs(y[0]-y[1])<10) {//잡히는것에 대한 오차범위 안에 들어오면 게임끝
			System.exit(0);
		}
		if(Math.abs(x[0]-x[2])<10&&Math.abs(y[0]-y[2])<10) {//잡히는것에 대한 오차범위 안에 들어오면 게임끝
			System.exit(0);
		}
	}
	class MyThread extends Thread{//내부 클래스 
		public void run() {
			while(true) {
				if(x[0]>x[1]) {
					x[1]+=5;
				}else {
					x[1]-=5;
				}
				if(y[0]>y[1]) {
					y[1]+=5;
				}else {
					y[1]-=5;
				}
				if(x[0]>x[2]) {
					x[2]+=5;
				}else {
					x[2]-=5;
				}
				if(y[0]>y[2]) {
					y[2]+=5;
				}else {
					y[2]-=5;
				}
				repaint();
				try {
					Thread.sleep(200);
				}catch(Exception e) {}
			}

		}
	}
}

public class 과제10 extends JFrame{
	public 과제10() throws InterruptedException {
		setTitle("괴물 피하기 게임");
		setSize(400,400);
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	public static void main(String[] args) throws InterruptedException {
		new 과제10();
	}

}
