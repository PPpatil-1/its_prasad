package collectionFramework;

import java.util.ArrayList;

public class ArrayListWithCloneMethod {            // to read all element of array

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(null);
		a.add(60);
		a.add(true);
		a.add(56.14f);

		a.clone();
		System.out.println(a);
	}
}
