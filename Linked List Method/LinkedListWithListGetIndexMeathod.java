package linkedListMethod;

import java.util.LinkedList;
import java.util.List;

public class LinkedListWithListGetIndexMeathod {

	public static void main(String[] args) {
		
        List list = new LinkedList();
		
		list.add(null);
		list.add(60);
		list.add(true);
		list.add("prasad");
		list.add('a');
		list.add(60);
		
		System.out.println(list.indexOf('a'));  // find index of any element
		
		System.out.println(list.isEmpty());     // check weather list is empty or not
		
		System.out.println(list.size());        // give size of list
		
		System.out.println(list.get(1));        // get an element from given index
		
		System.out.println(list.lastIndexOf(60));   // give index which check from last of list
		
		list.forEach(element->System.out.println(element));   // read the list complete
		
	}
}