package Hw09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {

	public static void main(String[] args) throws IOException{
		BufferedReader inputStream=new BufferedReader(new FileReader("Identity.txt"));;
		PrintWriter outputStream=new PrintWriter(new FileWriter("Identity2.txt",true));;
		
		try {
			
			
			String l;
			while((l=inputStream.readLine())!=null) {
				outputStream.write(l);
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
