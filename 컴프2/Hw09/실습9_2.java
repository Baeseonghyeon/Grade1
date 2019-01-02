package Hw09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 실습9_2 {

	public static void main(String[] args) throws IOException{
		FileReader inputStream=null;
		FileWriter outputStream=null;
		try {
			inputStream =new FileReader("input.txt");
			outputStream=new FileWriter("output.txt");
			
			int c;
			while((c=inputStream.read())!=-1) {
				if('a'<=c&&c<='w') {
					outputStream.write(c-29);
				}else if('x'<=c&&c<='z') {
					outputStream.write(c-55);
				}else if('A'<=c&&c<='W') {
					outputStream.write(c+3);
				}else if('X'<=c&&c<='Z') {
					outputStream.write(c-23);
				}else {
					outputStream.write(c);
				}
			}
		}finally {
			if(inputStream!=null) {
				inputStream.close();
			}
			if(outputStream!=null) {
				outputStream.close();
			}
		}
	}

}
