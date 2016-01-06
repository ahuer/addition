package com.points.add;

public class Node {
	private int value;
	private Node next;
	
	@SuppressWarnings("unused")
	private Node() {}
	
	public Node(int value) {
		this.value = value;
		next = null;
	}
	
	public int getValue() {
		return value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}

}
