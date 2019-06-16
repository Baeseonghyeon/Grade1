import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
class MyFrame14 extends JFrame implements KeyListener{
	public MyFrame14() {
		setTitle("이벤트");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField tf=new JTextField(20);
		tf.addKeyListener(this);
		add(tf);
		setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		display(e,"Type");
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		display(e,"press");

	}
	@Override
	public void keyReleased(KeyEvent e) {
		display(e,"release");
		
	}
	protected void display(KeyEvent e,String s) {
		char c=e.getKeyChar();
		int keyCode=e.getKeyCode();
		String modifiers =e.isAltDown()+" "+e.isControlDown()+" "+e.isShiftDown();
		System.out.println(s+" "+c+" "+keyCode+" "+modifiers);
	}
}
public class KeyEventTest {

	public static void main(String[] args) {
		new MyFrame14();
	}

}
