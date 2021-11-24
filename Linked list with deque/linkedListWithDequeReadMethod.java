package linkedListWithDeque;

import java.util.Deque;
import java.util.LinkedList;

public class linkedListWithDequeReadMethod {

	public static void main(String[] args) {
		
	    Deque a = new LinkedList();  
		
		a.add(100);
		a.add(null);
		a.add(true);
		a.add("Viraj");
		a.add('v');
		
		System.out.println(a.peek());           //  only Read 1st element
		
		System.out.println(a.peekFirst());      // only Read 1st element
		
		System.out.println(a.peekLast());       // only Read last element
		
		a.poll();
		System.out.println(a);                  // remove 1st element and read remaining
		
		a.pollFirst();
		System.out.println(a);                  // remove 1st element and read remaining
		
		a.pollLast();
		System.out.println(a);                  // remove last element and read remaining
		
		a.push(100);
		System.out.println(a);                  // add 1st  element 
		
		a.pop();
		System.out.println(a);                  // Remove 1st element
	}
	
}
