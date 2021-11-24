package linkedListMethod;

import java.util.LinkedList;
import java.util.List;

public class LinkedListWithListRemoveMeathod {    // remove element or collection of element

	public static void main(String[] args) {
		
        List list = new LinkedList();
		
		list.add(null);
		list.add(60);
		list.add(true);
		list.add("prasad");
		list.add('a');
		list.add(60);
		
		Object obj = new Character('a');    
		list.remove('a')(obj);
		System.out.println(list);         // remove particular element
		
		 list.set(0, 53);
		 System.out.println(list);        // to change value of any element

        List list1 = new LinkedList();
		
		list1.add(60);          
		list1.add("prasad");
		list1.add(true);
		
		Object obj1 = new Integer(0);
		list.removeAll(list1);                // remove collection of element from list
	    System.out.println(list);	
	    
	    
	}	
}

