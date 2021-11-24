package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithRemoveMethod {       // to remove perticular element or whole array from one array

	public static void main(String[] args) {
		
		List list = new ArrayList();       

		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);
        
        Object obj =  new Integer (60);    //  to create object of that particular element
        list.remove(obj);                  // apply remove method
        System.out.println(list);
        
        List list1 = new ArrayList();       

		list1.add(null);
		list1.add(60);
		list1.add(true);
		
		list.removeAll(list1);             // to remove whole array from given array 
		
		System.out.println(list);
		
	}
}