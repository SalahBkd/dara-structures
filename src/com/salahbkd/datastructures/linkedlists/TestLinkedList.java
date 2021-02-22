package com.salahbkd.ads.linkedlists;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addLast(20);
		ll.addLast(30);
//		ll.addLast(40);
//		ll.addLast(50);
//		ll.printMiddle();
		System.out.println(ll.hasALoop());
	}

}
