package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArraylistWithContainsExample {     // check weather that element present in the method or not

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);
		
		boolean result = list.contains(null);      //  we can check null value also
	
		boolean result1 = list.contains(60);       // we can check any element in it
		
		System.out.println(result1);
	
		System.out.println(result);
		
         List a = new ArrayList();
		
		a.add(56.14f);
		a.add(60);
		
		boolean result2 = list.containsAll(a);      // total collection in a array is present in list or not 
		
		System.out.println(result2);            
		
	}
}
