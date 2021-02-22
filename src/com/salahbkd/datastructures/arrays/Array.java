/*
 * Dynamic array class implementation
 * 
 * */
package com.salahbkd.datastructures.arrays;

public class Array {
	private int[] items;
	private int count;
	
	public Array(int length) {
		items = new int[length];
	}
	
	public void insert(int item) {
		if(items.length == count) {
			int[] tempItems = new int[items.length*2];
			for (int i = 0; i < items.length; i++) {
				tempItems[i] = items[i];
			}
			items = tempItems; 
		}
		
		items[count] = item;
		count++; 
	}
	
	public void removeAt(int index) {
		if(index < 0 || index >= count) {
			throw new IllegalArgumentException();
		}
		items[index] = 0;
		for (int i = index; i < count; i++) {
			items[i] = items[i+1];
		}
		count--; 
	}
	
	public int indexOf(int item) { 
		for (int i = 0; i < count; i++) {
			if(items[i] == item) {
				return i;
			}
		}
		return -1;	
	}
	
	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
}
