package Hw07;

public class 실습7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface List<E>{
	public boolean add(int index,E element);
	public boolean addFirst(E element);
	public boolean addLast(E element);
	public E remove(int index);
	public E removeFirst();
	public E removeLast();
	public E set(int index,E element);
	public E get(int index);
	public int indexOf(E element);
	public int size();
	public boolean isEmpty();
}
