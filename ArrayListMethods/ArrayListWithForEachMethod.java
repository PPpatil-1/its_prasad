package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithForEachMethod {         // to read all the element in the array

	public static void main(String[] args) {
		
		List list = new ArrayList();

		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);
      
		list.forEach(element->System.out.println(element));
	}
}
