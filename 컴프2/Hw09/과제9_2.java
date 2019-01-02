package Hw09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class 과제9_2 {

	public static void main(String[] args) throws IOException{
		Map<String,String> ID=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		BufferedReader br =new BufferedReader(new FileReader("Identity.txt"));
		PrintWriter bw =new PrintWriter(new FileWriter("Identity.txt",true));
		
		try {
			String l;
			while((l=br.readLine())!=null) {
				String[] st=l.split(",");
				ID.put(st[0], st[1]);
			}
		}finally {
			if(br!=null) {
				br.close();
			}
			if(bw!=null) {
				bw.close();
			}
		}

		while(true) {
		System.out.print("로그인 하거나 ID가 없으면 회원가입하세요. (1. 로그인  2. 회원가입  3. 종료): ");
		int n=sc.nextInt();
		if(n==1) {
			while(true) {
			System.out.print("ID를 입력하세요.(1.처음으로  2.종료)");
			String a=sc.next();
			if(a.equals("1")) break;
			else if(a.equals("2")) {
				System.out.println("종료");
				System.exit(0);
			}
			if(ID.get(a)==null) {
				System.out.println("존재하지 않는 아이디 입니다.");
				continue;
				}else {
					System.out.print("비밀번호를 입력하세요.");
					String b=sc.next();
					if(!ID.get(a).equals(b)) {
						System.out.println("잘못된 비밀번호 입니다.");
						continue;
					}else {
						System.out.println("로그인 되었습니다.");
						while(true) {
							System.out.print("1. 비밀번호 수정 2. 종료:");
							int k=sc.nextInt();
							if(k==1) {
								System.out.print("본인의 ID를 한번 더 입력하세요:");
								String temp=sc.next();
								if(a.equals(temp)) {
									System.out.print("비밀 번호를 입력하세요");
									temp=sc.next();
									if(temp.equals(b)) {
										System.out.println("확인되었습니다.");
										System.out.print("새로운 비밀번호를 입력하세요: ");
										temp=sc.next();
										ID.put(a, temp);
										System.out.println("변경 완료.");
										br =new BufferedReader(new FileReader("Identity.txt"));
										
										String st="";
										try {
											String l;
											while((l=br.readLine())!=null) {
												if(l.equals(a+","+b)) {
													st+=a+","+temp+"\r\n";
													continue;
												}
												st+=l+"\r\n";
											}
										}finally {
											if(br!=null) {
												br.close();
											}
										}
										bw =new PrintWriter(new FileWriter("Identity.txt"));
										bw.write(st);
										System.out.println(st);
										bw.close();
									}
									else {
										System.out.println("비밀번호가 틀립니다.");
									}
									
								}else {
									System.out.println("ID가 틀립니다.");
								}
							
						}else {
							System.out.println("종료");
							System.exit(0);
						}
					}
					}
				}
			}
		}
		
		else if(n==2) {
			while(true) {
			System.out.print("새로운 ID를 입력하세요: ");
			String a=sc.next();
			if(ID.get(a)!=null) {
				System.out.println("존재하는 ID입니다.");
				continue;
				}
			else {
				System.out.print("비밀번호를 입력하세요: ");
				String b=sc.next();
				bw=new PrintWriter(new FileWriter("Identity.txt",true));
				String s=a+","+b+"\r\n";
				bw.write(s);
				ID.put(a, b);
				bw.close();
				break;
			}
			}
		}
		
		else if(n==3) {
			System.out.println("종료");
			break;
		}
		}
	}

}
