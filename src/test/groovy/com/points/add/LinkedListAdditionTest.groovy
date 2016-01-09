package com.points.add

import static org.junit.Assert.*

import org.junit.Test

class LinkedListAdditionTest {

	@Test
	public void testCreateReversedList() {
		def num = "123"
		def node = LinkedListAddition.createReversedLinkedListFromString(num)
		assertEquals(3, node.getValue()) 
		def node2 = node.getNext()
		assertEquals(2, node2.getValue())
		def node3 = node2.getNext()
		assertEquals(1, node3.getValue())
		assertEquals(null, node3.getNext())
	}
	
	@Test
	public void testListToString() {
		def num = "123"
		def node = LinkedListAddition.createReversedLinkedListFromString(num)
		assertEquals("123", LinkedListAddition.createStringFromReversedLinkedList(node))
	}
	
	@Test
	public void testAddition() {
		def num = "129"
		def node = LinkedListAddition.createReversedLinkedListFromString(num)
		def adder = new LinkedListAddition()
		def sum = adder.add(node, node)
		assertEquals("258", LinkedListAddition.createStringFromReversedLinkedList(sum))
	}
	
	@Test
	public void testAdditionFirstNumLarger() {
		def num1 = "4612"
		def node1 = LinkedListAddition.createReversedLinkedListFromString(num1)
		def num2 = "37"
		def node2 = LinkedListAddition.createReversedLinkedListFromString(num2)
		def adder = new LinkedListAddition()
		def sum = adder.add(node1, node2)
		assertEquals("4649", LinkedListAddition.createStringFromReversedLinkedList(sum))
	}
	
	@Test
	public void testAdditionSecondNumLarger() {
		def num1 = "2015"
		def node1 = LinkedListAddition.createReversedLinkedListFromString(num1)
		def num2 = "50506"
		def node2 = LinkedListAddition.createReversedLinkedListFromString(num2)
		def adder = new LinkedListAddition()
		def sum = adder.add(node1, node2)
		assertEquals("52521", LinkedListAddition.createStringFromReversedLinkedList(sum))
	}
	
	@Test
	public void testAdditionSecondNumLargerWithCarry() {
		def num1 = "9515"
		def node1 = LinkedListAddition.createReversedLinkedListFromString(num1)
		def num2 = "50506"
		def node2 = LinkedListAddition.createReversedLinkedListFromString(num2)
		def adder = new LinkedListAddition()
		def sum = adder.add(node1, node2)
		assertEquals("60021", LinkedListAddition.createStringFromReversedLinkedList(sum))
	}
	
	@Test
	public void testAdditionMostSignificantDigitHasCarry() {
		def num1 = "3415"
		def node1 = LinkedListAddition.createReversedLinkedListFromString(num1)
		def num2 = "9123"
		def node2 = LinkedListAddition.createReversedLinkedListFromString(num2)
		def adder = new LinkedListAddition()
		def sum = adder.add(node1, node2)
		assertEquals("12538", LinkedListAddition.createStringFromReversedLinkedList(sum))
	}
	
}
