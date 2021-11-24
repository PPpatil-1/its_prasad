package linkedlistWithLinkedList;

import java.util.LinkedList;

public class inkedlistWithLinkedListClearMethod {

	public static void main(String[] args) {
		
        LinkedList a = new  LinkedList ();
		
		a.add(100);
		a.add(null);
		a.add(true);
		a.add("Viraj");
		a.add('v');
		
		a.clone();
		System.out.println(a);                    // read the list
		
		System.out.println(a.contains(10));      // contain element in list or not
		
	    LinkedList a1 = new  LinkedList ();
		
		a1.add(100);
		a1.add("Viraj");
		
		System.out.println(a.containsAll(a1));   // contain all element in list or not
		
		System.out.println(a.element());         // read 1st element
		
		LinkedList a2 = new  LinkedList ();
			
	    a2.add(100);
	    a2.add(null);
	    a2.add(true);
		a2.add("Viraj");
		a2.add('v');
		
		System.out.println(a.equals(a2));        // equal two list or not
		
		a.clear();
		System.out.println(a);                   // clear the list
		
	}
}
