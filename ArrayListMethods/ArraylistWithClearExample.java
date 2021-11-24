package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArraylistWithClearExample {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);
		
	   list.clear();                // to remove all the element in array
	}
}
