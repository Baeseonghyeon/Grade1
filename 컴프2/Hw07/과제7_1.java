package Hw07;

public class 과제7_1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(3);
		for(int i=0;i<20;i++) {
			list.addLast(i);
		}
		System.out.println(list);
		//list=new ArrayList<>(3);
		list.add(2, 30);
		System.out.println("List: "+list+"\n"+"size: "+list.size());
		list=new ArrayList<>(3);
		System.out.println(list.remove(0));
	}

}
