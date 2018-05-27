

import java.util.Scanner;

public class test8_3 {
   
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
   
      Complex1 num_1 = new Complex1();
      Complex1 num_2 = new Complex1();
      
      System.out.print("복소수1의 실수값과 허수값을 입력하시오: ");
      num_1.real = input.nextDouble();
      num_1.imag = input.nextDouble();
      System.out.print("복소수1: ");num_1.print();
      
      System.out.print("복소수2의 실수값과 허수값을 입력하시오: ");
      num_2.real = input.nextDouble();
      num_2.imag = input.nextDouble();
      System.out.print("복소수2: ");num_2.print();
      
      System.out.print("복소수1 + 복소수2 = "); num_1.add(num_2);
      System.out.print("복소수1 - 복소수2 = "); num_1.sub(num_2);
      System.out.print("복소수1 * 복소수2 = "); num_1.mul(num_2);
      System.out.print("복소수2 / 복소수1 = "); num_1.div(num_2);
      
   }
}
class Complex1 {
   double real;
   double imag;

   void print() {
      if (imag >= 0) {
         System.out.println(real + " + " + imag + "i");
      }
      else {
         System.out.println(real + " - " + (-imag) + "i");
      }
   }
   
   void add (Complex1 complex_number) {
      if (imag + complex_number.imag >= 0) {
         System.out.println((real + complex_number.real) + " + " + (imag + complex_number.imag) + "i");
      }
      else {
         System.out.println((real + complex_number.real) + " - " + (-(imag + complex_number.imag)) + "i");
      }
   }
   
   void sub (Complex1 complex_number) {
      if (imag - complex_number.imag >= 0) {
         System.out.println((real - complex_number.real) + " + " + (imag - complex_number.imag) + "i");
      }
      else {
         System.out.println((real - complex_number.real) + " - " + (-(imag - complex_number.imag)) + "i");
      }
   }
   
   void mul (Complex1 complex_number) {
      if ((real * complex_number.imag + complex_number.real * imag) >= 0) {
         System.out.println((real * complex_number.real - imag * complex_number.imag) + " + "+ (real * complex_number.imag + complex_number.real * imag) + "i");
      }
      else {
         System.out.println((real * complex_number.real - imag * complex_number.imag) + " - "+ (-(real * complex_number.imag + complex_number.real * imag)) + "i");
      }
   }
   void div (Complex1 complex_number) {
      if (real == 0 && imag == 0) {
         System.out.println("나누는 수가 0입니다.");
      }
      else {
         if (((complex_number.imag * real - complex_number.real * imag) / (real * real + imag * imag)) >= 0) {
            System.out.println(((complex_number.real * real + complex_number.imag * imag) / (real * real + imag * imag)) + " + "
            + ((complex_number.imag * real - complex_number.real * imag) / (real * real + imag * imag)) + "i");
         }
         else {
            System.out.println(((complex_number.real * real + complex_number.imag * imag) / (real * real + imag * imag)) + " - "
                  + (-((complex_number.imag * real - complex_number.real * imag) / (real * real + imag * imag))) + "i");
         }
      }
   }
}