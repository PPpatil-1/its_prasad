package conditionalStatement;

import java.util.Scanner;

public class UseOfScanner {
public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
     System.out.println("enter int value");
		int  a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println("a is even number");
		}
		
}
}
