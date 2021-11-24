package linkedListWithDeque;

import java.util.Deque;
import java.util.LinkedList;

public interface linkedListWithDequeAddMethod {    

	public static void main(String[] args) {
		
		Deque a = new LinkedList();   // deque as parent
		 
		a.add(100);
		a.add(null);
		a.add(true);
		a.add("Viraj");
		a.add('v');
		
		System.out.println(a);
		
		System.out.println(a.size());   // find size of list
		
		a.add(false);                //  add element in list
		System.out.println(a);
		
		Deque a1 = new LinkedList();
		
		a1.add(50);
		a1.add("prasad");
		
		a.addAll(a1);                  // add collection in list
		System.out.println(a);
		
		a.addFirst(22);                 // add element at 0 th index
		System.out.println(a);
		
		a.addLast('P');                 // add element in last of list
		System.out.println(a);
		
		a.clear();                      // clear the list
		System.out.println(a);
		
		a.size();
		System.out.println(a);
	}
}
