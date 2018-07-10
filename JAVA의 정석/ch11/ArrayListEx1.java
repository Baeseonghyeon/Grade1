package ch11;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);//기본 길이가 10인 객체
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		list.add(333);//list.add(new Integer(333));
		
		System.out.println(list);
		list.add(0,"000");
		
		System.out.println(list);
		
		System.out.println("index="+list.indexOf("333"));
		
		list.remove("333");
		System.out.println(list);
		
		System.out.println(list.remove("333"));
		System.out.println("index="+list.indexOf("333"));
		
		System.out.print("{");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+", ");
			
		}
		System.out.print("}");
		
	}

}
