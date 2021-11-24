package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithSizeMethod {         // find the size of array

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);

		int a = list.size();
		System.out.println(a);
	}
}
