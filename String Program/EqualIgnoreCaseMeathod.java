package stringStringBufferStringBuilder;

public class EqualIgnoreCaseMeathod {

	public static void main(String[] args) {

		String str = new String("prasad");
		
		String str1 = new String("Prasad");

		System.out.println(str.equalsIgnoreCase(str1)); // checking 2 string character ignoring cases
	}
}
