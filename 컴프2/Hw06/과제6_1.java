package Hw06;
import java.util.*;
import java.util.Map.Entry;
public class 과제6_1 {

	public static void main(String[] args) {
		
		String str="Hello";
		StringOneHot soh= new StringOneHot(str);
		System.out.println("문자열:"+soh.getString());
		System.out.println("문자열set: "+soh.getStrSet());
		System.out.println("문자열Map: "+soh.getStrMap());
		System.out.println("문자열 One-hot Vector : "+soh.getStrOneHotVec());
		
		System.out.println("One-hot Vector로 나타낸 "+soh.getString());
		for(int i=0;i<str.length();i++) {//d=str.sybstring의 value 값을 출력
			System.out.println(soh.getStrOneHotVec().get(str.substring(i, i+1)));
		}
	}

}
class StringOneHot{
	private String s;
	private HashSet<String> set=new HashSet<>();//해쉬셋을 설정
	public StringOneHot(String s) {//String 값을 받아옴
		this.s=s;
	}
	public String getString() {//s값 반환
		return s;
	}
	public Set<String> getStrSet(){
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i)+"");//set에 String값 저장
		}
		return set;
	}
	public Map<Integer,String> getStrMap(){//Map의 integer값과 String 값을 저장
		Map<Integer,String> map=new HashMap<>();
			Iterator<String> it=set.iterator();//set의 값을 하나씩 불러옴
			int cnt=0;//key값 저장하기 위해 카운트 셈
			while(it.hasNext()) {
				String s2=it.next();//set의 하나값을 s2에 저장
				map.put(cnt, s2);//map에 key와 value값 저장
				cnt++;
			}
		
		return map;
	}
	public Map<String,Vector<Integer>> getStrOneHotVec() {//map의 vlaue 값에 벡터 저장
		Map<String,Vector<Integer>> map=new HashMap<>();
		Iterator<String> it=set.iterator();
		int cnt=0;
		while(it.hasNext()) {
			String s2=it.next();
			Vector<Integer> v=new Vector<>(set.size()-1);//벡터 생성 용량값 설정
			for(int i=0;i<set.size();i++) {
				if(cnt==i) {
					v.add(i, 1);//set의 key값과 같으면 1
				}
				else {
					v.add(i,0);//아니면 0
				}
			}
			map.put(s2, v);
			cnt++;
		}
		return map;
	}
	
	
}