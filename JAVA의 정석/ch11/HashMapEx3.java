package ch11;
import java.util.*;
public class HashMapEx3 {
	static HashMap phoneBook = new HashMap();
	public static void main(String[] args) {
		addPhoneNo("친구","이자바","010-111-1111");
		addPhoneNo("친구","이자바","010-222-3333");
		addPhoneNo("회사","이자바","010-222-4564");
		addPhoneNo("여친","이자바","010-555-1161");
		addPhoneNo("남친","이자바","010-461-6666");
		
		printList();
		

	}
	static void addPhoneNo(String groupName,String name,String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
		
	}
	static void addPhoneNo(String name,String tel) {
		addPhoneNo("기타",name,tel);
	}
	
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt= subSet.iterator();
			
			System.out.println("*"+e.getKey()+"["+subSet.size()+"]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name+":"+telNo);
				
			}
			System.out.println();
		}
	}
}
