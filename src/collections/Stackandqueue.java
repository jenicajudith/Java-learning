package collections;


//
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
//import java.util.*;
public class Stackandqueue {

	
	public void stack() {
		Stack<Integer> ticketbooking=new Stack<Integer>();
		ticketbooking.push(10);
		ticketbooking.push(20);
		ticketbooking.push(30);
	ticketbooking.push(40);
		ticketbooking.push(50);
		ticketbooking.pop();
		System.out.println(ticketbooking.peek());
		System.out.println(ticketbooking);
	}
	
	
	public void Queue() {
	Queue<String> foodordering=new LinkedList<String>();
	foodordering.add("anand");
	foodordering.add("arun");
	foodordering.add("harish");
	foodordering.poll();// first
	foodordering.poll();
	foodordering.offer("max");
	
	System.out.println(foodordering.peek());
	System.out.println(foodordering);
	
	}
	
	public void Dequeue() {
	Deque<Integer> trainbooking= new ArrayDeque<Integer>();
		
	trainbooking.addFirst(10);
	trainbooking.addLast(20);
	trainbooking.removeFirst();
	trainbooking.removeLast();
	trainbooking.pollFirst();
	trainbooking.pollLast();
	trainbooking.poll();
	trainbooking.offer(10);
	trainbooking.offerFirst(30);
	trainbooking.offerLast(30);
	trainbooking.remove(10);
	System.out.println(trainbooking);
		}
	
	public void blockedqueue() {
//		try {
		Queue<Integer> fixedsize= new LinkedBlockingQueue<Integer>(2);
		fixedsize.add(1);
		fixedsize.add(2);
//		fixedsize.add(3);

		System.out.println(fixedsize.offer(20));
		System.out.println(fixedsize);
		System.out.println(fixedsize.size());
//		}
//		catch (IllegalStateException e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
	}
	public void Dequeues() {
		Deque<Integer> term= new LinkedBlockingDeque<Integer>();
		
	}
	
	public void Prequeue() {
		PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
		queue.add(2);
		queue.add(3);
		queue.add(8);
		queue.add(7);
		queue.add(5);
		queue.add(1);
		
		System.out.println(queue);
	}
	
	
	public void PrequeueString() {
		PriorityQueue<String> priorityQueue= new PriorityQueue<String>();
		priorityQueue.add("anand");
		priorityQueue.add("kumar");
		priorityQueue.add("ben");
		priorityQueue.add("anand");
		priorityQueue.add("kumar");
		priorityQueue.add("ben");
		System.out.println(priorityQueue);
	}
	public void main(String[] args) {
		Stackandqueue stackandqueue= new Stackandqueue();
		stackandqueue.stack();
		stackandqueue.Queue();
		stackandqueue.Dequeue();
		stackandqueue.blockedqueue();
		System.out.println("h");
		stackandqueue.Prequeue();
		stackandqueue.PrequeueString();
	}
}
