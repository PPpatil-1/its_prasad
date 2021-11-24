package linkedListWithDeque;

import java.util.Deque;
import java.util.LinkedList;

public class linkedListWithDequeGetIndexMethod {

	public static void main(String[] args) {
		
        Deque a = new LinkedList();  
		
		a.add(100);
		a.add(null);
		a.add(true);
		a.add("Viraj");
		a.add('v');
		
		System.out.println(a.getFirst());  // get 1st element value
		
		System.out.println(a.getLast());   // get last element vallue
		
		System.out.println(a.isEmpty());   // check weather list is empty or not
		
		System.out.println(a.size());      // find size of list
		
		a.offer(50);
		System.out.println(a);             // add element
		
		a.offerFirst("First");
		System.out.println(a);             // add element at 0 th index
		
		a.offerLast("last");
		System.out.println(a);             // add element at last
		
	
	}
}
