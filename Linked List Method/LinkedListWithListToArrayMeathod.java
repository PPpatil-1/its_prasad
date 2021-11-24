package linkedListMethod;

import java.util.LinkedList;
import java.util.List;

public class LinkedListWithListToArrayMeathod {

	public static void main(String[] args) {
		
		  List list = new LinkedList();
			
			list.add(null);
			list.add(60);
			list.add(true);
			list.add("prasad");
			list.add('a');
			list.add(60);
			
			Object[] arr = list.toArray();     
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
	}
}
