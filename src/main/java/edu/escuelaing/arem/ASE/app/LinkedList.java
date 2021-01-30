package edu.escuelaing.arem.ASE.app;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class LinkedList extends AbstractSequentialList<Object> {
	
	private Nodo head;
	private int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirs(double item) {
		if(empty()) {
			head = new Nodo(item);
		} 
		else {
			Nodo temp = head;
			Nodo newNodo = new Nodo(item);
			newNodo.link(temp);
			head = newNodo;	
		}
		size++;
		
	}
	@Override
	public Object remove(int index) {
		Nodo item = null;
		if(index==0) {
			item = (Nodo)removeFirst();
		}else {
			int count=0;
			Nodo temp = head;
			while(count<index-1) {
				temp = temp.getLinked();
				count++;
			}
			item = temp.getLinked();
			if(temp.getLinked().getLinked()!=null) {
				temp.link(temp.getLinked().getLinked());
			}
			size--;
		}
		
		return item;
	}
	public Object removeFirst() {
		Nodo item = head;
		head = head.getLinked();
		size--;
		
		return item;
	}
	public double getIndex(int index) {
		int count=0;
		Nodo temp=head;
		while(count < index) {
			temp = 	temp.getLinked();
			count++;
		}
		
		return temp.getData();
	}
	public boolean empty() {
		
		return (head == null)?true:false;
	}
	@Override
	public int size() {
		
		return size;
	}
	@Override
	public ListIterator listIterator(int arg0) {
		
		return null;
	}
}
