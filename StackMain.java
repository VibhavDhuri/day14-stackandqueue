package com.stackandqueue;

public class StackMain {

	public static void main(String[] args) {

		Stack stack = new Stack();
		System.out.println("Stack Adding:");
		stack.push(70);
		stack.display();
		stack.push(30);
		stack.display();
		stack.push(56);
		stack.display();
		System.out.println();
		System.out.println("Stack Deleting:");
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();

	}

}
