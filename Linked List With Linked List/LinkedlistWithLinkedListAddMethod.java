package linkedlistWithLinkedList;

import java.util.LinkedList;

public interface LinkedlistWithLinkedListAddMethod {

	public static void main(String[] args) {
		
		LinkedList a = new  LinkedList ();
		
		a.add(100);
		a.add(null);
		a.add(true);
		a.add("Viraj");
		a.add('v');
		
		a.add(100);
		System.out.println(a);              // add element
		
		a.add(1," Prasad");
		System.out.println(a);             // add element with specified position
		
		LinkedList a1 = new  LinkedList ();
		
		a1.add(50);
		a1.add("patil");
		
		a.addAll(a1);
		System.out.println(a);             // add collection 
		
		a.addAll(0, a1);
		System.out.println(a);            // add collection with specified position
		
		a.addFirst('W');
		System.out.println(a);            // add element at 0th index
		
		a.addLast(false); 
		System.out.println(a);            // add element at last 
	} 
}
