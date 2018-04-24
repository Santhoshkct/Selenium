package week8;

import java.util.Scanner;

public class LearnString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter thr input String");
		String input = scan.nextLine();
		System.out.println("Enter the character, count want to find:");
		char check = scan.next().charAt(0);
		scan.close();
		char[] output = new char[input.length()];
		int count = 0;
		
		System.out.println(input);
	
		for(int i=0; i< input.length();i++)
		{
			output[i] = (char) (input.charAt(i) + 1);
			
			if(input.charAt(i)== check)
					count++;
		}
		
		System.out.println(output);
		System.out.println(check + " Count : " + count );
	}
	
}
