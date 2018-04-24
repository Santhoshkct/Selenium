package coding.challenges;

import java.util.Scanner;

public class NumPalindromeMar13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input number:");
		int inputNumber = scan.nextInt();
		scan.close();

		if(inputNumber==reverse(inputNumber))
			System.out.println(inputNumber + " is a Palindrome");
		else
			System.out.println(inputNumber + " is not a Palindrome");	
	}

	public static int reverse(int num)
	{
		int rev=0,rem=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
		}
		System.out.println(rev);
		return rev;
	}

}
