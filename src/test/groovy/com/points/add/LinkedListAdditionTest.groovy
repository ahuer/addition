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
}
