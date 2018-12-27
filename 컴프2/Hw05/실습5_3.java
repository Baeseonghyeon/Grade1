package Hw05;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class 실습5_3 extends JFrame{
	MouseEventPanel p=new MouseEventPanel();
	public 실습5_3() {
		setTitle("Mouse Event");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new 실습5_3();
	}

}
class MouseEventPanel extends JPanel{
	private int x1,y1,x2,y2;
	private int smallX,smallY;
	
	public MouseEventPanel() {
		addMouseListener(new MouseListener(){
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				x1=e.getX();
				y1=e.getY();
			}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		
		addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved(MouseEvent e) {}
			public void mouseDragged(MouseEvent e) {
				x2=e.getX();
				y2=e.getY();
				repaint();
			}
		});
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		smallX=(x1<=x2)? x1:x2;
		smallY=(y1<=y2)? y1:y2;
		g.drawRect(smallX, smallY, Math.abs(x1-x2),Math.abs(y1-y2));
	}
}
