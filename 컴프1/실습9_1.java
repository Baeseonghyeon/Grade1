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

public class 실습9_1 {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();

		book1.setTitle("노인과바다");
		book1.setAuthor("헤밍웨이");
		book1.setYear(1952);
		
		book2.setTitle("위대한 개츠비");
		book2.setAuthor("스콧 피츠제럴드");
		book2.setYear(1925);
		
		System.out.println("첫 번째 책");
		System.out.println("제목: " + book1.getTitle());
		System.out.println("작가: "+ book1.getAuthor());
		System.out.println("연도: "+book1.getYear());
		
		System.out.println("---------------------");
		
		System.out.println("두 번째 책");
		System.out.println("제목: " + book2.getTitle());
		System.out.println("작가: "+ book2.getAuthor());
		System.out.println("연도: "+book2.getYear());
		
	}

}
