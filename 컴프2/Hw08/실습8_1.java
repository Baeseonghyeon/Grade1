package Hw08;
import java.util.*;
class LinkedList<T> implements List<T>{
	private Node<T> head;
	private Node<T> tail;
	private int size=0;
	@Override
	public String toString() {
		if(head==null)
			return "[]";
		Node<T> temp=head;
		StringBuilder str=new StringBuilder("[");
		while(temp.next!=null) {
			str.append(temp.data+", ");
			temp=temp.next;
		}
		str.append(temp.data);
		return new String(str+"]");
	}
	private class Node<E>{
		private E data;
		private Node<E> next;
		
		private Node(E input) {
			this.data=input;
			this.next=null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	@Override
	public boolean add(int index, T element) {
		if(index<0||index>size)
			throw new IndexOutOfBoundsException();
		if(index==0) {
			addFirst(element);
		}else {
			Node<T> temp1=node(index-1);
			Node<T> temp2=temp1.next;
			Node<T> newNode=new Node<>(element);
			temp1.next=newNode;
			newNode.next=temp2;
			size++;
			if(newNode.next==null)
				tail=newNode;
		}
		return true;
	}
	@Override
	public boolean addFirst(T element) {
		Node<T> newNode=new Node<>(element);
		newNode.next=head;
		head=newNode;
		size++;
		if(head.next==null)
			tail=head;
		return true;
	}
	@Override
	public boolean addLast(T element) {
		if(isEmpty()) {
			addFirst(element);
		}else {
			Node<T> newNode=new Node<>(element);
			tail.next=newNode;
			tail=newNode;
			size++;
		}
		return true;
	}
	@Override
	public T remove(int index) {
		if(index<0||index>=size)
			throw new IndexOutOfBoundsException();
		if(index==0)
			return removeFirst();
		
		Node<T> temp=node(index-1);
		Node<T> nodeToDelete=temp.next;
		temp.next=temp.next.next;
		T returnData=nodeToDelete.data;
		if(nodeToDelete==tail)
			tail=temp;
		nodeToDelete=null;
		size--;
		return returnData;
	}
	@Override
	public T removeFirst() {
		Node<T> temp=head;
		head=temp.next;
		T returnData=temp.data;
		temp=null;
		size--;
		return returnData;
	}
	@Override
	public T removeLast() {
		return remove(size-1);
	}
	@Override
	public T set(int index, T element) {
		Node<T> temp=node(index);
		temp.data=element;
		return null;
	}
	@Override
	public T get(int index) {
		if(index<0||index>=size)
			throw new IndexOutOfBoundsException();
		return node(index).data;
	}
	@Override
	public int indexOf(T element) {
		Node<T> temp=head;
		int index=0;
		while(!(temp.next==null)) {
			if(temp.data.equals(element))
				return index;
			index++;
			temp=temp.next;
		}
		return -1;
	}
	private Node<T> node(int index){
		Node<T> x=head;
		for(int i=0;i<index;i++)
			x=x.next;
		return x;
	}
}
public class 실습8_1 {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		System.out.println("list size:"+list.size());
		System.out.println("list isEmpty?:"+list.isEmpty());
		System.out.println("list: "+list);
		for(int i=5;i>=0;i--)
			list.addFirst(i);
		for(int i=11;i<=15;i++)
			list.addLast(i);
		for(int i=6;i<=10;i++)
			list.add(i, i);
		System.out.println(list);
		
		System.out.println("리스트: "+list);
		System.out.println("removeFirst() 호출: "+list.removeFirst());
		System.out.println("removeLast() 호출:"+list.removeLast());
		System.out.println("remove(4) 호출: "+list.remove(4));
		System.out.println("변경된 리스트: "+list);
		System.out.println("get(5) 호출: "+list.get(5));
		list.set(2, 10);
		System.out.println(list);
	}

}

