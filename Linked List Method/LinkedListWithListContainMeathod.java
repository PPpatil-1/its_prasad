package linkedListMethod;

import java.util.LinkedList;
import java.util.List;

public class LinkedListWithListContainMeathod {

	public static void main(String[] args) {
		
        List list = new LinkedList();
		
		list.add(null);
		list.add(40);
		list.add(true);
		list.add("prasad");
		list.add('a');
		
		System.out.println(list.contains(40)); // check weather element 
		                                       //  is contain or not
		
        List list1 = new LinkedList();
		
		list1.add(40);          
		list1.add("prasad");
		list1.add(true);
		
		System.out.println(list.containsAll(list1));  // check weather collection
                                                      //  is contain or not
		
		
		
        List list2 = new LinkedList();
		
		list2.add(null);
		list2.add(40);
		list2.add(true);
		list2.add("prasad");
		list2.add('a');
		
		System.out.println(list.equals(list2));   // check weather collection
                                                  //  is contain or not 
		                                          // with same element and same order
		
		
	}
}
