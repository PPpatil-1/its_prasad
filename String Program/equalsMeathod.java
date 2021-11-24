package stringStringBufferStringBuilder;

public class equalsMeathod {

	public static void main(String[] args) {
		
		String s = "prasad";
	
		String s1 = "prasad";
	
		String str = new String("patil");
	
		String str1 = new String("patil");

	
		System.out.println("s==s1" + (s.equals(s1)));// == meathod verify address of varible
	
		System.out.println(str.equals(str1)); // equal() meathod verify context of varible
	}
}
