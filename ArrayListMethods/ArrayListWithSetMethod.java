package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithSetMethod {         // this method is use replace any element

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);

		list.set(1, 90);             
		System.out.println(list);
		
		List a = new ArrayList();

	
	}
}
