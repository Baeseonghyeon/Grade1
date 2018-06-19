import java.io.*;
import java.util.Date;
public class �ǽ�14_3 {

	public static void main(String[] args) throws IOException {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("object.txt"));
			out.writeObject(new Date());
			out.flush();
			
			in = new ObjectInputStream(new FileInputStream("object.txt"));
			Date d = (Date) in.readObject();
			System.out.println(d);
		} catch(ClassNotFoundException e) {
			System.out.println("�ش��ϴ� Ŭ������ �����ϴ�.");
		}
		finally {
			if(in!=null)
				in.close();
			if(out!=null) {
				out.close();
			}
		}
		
	}

}
