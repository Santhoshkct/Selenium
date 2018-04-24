package coding.challenges;

import java.util.Scanner;

public class StringPalindromeMar15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input String");
		String input = scan.next();
		scan.close();
		StringPalindromeMar15.palindrome(input);
	}
	public static void palindrome(String str) {
		int i=0;	
		for(i=0;i<(str.length())/2;i++)
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				break;
		if(i>=str.length()/2)
			System.out.println(str + " is a Palindrome");
		else
			System.out.println(str + " is not a Palindrome");
	} 
}
