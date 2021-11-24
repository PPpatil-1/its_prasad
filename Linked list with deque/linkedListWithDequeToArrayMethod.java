package linkedListWithDeque;

import java.util.Deque;
import java.util.LinkedList;

public class linkedListWithDequeToArrayMethod {

	public static void main(String[] args) {
		
		    Deque a = new LinkedList();  
			
			a.add(100);
			a.add(null);
			a.add(true);
			a.add("Viraj");
			a.add('v');
			
			Object[] obj = a.toArray();
			for (int i = 0; i < obj.length; i++) {
				System.out.println(obj[i]);
			}
	}
}
