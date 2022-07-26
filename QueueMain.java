package com.stackandqueue;

public class QueueMain {

	public static void main(String[] args) {
		Queue queue = new Queue();
		System.out.println("Queue Enqueing:");
		queue.enQueue(56);
		queue.display();
		queue.enQueue(30);
		queue.display();
		queue.enQueue(70);
		queue.display();
		System.out.println();
		System.out.println("Queue Dequeing:");
		queue.display();
		queue.deQueue();
		queue.display();
		queue.deQueue();
		queue.display();
		queue.deQueue();
		queue.display();
	}

}
