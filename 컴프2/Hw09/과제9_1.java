package Hw09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class 과제9_1 {

	public static void main(String[] args) throws IOException{
		Scanner s=null;
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		StringBuilder ans=new StringBuilder("");
		int cnt=0;
		try {
			s=new Scanner(new BufferedReader(new FileReader("sample.txt")));
			while(s.hasNext()) {
				String a=s.next();
				arr.add(a);
			}
		}finally {
			if(s!=null) {
				s.close();
			}
		}
		String a=arr.get((int)(Math.random()*arr.size()));
		int n=a.length()*2;
		for(int i=0;i<a.length();i++) {
			ans.append("_ ");
		}
		System.out.println("행맨 게임!\n(제한 횟수는 )"+n+"번입니다.");
		for(int i=0;i<n;i++) {
			System.out.println("현재 상태: "+ans);
			System.out.print("문자를 입력해주세요(한글자): ");
			String str=sc.next();
			while(str.length()>=2) {
				System.out.print("한글자만 입력하세요: ");
				str=sc.next();
			}
			for(int j=0;j<a.length();j++) {
				if((a.charAt(j)+"").toUpperCase().equals(str)||(a.charAt(j)+"").toLowerCase().equals(str)) {
					if(!((a.charAt(j)+"").toUpperCase().equals(ans.charAt(j*2)+"")||(a.charAt(j)+"").toLowerCase().equals(ans.charAt(j*2)+""))) {
					ans.setCharAt(j*2, a.charAt(j));
					cnt++;
					}
				}
				if(cnt==a.length()) {
					System.out.println("정답을 맞췄습니다.");
					System.exit(0);
				}
			}
		}
		System.out.println("정답을 맞추지 못했습니다.\n정답: "+a);
	}

}
