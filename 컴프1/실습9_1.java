class Book {
	private String title;
	private String author;
	private int year;

	String setTitle(String t) {
		title = t;
		return title;
	}

	String setAuthor(String A) {
		author = A;
		return author;
	}

	int setYear(int y) {
		year = y;
		return year;
	}

		String getTitle() {
			return this.title;
			
		}
		String getAuthor() {
			return this.author;
		}
		int getYear() {
			return this.year;
		}
}

public class �ǽ�9_1 {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();

		book1.setTitle("���ΰ��ٴ�");
		book1.setAuthor("��ֿ���");
		book1.setYear(1952);
		
		book2.setTitle("������ ������");
		book2.setAuthor("���� ����������");
		book2.setYear(1925);
		
		System.out.println("ù ��° å");
		System.out.println("����: " + book1.getTitle());
		System.out.println("�۰�: "+ book1.getAuthor());
		System.out.println("����: "+book1.getYear());
		
		System.out.println("---------------------");
		
		System.out.println("�� ��° å");
		System.out.println("����: " + book2.getTitle());
		System.out.println("�۰�: "+ book2.getAuthor());
		System.out.println("����: "+book2.getYear());
		
	}

}
