package stringStringBufferStringBuilder;

public class DifferenceInLiteralwayAndNewKeyword {

	public static void main(String[] args) {

		String s = "cricket";
	
		String s1 = "cricket";
	
		String str = new String("like");

		String str1 = new String("like");

		System.out.println("s == s1" + (s == s1));// if string declare in literal way 2 diff. string can store in sting
													// constant pool having same address
	
		System.out.println(str == str1); // if string declare with new keyword then it store in heap memory having
											// different address
	}
}
                                            // this program only deals with address of variable