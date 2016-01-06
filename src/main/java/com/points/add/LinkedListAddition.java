package com.points.add;

public class LinkedListAddition {
	private int carry;
	
	public LinkedListAddition() {
		carry = 0;
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
			s.append(value);
			currentNode = currentNode.getNext();
		}
		return s.toString();
	}

}
