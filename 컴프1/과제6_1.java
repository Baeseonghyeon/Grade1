import java.util.Scanner;

public class °úÁ¦6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("°¡À§¹ÙÀ§º¸ °ÔÀÓÀÔ´Ï´Ù  °¡À§, ¹ÙÀ§, º¸ Áß¿¡¼­ ÀÔ·ÂÇÏ¼¼¿ä. ");
		
		System.out.print("Ã¶¼ö>>");
		String Ã¶¼ö = sc.next();
		System.out.print("¿µÈñ>>");
		String ¿µÈñ = sc.next();
		
		if(Ã¶¼ö.equals("°¡À§")) {
			
			if(¿µÈñ.equals("¹ÙÀ§"))
				System.out.println("Winner? ¿µÈñ");
			else if(¿µÈñ.equals("º¸"))
				System.out.println("Winner? Ã¶¼ö");
			else System.out.println("Winner? ¹«½ÂºÎ");
		}
		else if(Ã¶¼ö.equals("¹ÙÀ§")) {
			if(¿µÈñ.equals("°¡À§"))
				System.out.println("Winner? Ã¶¼ö");
			else if(¿µÈñ.equals("º¸"))
				System.out.println("Winner? ¿µÈñ");
			else System.out.println("Winner? ¹«½ÂºÎ");
		}
		else if(Ã¶¼ö.equals("º¸")) {
			if(¿µÈñ.equals("°¡À§"))
				System.out.println("Winner? ¿µÈñ");
			else if(¿µÈñ.equals("¹ÙÀ§"))
				System.out.println("Winner? Ã¶¼ö");
			else System.out.println("Winner? ¹«½ÂºÎ");
		}
		
	}
}

