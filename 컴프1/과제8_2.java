import java.util.Scanner;

public class ����8_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int consonant = 0;
		int vowel = 0;

		System.out.print("���ڿ� �Է�>> ");
		String word = sc.nextLine();
		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {
			if ('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
				if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
						|| word.charAt(i) == 'u') {
					vowel++;

				} else
					consonant++;
			}
			continue;
		}
		System.out.println("������ ����: " + vowel);
		System.out.println("������ ����: " + consonant);
	}

}
