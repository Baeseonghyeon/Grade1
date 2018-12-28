package Hw06;
import java.util.*;
public class 실습6_1 {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1,"APPLE");
		list.add(2,"GRAPE");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		LinkedList<String> list2=new LinkedList<>();
		
		list2.add("Zero");
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.set(2,"이");
		list2.remove();
		
		Iterator<String> i=list2.iterator();
		System.out.println(list2);
		while(i.hasNext()) {
			String s=i.next();
			System.out.println(s);
		}
		
	}

}
