package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithGetIndexOfMethod {    // to find element at perticular index

	public static void main(String[] args) {
	
		List list = new ArrayList();

		list.add(null);
		list.add(60);
		list.add(true);
		list.add(56.14f);
      
		System.out.println(list);
		
		for(int i= 0; i<list.size();i++) {
			
			System.out.println(list.get(i));
			
		}
		int i = 0;
		while( i<list.size()) {
			System.out.println(list.get(i));
            i++;
		}
		}
	
}
