package stringStringBufferStringBuilder;

public class ReplaceMeathod {

	public static void main(String[] args) {
		
	String str = new String("selenium webdriver selenium webelement");
	
	String str1 = str.replace("e"," $"); // to replace a character in given string
	
		System.out.println(str1);
		
		String str2 = str.replace("ele", "ala"); // to replace sequence of character in given string
		
		System.out.println(str2);
		
		String str3 = str.replaceAll("selenium", "surgical"); // to replace all character or sequence of character in given string
		
		System.out.println(str3);
		
		String str4 = str.replaceFirst("selenium", "surgical"); // to replace only first character or sequence of character in given string
		
		System.out.println(str4);
	}
}
