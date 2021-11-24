package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithIsEmptyMethod {   // check weather array is empty or not

	public static void main(String[] args) {
		
		List list = new ArrayList();       // array contain element so ans should be false

		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);
        list.add(null);
        
       System.out.println(list.isEmpty());
       
       List a = new ArrayList();    // array is empty so ans should be true
       
       System.out.println(a);
	}
}