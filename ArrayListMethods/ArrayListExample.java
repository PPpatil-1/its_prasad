package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List list = new ArrayList(); // as list is parent of arraylist class we can make object as taking reference
										// parent to child in array list we can add various datatype value in same array

		list.add(50);                // add integer value
		list.add(53.14f);            // add double value
		list.add(true);              // add boolean value
		list.add('p');               // add character value
		list.add("prasad");          // add string value

		System.out.println(list);

	}
}
