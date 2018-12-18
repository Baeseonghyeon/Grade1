package Hw04;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lab2_1 extends JFrame {
   
   public Lab2_1 () {
      setSize(500, 500);
      setTitle("Random Circle 생성");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      MyPanel p = new MyPanel();
      add(p);
      setVisible(true);
   }
   class MyPanel extends JPanel{
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         Circle c1 = new Circle(Color.red, 30,30,g);
         Circle c2 = new Circle(Color.GREEN, 20, 20,g);
      }
   }
   class Circle {
      public Circle(Color color, int width, int height, Graphics g) {
         int randomCount = (int)(Math.random()*20)+1;
         for(int i = 0; i < randomCount; i++) {
            g.setColor(color);
            int x = (int)(Math.random()*250);
            int y = (int)(Math.random()*250);
            g.fillOval(x, y, width, height);
         }
      }
   }
   public static void main(String[] args) {
      Lab2_1 l = new Lab2_1();
   }
}