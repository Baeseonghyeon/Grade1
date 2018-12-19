package Hw04;
import java.awt.*;
import javax.swing.*;
import java.util.*;

class MyPanel41 extends JPanel{
	Circle cir[]=new Circle[10];//원의 배열 10개
	Random rand=new Random();//랜덤객체
	public MyPanel41() {
		for(int i=0;i<10;i++) {
	         int X=rand.nextInt(300)+150;//x좌표
	         int Y=rand.nextInt(300)+150;//y좌표
	         int radius=rand.nextInt(300);//반지름
	         int a=rand.nextInt(256);//rgb 색상 랜덤
	         int b=rand.nextInt(256);
	         int c=rand.nextInt(256);
	        cir[i]=new Circle(radius,X,Y,new Color(a,b,c)); //원 객체 생성
	         
	      }
	}
	public void paintComponent(Graphics g) {//원 그리기
	      super.paintComponent(g);
	      for(Circle c:cir) {
	    	 c.drawCirde(g);
	     }
	      
	   }
}
class Circle{
   int radius;
   int centerX,centerY;
   Color color;
   public Circle(int radius,int X,int Y,Color color) {//circle의생성자
      this.radius=radius;
      this.centerX=X-radius;
      this.centerY=Y-radius;
      this.color=color;
   }
   void drawCirde(Graphics g) {//원 그리기
	   g.setColor(this.color);
	   g.fillOval(this.centerX, this.centerY, this.radius, this.radius);
   }
  
}
public class 과제4_1 extends JFrame{
   public 과제4_1() {
      setTitle("원 그리기");
      setSize(600,600);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      MyPanel41 p=new MyPanel41();
      add(p);
      setVisible(true);
      
   }
   public static void main(String[] args) {
      new 과제4_1();
   }

}