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
		
		Node sumFirstDigit = null;
		Node sumCurrentDigit = null;		
		Node firstNum = num1;
		Node secondNum = num2;
		
		while (firstNum != null ) {
			int sum = firstNum.getValue();
			firstNum = firstNum.getNext();
			
			if (secondNum != null ) {
				sum += secondNum.getValue();
				secondNum = secondNum.getNext();
			}			
			sum += carry;
			carry = 0;
			
			if (sum > 9 ) {
				carry = sum / 10;
				sum = sum % 10;
			}
			
			Node digit = new Node(sum);
			if (sumFirstDigit == null ) {
				sumFirstDigit = digit;
				sumCurrentDigit = digit;
				continue;
			}
			
			sumCurrentDigit.setNext(digit);
			sumCurrentDigit = digit;
		}
		
		while (secondNum != null ) {
			int sum = carry + secondNum.getValue();
			carry = 0;
			
			if (sum > 9 ) {
				carry = sum / 10;
				sum = sum % 10;
			}
			
			Node digit = new Node(sum);
			secondNum = secondNum.getNext();
			sumCurrentDigit.setNext(digit);
			sumCurrentDigit = digit;
		}
		
		if (carry > 0 ) {
			Node digit = new Node(carry);
			sumCurrentDigit.setNext(digit);
		}
		
		return sumFirstDigit;
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
