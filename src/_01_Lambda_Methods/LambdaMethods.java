package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			StringBuilder sb = new StringBuilder(s);
			System.out.println(sb.reverse().toString());
		}, "backwards");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			StringBuilder sb = new StringBuilder();
			boolean ticker = true;
			for(int i = 0; i < s.length(); i++) {
				if(ticker) {
					sb.append(s.substring(i, i+1).toUpperCase());
					ticker = false;
				}
				else{
					sb.append(s.substring(i, i+1).toLowerCase());
					ticker = true;
				}
			}
			System.out.println(sb.toString());
		}, "upperlower");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < s.length(); i++) {
				sb.append(s.charAt(i));
				sb.append('.');
			}
			System.out.println(sb.toString());
		}, "periods");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
					sb.append(s.charAt(i));
				}
			}
			System.out.println(sb.toString());
		}, "xvowels");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
