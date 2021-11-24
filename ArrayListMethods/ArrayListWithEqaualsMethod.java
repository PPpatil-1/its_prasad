package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithEqaualsMethod {        // check weather 1st and 2nd array having same element with same order or not

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);
		
		List a = new ArrayList();             
		
		a.add(null);
		a.add(60);
		a.add(true);
		a.add(56.14f);
		
		boolean result = list.equals(a);
		
		System.out.println(result);
	}
}
