package Hw05;

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

class KeyEventPanel extends JPanel{
	private int[] xArr=new int[5],yArr=new int[5];
	private int width=25,height=25;
	
	public KeyEventPanel() {
		for(int i=1;i<5;i++) {
			xArr[i]=xArr[i-1]+width;
		}
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP:
					for(int i=0;i<xArr.length-1;i++) {
						xArr[i]=xArr[i+1];
						yArr[i]=yArr[i+1];
					}
					yArr[xArr.length-1]-=height;
					break;
				
			case KeyEvent.VK_DOWN:
				for(int i=0;i<xArr.length-1;i++) {
					xArr[i]=xArr[i+1];
					yArr[i]=yArr[i+1];
				}
				yArr[xArr.length-1]+=height;
				break;
			case KeyEvent.VK_LEFT:
				for(int i=0;i<xArr.length-1;i++) {
					xArr[i]=xArr[i+1];
					yArr[i]=yArr[i+1];
				}
				xArr[xArr.length-1]-=width;
				break;
			case KeyEvent.VK_RIGHT:
				for(int i=0;i<xArr.length-1;i++) {
					xArr[i]=xArr[i+1];
					yArr[i]=yArr[i+1];
				}
				xArr[xArr.length-1]+=width;
				break;
			
				
			}
				repaint();
			}
		});
		this.requestFocus();
		setFocusable(true);
		
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0;i<5;i++) {
			g.drawRect(xArr[i], yArr[i], width, height);
		}
	}
}
public class 실습5_4 extends JFrame {
	public 실습5_4() {
		setTitle("KeyEventFrame");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new KeyEventPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		new 실습5_4();
	}

}
