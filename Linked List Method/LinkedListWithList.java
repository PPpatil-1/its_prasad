package linkedListMethod;

import java.util.LinkedList;
import java.util.List;

public interface LinkedListWithList {  // LinkedList with list method

	public static void main(String[] args) {
		
		List list = new LinkedList();
		
		list.add(null);
		list.add(40);
		list.add(true);
		list.add("prasad");
		list.add('a');
		
		System.out.println(list);
		
		list.add(null);     //  add element in list
		
		System.out.println(list);
		
		List list1 = new LinkedList();
		
		list1.add(15);          
		list1.add("viraj");
		list1.add(false);
		
		list1.addAll(list);       // add collection in list
		System.out.println(list1);
		
		list.add(2, 60);          // add element with specified index
     	System.out.println(list);

     	list.addAll(1,list1);     // add collection with specified index
     	System.out.println(list);
	
     	list.clear();             // clear the element in array
     	System.out.println();
	}
}
