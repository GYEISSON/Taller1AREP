package edu.escuelaing.arem.ASE.app;

public class Nodo {
	
	private double item;
	private Nodo next;
		
	public Nodo() {
		item=0;
		next = null;
	}
	public Nodo(double item) {
		this.item = item;
		next = null;
	}
	public Nodo(double item, Nodo nodo) {
		this.item=item;
		this.next=nodo;
	}
	public void setData(double newItem) {
		this.item = newItem;
	}
	public double getData() {
		
		return this.item;
	}
	public void link(Nodo node ) {
		this.next = node;
	}
	public Nodo getLinked() {
		
		return next;
	}
}
