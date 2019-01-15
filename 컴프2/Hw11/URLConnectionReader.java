package Hw11;
import java.net.*;
import java.io.*;
public class URLConnectionReader {

	public static void main(String[] args) throws Exception {
		URL naver =new URL("http://www.naver.com/");
		URLConnection nv=naver.openConnection();
		BufferedReader in =new BufferedReader(new InputStreamReader(nv.getInputStream()));
		String inLine;
		
		while((inLine=in.readLine())!=null)
			System.out.println(inLine);
		in.close();
	}

}
