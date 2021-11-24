package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithToArrayMethod {   

	public static void main(String[] args) {
		
		List list = new ArrayList();

		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);

	Object[] arr = list.toArray();       
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	}
}
