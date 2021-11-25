package conditionalStatement;


public class NestedIfElseExample {
	public static void main(String[] args) {
		String s= "cat";
		if(s==" girl") {
			int age = 15;
			if(age<= 18) {
				System.out.println("i am a girl");
			}else {
				System.out.println("i am a women");
			}
		}
		else if(s== "boy") {
				int a = 15;
				if(a<=18) {
					System.out.println("I am a boy");
				}else {
					System.out.println("I am man");
				}
		}else {
				System.out.println("i am animal");
			}
		
		}
}
