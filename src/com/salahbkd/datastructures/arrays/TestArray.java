package com.salahbkd.datastructures.arrays;

public class TestArray {

	public static void main(String[] args) {
		Array arr = new Array(3);
		arr.insert(10);
		arr.insert(20);
		arr.insert(30);
		arr.insert(40);
		arr.insert(50);
		arr.removeAt(4);
		System.out.println("value: " + arr.indexOf(1000));
		arr.print();
	}

}
