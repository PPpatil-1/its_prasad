package linkedListWithDeque;

import java.util.Deque;
import java.util.LinkedList;

public class linkedListWithDequeContainMethod {

	public static void main(String[] args) {
		
		Deque a = new LinkedList();  
		
		a.add(100);
		a.add(null);
		a.add(true);
		a.add("Viraj");
		a.add('v');
		
		System.out.println(a.contains('v')); //check weather element present or not
		
        Deque a1 = new LinkedList();  
		
		a1.add(100);
		a1.add(true);
		
		System.out.println(a.containsAll(a1)); // check weather all element present or not
		
        Deque a2 = new LinkedList();  
		
		a2.add(100);
		a2.add(null);
		a2.add(true);
		a2.add("Viraj");
		a2.add('v');
		
		System.out.println(a.equals(a2));   // check weather same element present in same order
		
	}
}
