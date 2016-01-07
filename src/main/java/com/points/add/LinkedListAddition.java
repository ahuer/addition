package com.points.add;

public class LinkedListAddition {
	private int carry;
	
	public LinkedListAddition() {
		carry = 0;
	}
	
	public Node add(Node num1, Node num2) throws NumberFormatException {
		if (num1 == null || num2 == null ) {
			throw new NumberFormatException("Linked List provided was null");
		}
		
		Node sum = null;
		Node firstNum = num1;
		Node secondNum = num2;
		while (firstNum != null ) {
			
		}
		return sum;
	}
	
	public static Node createReversedLinkedListFromString(String numberString) throws NumberFormatException{
		if (numberString == null || numberString.isEmpty() ) {
			throw new NumberFormatException("String provided was null or empty");
		}
		
		Node headNode = null;
		try {
			
			for (int i = 0; i < numberString.length(); i++ ) {
				String digit = String.valueOf(numberString.charAt(i));
				int num = Integer.parseInt(digit);
				
				Node node = new Node(num);
				node.setNext(headNode);
				headNode = node;
			}
			
		} catch (NumberFormatException ex) {
			throw new NumberFormatException("String provided was not a number");
		}
		
		return headNode;
	}
	
	public static String createStringFromReversedLinkedList(Node node) {
		StringBuilder s = new StringBuilder();
		
		Node currentNode = node;
		while (currentNode != null ) {
			int value = currentNode.getValue();
			s.insert(0,value); //prepend
			currentNode = currentNode.getNext();
		}
		return s.toString();
	}	

}
