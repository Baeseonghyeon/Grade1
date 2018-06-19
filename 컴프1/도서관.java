package 텀프;
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
      System.out.println("현재시간");
      System.out.println(year + "년 " + mon + "월 " + day + "일");
      System.out.println(hour + "시 " + min + "분 " + sec + "초");
   }

   public void return_calendar() {
      int plusDay = 7;
      cal.add(Calendar.DAY_OF_MONTH, plusDay);
      int nYear = cal.get(Calendar.YEAR);
      int nMonth = cal.get(Calendar.MONTH) + 1;
      int nDay = cal.get(Calendar.DAY_OF_MONTH);
      System.out.println("반납일은 " + nYear + "년" + nMonth + "월" + nDay + "일");
      int minusDay = -7;
      cal.add(Calendar.DAY_OF_MONTH, minusDay);
   }

   public void extend_calender() {
      int eDay = 21;
      cal.add(Calendar.DAY_OF_MONTH, eDay);
      int nYear = cal.get(Calendar.YEAR);
      int nMonth = cal.get(Calendar.MONTH) + 1;
      int nDay = cal.get(Calendar.DAY_OF_MONTH);
      System.out.println("반납일은 " + nYear + "년" + nMonth + "월" + nDay + "일");
      int minusDay = -21;
      cal.add(Calendar.DAY_OF_MONTH, minusDay);
   }
}

class member_join {
   String ID;
   String PW;

}

class Book extends calendar {
   int count = 5;// 책 숫자
   Scanner sc = new Scanner(System.in);
   Scanner sc2 = new Scanner(System.in);

   public void base(String[] a, int[] b) {
      a[0] = "노인과 바다";
      a[1] = "신데렐라";
      a[2] = "어린 왕자";
      a[3] = "로미오와 줄리엣";
      a[4] = "모비딕";
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
      System.out.print("\n책을 검색하세요: ");
      String bookName = sc.nextLine();
      for (int i = 0; i < a.length; i++) {
         if (a[i] == null) {
            System.out.println("책이 없습니다. 신청하시겠습니까?(1.Yes, 2.No)");
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
               a[i] = bookName;
               System.out.println("신청 되었습니다.");
               b[i] = 2;
            }

            break;
         }

         else if (a[i].equals(bookName) && b[i] > 0) {
            System.out.println(b[i] + "권 남았습니다. \n대여 하시겠습니까?(1.Yes, 2.No)");
            int num = sc2.nextInt();
            if (num == 1) {
               System.out.println("대여 됐습니다.");
               b[i]--;
               return_calendar();
               break;
            } else if (num == 2) {
               System.out.println("대여하지 않습니다.");
               break;
            } else {
               System.out.println("잘못된 입력입니다.");
               continue;
            }
         } else if (a[i].equals(bookName) && b[i] == 0) {
            System.out.println(b[i] + "권 남았습니다.");
            break;
         }
      }

   }

   public void Input(String[] a, int[] b) {
      System.out.println("신청할 도서 제목을 입력하세요.");
      String book = sc.nextLine();
      for (int i = 0; i < a.length; i++) {
         if (a[i] == null) {
            a[i] = book;
            b[i] = 2;
            System.out.println("책이 신청되었습니다.");
            break;
         } else if (a[i].equals(book)) {
            System.out.println("이미 책이 있습니다.");
            break;
         }
      }

   }

   public void lent(String[] a, int[] b) {
      int finish = 0;
      while (finish != 1) {
         System.out.println("대여하실 책의 이름을 입력하세요.");
         String name = sc2.nextLine();
         sc2.nextLine();
         for (int i = 0; i < 100; i++) {
            if (a[i] == null) {
               System.out.println("책이 존재하지 않습니다. 다시 입력해주세요.");
               break;
            } else if (a[i].equals(name) && b[i] != 0) {
               b[i]--;
               System.out.println("대여되었습니다.");
               finish = 1;
               return_calendar();
               break;
            } else if (a[i].equals(name) && b[i] == 0) {
               System.out.println("잔여 책이 없습니다.");
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
      System.out.print("대여중인 책은 ");
      for (int i = 0; i < 100; i++) {
         if (a[i] != null && b[i] < 2) {
            System.out.print("\'" + a[i] + "\' " + (2 - b[i]) + "권 ");
            x++;
            continue;
         }
         if (b[i] == 2) {
            continue;
         }
      }
      if (x != 0) {
         System.out.print("입니다.\n반납하실 책을 입력해주세요\n");
         String name = sc.nextLine();

         for (int i = 0; i < 100; i++) {
            if (name.equals(a[i]) && b[i] < 2) {
               System.out.println("반납할 권수를 입력해 주세요.");
               int num = sc.nextInt();
               if (num <= (2 - b[i])) {
                  b[i] += num;
                  System.out.println(num + "권 반납되었습니다.");
               } else
                  System.out.println("잘못입력하였습니다.");
               break;
            }
            continue;
         }
      } else {
         System.out.println("없습니다");
      }

   }

   public void extension(String[] a, int[] b) {
      int x = 0;
      System.out.println("연장하시겠습니까? (1.Yes 2. No)");
      int num = sc2.nextInt();
      if (num == 1) {
         System.out.print("대여중인 책은 ");
         for (int i = 0; i < 100; i++) {
            if (a[i] != null && b[i] < 2) {
               System.out.print("'"+a[i] + "' " + (2 - b[i]) + "권 ");
               x++;
               continue;
            }
            if (b[i] == 2) {
               continue;
            }
         }

         if (x != 0) {
            System.out.print("입니다.\n연장하실 책을 입력해주세요\n");
            String name = sc.nextLine();

            for (int i = 0; i < 100; i++) {
               if (name.equals(a[i]) && b[i] < 2) {
                  System.out.println("연장되었습니다. 연장기간은 14일 입니다.");
                  System.out.print(name + "의 ");
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
      System.out.println("원하시는 번호를 선택해 주세요.");
      System.out.println("====================");
      System.out.println("1.도서 조회      ");
      System.out.println("2.도서 신청      ");
      System.out.println("3.도서 대여      ");
      System.out.println("4.도서 연장      ");
      System.out.println("5.도서 반납      ");
      System.out.println("6.종료          ");
      System.out.println("====================");
   }
}

class Return {
   public static void Return(String[] BookName, int[] b) {
      for (int i = 0; i < 100; i++) {

      }
   }
}

public class 도서관 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (true) {
         System.out.println("안녕하세요. BKL도서관입니다.");
         System.out.println("회원가입을 하시오.");

         member_join member = new member_join();
         System.out.print("ID : ");
         member.ID = sc.nextLine();
         System.out.print("PW : ");
         member.PW = sc.nextLine();
         while (true) {
            System.out.println("로그인하시오.");
            System.out.print("ID : ");
            String Id = sc.nextLine();

            System.out.print("PW : ");
            String Pw = sc.nextLine();

            if (member.ID.equals(Id) == true && member.PW.equals(Pw)) {
               System.out.println("인증되었습니다.");
               break;
            } else {
               System.out.println("인증 x");
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
               System.out.println("종료하셨습니다.");
               break;
            } else {
               System.out.println("번호를 잘못 입력하셨습니다.");
               continue;
            }
         } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다 다시 입력해주세요.");
            sc.nextLine();
         }
      }

   }

}