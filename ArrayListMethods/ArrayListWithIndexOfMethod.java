package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithIndexOfMethod {        // to find index of perticular element

	public static void main(String[] args) {
	
		List list = new ArrayList();

		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);
        list.add(null);
        
		System.out.println(list.indexOf(60));     // index checking in regular way
		
		System.out.println(list.lastIndexOf(null));   // index giving in opposite way
}
}