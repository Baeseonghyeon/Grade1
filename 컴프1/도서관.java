package ����;
import java.util.*;

class calendar {

   Calendar cal = Calendar.getInstance();
   private int year = cal.get(Calendar.YEAR);
   private int mon = cal.get(Calendar.MONTH) + 1;
   private int day = cal.get(Calendar.DAY_OF_MONTH);
   private int hour = cal.get(Calendar.HOUR_OF_DAY);
   private int min = cal.get(Calendar.MINUTE);
   private int sec = cal.get(Calendar.SECOND);

   public void calendar() {
      System.out.println("����ð�");
      System.out.println(year + "�� " + mon + "�� " + day + "��");
      System.out.println(hour + "�� " + min + "�� " + sec + "��");
   }

   public void return_calendar() {
      int plusDay = 7;
      cal.add(Calendar.DAY_OF_MONTH, plusDay);
      int nYear = cal.get(Calendar.YEAR);
      int nMonth = cal.get(Calendar.MONTH) + 1;
      int nDay = cal.get(Calendar.DAY_OF_MONTH);
      System.out.println("�ݳ����� " + nYear + "��" + nMonth + "��" + nDay + "��");
      int minusDay = -7;
      cal.add(Calendar.DAY_OF_MONTH, minusDay);
   }

   public void extend_calender() {
      int eDay = 21;
      cal.add(Calendar.DAY_OF_MONTH, eDay);
      int nYear = cal.get(Calendar.YEAR);
      int nMonth = cal.get(Calendar.MONTH) + 1;
      int nDay = cal.get(Calendar.DAY_OF_MONTH);
      System.out.println("�ݳ����� " + nYear + "��" + nMonth + "��" + nDay + "��");
      int minusDay = -21;
      cal.add(Calendar.DAY_OF_MONTH, minusDay);
   }
}

class member_join {
   String ID;
   String PW;

}

class Book extends calendar {
   int count = 5;// å ����
   Scanner sc = new Scanner(System.in);
   Scanner sc2 = new Scanner(System.in);

   public void base(String[] a, int[] b) {
      a[0] = "���ΰ� �ٴ�";
      a[1] = "�ŵ�����";
      a[2] = "� ����";
      a[3] = "�ι̿��� �ٸ���";
      a[4] = "����";
      for (int i = 0; i < 5; i++) {
         b[i] = 2;
      }
   }

   public void Cheak(String[] a, int[] b) {

      for (int i = 0; i < a.length; i++) {
         if (a[i] == null)
            break;
         else
            System.out.print("\'" + a[i] + "\'" + " ");
      }
      System.out.print("\nå�� �˻��ϼ���: ");
      String bookName = sc.nextLine();
      for (int i = 0; i < a.length; i++) {
         if (a[i] == null) {
            System.out.println("å�� �����ϴ�. ��û�Ͻðڽ��ϱ�?(1.Yes, 2.No)");
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
               a[i] = bookName;
               System.out.println("��û �Ǿ����ϴ�.");
               b[i] = 2;
            }

            break;
         }

         else if (a[i].equals(bookName) && b[i] > 0) {
            System.out.println(b[i] + "�� ���ҽ��ϴ�. \n�뿩 �Ͻðڽ��ϱ�?(1.Yes, 2.No)");
            int num = sc2.nextInt();
            if (num == 1) {
               System.out.println("�뿩 �ƽ��ϴ�.");
               b[i]--;
               return_calendar();
               break;
            } else if (num == 2) {
               System.out.println("�뿩���� �ʽ��ϴ�.");
               break;
            } else {
               System.out.println("�߸��� �Է��Դϴ�.");
               continue;
            }
         } else if (a[i].equals(bookName) && b[i] == 0) {
            System.out.println(b[i] + "�� ���ҽ��ϴ�.");
            break;
         }
      }

   }

   public void Input(String[] a, int[] b) {
      System.out.println("��û�� ���� ������ �Է��ϼ���.");
      String book = sc.nextLine();
      for (int i = 0; i < a.length; i++) {
         if (a[i] == null) {
            a[i] = book;
            b[i] = 2;
            System.out.println("å�� ��û�Ǿ����ϴ�.");
            break;
         } else if (a[i].equals(book)) {
            System.out.println("�̹� å�� �ֽ��ϴ�.");
            break;
         }
      }

   }

   public void lent(String[] a, int[] b) {
      int finish = 0;
      while (finish != 1) {
         System.out.println("�뿩�Ͻ� å�� �̸��� �Է��ϼ���.");
         String name = sc2.nextLine();
         sc2.nextLine();
         for (int i = 0; i < 100; i++) {
            if (a[i] == null) {
               System.out.println("å�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
               break;
            } else if (a[i].equals(name) && b[i] != 0) {
               b[i]--;
               System.out.println("�뿩�Ǿ����ϴ�.");
               finish = 1;
               return_calendar();
               break;
            } else if (a[i].equals(name) && b[i] == 0) {
               System.out.println("�ܿ� å�� �����ϴ�.");
               finish = 1;
               break;
            }
         }
      }
   }

   public static void Return(String[] a, int[] b) {
      int x = 0;
      Scanner sc = new Scanner(System.in);
      Scanner sc2 = new Scanner(System.in);
      System.out.print("�뿩���� å�� ");
      for (int i = 0; i < 100; i++) {
         if (a[i] != null && b[i] < 2) {
            System.out.print("\'" + a[i] + "\' " + (2 - b[i]) + "�� ");
            x++;
            continue;
         }
         if (b[i] == 2) {
            continue;
         }
      }
      if (x != 0) {
         System.out.print("�Դϴ�.\n�ݳ��Ͻ� å�� �Է����ּ���\n");
         String name = sc.nextLine();

         for (int i = 0; i < 100; i++) {
            if (name.equals(a[i]) && b[i] < 2) {
               System.out.println("�ݳ��� �Ǽ��� �Է��� �ּ���.");
               int num = sc.nextInt();
               if (num <= (2 - b[i])) {
                  b[i] += num;
                  System.out.println(num + "�� �ݳ��Ǿ����ϴ�.");
               } else
                  System.out.println("�߸��Է��Ͽ����ϴ�.");
               break;
            }
            continue;
         }
      } else {
         System.out.println("�����ϴ�");
      }

   }

   public void extension(String[] a, int[] b) {
      int x = 0;
      System.out.println("�����Ͻðڽ��ϱ�? (1.Yes 2. No)");
      int num = sc2.nextInt();
      if (num == 1) {
         System.out.print("�뿩���� å�� ");
         for (int i = 0; i < 100; i++) {
            if (a[i] != null && b[i] < 2) {
               System.out.print("'"+a[i] + "' " + (2 - b[i]) + "�� ");
               x++;
               continue;
            }
            if (b[i] == 2) {
               continue;
            }
         }

         if (x != 0) {
            System.out.print("�Դϴ�.\n�����Ͻ� å�� �Է����ּ���\n");
            String name = sc.nextLine();

            for (int i = 0; i < 100; i++) {
               if (name.equals(a[i]) && b[i] < 2) {
                  System.out.println("����Ǿ����ϴ�. ����Ⱓ�� 14�� �Դϴ�.");
                  System.out.print(name + "�� ");
                  extend_calender();

               }
               continue;
            }
         }
      }

   }

}

