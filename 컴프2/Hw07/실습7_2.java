package Hw07;
class ArrayList<E> implements List<E>{
	private static final int DEFAULT_CAPACITY=10;
	private Object[] elementData;
	private int size=0;
			
	public ArrayList(){
		this.elementData=new Object[DEFAULT_CAPACITY];
	}
	public ArrayList(int size) {
		this.elementData=new Object[size];
	}
	@Override
	public boolean add(int index, E element) {
		if(index!=0&&this.elementData[index-1]==null) {
			return false;
		}
		for(int i=size-1;i>=index;i--) {
			elementData[i+1]=elementData[i];
		}
		elementData[index]=element;
		size++;
		return true;
	}

	@Override
	public boolean addFirst(E element) {
		return add(0,element);
	}

	@Override
	public boolean addLast(E element) {
		if(size==elementData.length) {
			resize();
		}
		this.elementData[size++]= element;
		return false;
	}

	@Override
	public E remove(int index) {
		if(elementData[index]==null) {// 요소가 없으면  널 반환
			return null;
		}
		Object obj = this.elementData[index];
		
		for(int i=index+1;i<=size-1;i++) {
			this.elementData[i-1]=this.elementData[i];
		}
		size--;
		elementData[size]=null;
		return (E)obj;
	}

	@Override
	public E removeFirst() {
		return this.remove(0);
	}

	@Override
	public E removeLast() {
		return this.remove(size-1);
	}

	@Override
	public E set(int index, E element) {
		elementData[index]=element;
		return (E)elementData[index];
	}

	@Override
	public E get(int index) {
		return (E)this.elementData[index];
	}

	@Override
	public int indexOf(E element) {
		for(int i=0;i<size;i++) {
			if(element.equals(elementData[i]))
				return i;
		}
		return -1;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		if(elementData[0]==null) {//요소가 없으면 isempty는 참
			return true;
		}
		return false;
	}
	public String toString() {
		StringBuilder str=new StringBuilder("[");
		for(int i=0;i<size;i++) {
			str.append(elementData[i]);
			if(i<size-1)
				str.append(", ");
		}
		str.append("]");
		return new String(str);
	}
	private void resize() {
		Object temp[]= new Object[size*2];//복사 할 객체 사이즈를 2배 생성
		System.arraycopy(this.elementData, 0, temp, 0, this.elementData.length);//기존의 요소를 temp에 넣음. 
		this.elementData=temp;
	}
	
}
public class 실습7_2 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>(50);
		list1.addLast(10);
		list1.addLast(20);
		list1.addLast(30);
		list1.add(1, 15);
		list1.addFirst(-10);
		System.out.println(list1);
		System.out.println("size: "+list1.size());
		System.out.println("20의 index: "+list1.indexOf(20));
		System.out.println("100의 index: "+list1.indexOf(100));
		System.out.println(list1.remove(2));
		System.out.println(list1.removeLast());
		System.out.println(list1.removeFirst());
		System.out.println(list1.get(0));
		System.out.println(list1);

	}

}
