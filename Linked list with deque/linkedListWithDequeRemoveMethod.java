package linkedListWithDeque;

import java.util.Deque;
import java.util.LinkedList;

public class linkedListWithDequeRemoveMethod {

	public static void main(String[] args) {
		
		    Deque a = new LinkedList();  
			
			a.add(100);
			a.add(null);
			a.add(true);
			a.add("Prasad");
			a.add('a');
			a.add(100);
			
			 a.remove(100);
			System.out.println(a);            // remove 1st element
			
			a.removeFirst();
		    System.out.println(a);            // remove 1st element  
			
			a.removeLast();
			System.out.println(a);            // remove last element
			
			a.removeFirstOccurrence(100);
			System.out.println(a);            // remove 1st  occurrence element
			
			a.removeLastOccurrence(100);
			System.out.println(a);           // remove last  occurrence element
			
			 Deque a1 = new LinkedList();  
				
				a1.add(100);
				a1.add(null);
				a1.add(true);
		
				a.removeAll(a1);
				System.out.println(a);       // remove collection
	}
}
