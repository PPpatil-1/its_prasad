package collectionFramework;

import java.util.ArrayList;

public class ArrayListWithEnsureCapacityMethod {     // this method only that much amount of capacity which you provide so that memory do not get wasted 

	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		a.add(null);
		a.add(60);
		a.add(true);
		a.add(56.14f);

		a.ensureCapacity(4);
		System.out.println(a);
	}
}