class List {
   public static void List() {
      calendar time = new calendar();
      System.out.println("====================");
      time.calendar();
      System.out.println("====================");
      System.out.println("���Ͻô� ��ȣ�� ������ �ּ���.");
      System.out.println("====================");
      System.out.println("1.���� ��ȸ      ");
      System.out.println("2.���� ��û      ");
      System.out.println("3.���� �뿩      ");
      System.out.println("4.���� ����      ");
      System.out.println("5.���� �ݳ�      ");
      System.out.println("6.����          ");
      System.out.println("====================");
   }
}

class Return {
   public static void Return(String[] BookName, int[] b) {
      for (int i = 0; i < 100; i++) {

      }
   }
}

public class ������ {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (true) {
         System.out.println("�ȳ��ϼ���. BKL�������Դϴ�.");
         System.out.println("ȸ�������� �Ͻÿ�.");

         member_join member = new member_join();
         System.out.print("ID : ");
         member.ID = sc.nextLine();
         System.out.print("PW : ");
         member.PW = sc.nextLine();
         while (true) {
            System.out.println("�α����Ͻÿ�.");
            System.out.print("ID : ");
            String Id = sc.nextLine();

            System.out.print("PW : ");
            String Pw = sc.nextLine();

            if (member.ID.equals(Id) == true && member.PW.equals(Pw)) {
               System.out.println("�����Ǿ����ϴ�.");
               break;
            } else {
               System.out.println("���� x");
               continue;
            }
         }
         break;
      }
      int[] BookNumber = new int[100];
      String[] BookName = new String[100];

      Book set = new Book();
      set.base(BookName, BookNumber);
      while (true) {
         List.List();
         try {
            int num = sc.nextInt();
            if (num == 1) {
               set.Cheak(BookName, BookNumber);
            } else if (num == 2) {
               set.Input(BookName, BookNumber);
               continue;
            } else if (num == 3) {
               set.lent(BookName, BookNumber);
            } else if (num == 4) {
               set.extension(BookName, BookNumber);
            } else if (num == 5) {
               set.Return(BookName, BookNumber);
            } else if (num == 6) {
               System.out.println("�����ϼ̽��ϴ�.");
               break;
            } else {
               System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
               continue;
            }
         } catch (InputMismatchException e) {
            System.out.println("�߸��� �Է��Դϴ� �ٽ� �Է����ּ���.");
            sc.nextLine();
         }
      }

   }

}