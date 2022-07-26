package com.stackandqueue;

public class Stack {

	LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addFirst(data);
	}

	public void pop() {
		list.deleteFirst();
	}

	public void display() {
		list.display();
	}
}
