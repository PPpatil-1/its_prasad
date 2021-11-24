package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithAddMethod {

	public static void main(String[] args) {
		
		List list = new ArrayList();
	
		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);
		
		System.out.println(list);
		
		List list1 = new ArrayList();
		
		list1.add("viraj");
		list1.add('v');
		
		list1.addAll(list);            // add all values in another array to this aaray
		System.out.println(list1);
	
		list1.add(2, false);            // add value in array with specified location we should give index and value
		System.out.println(list1);
	
		list1.addAll(0, list);         // add full array with specified location
        System.out.println(list1);
	}
}
