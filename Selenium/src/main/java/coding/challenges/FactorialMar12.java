package coding.challenges;

import java.util.Scanner;

public class FactorialMar12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input Number:");
		int num = scan.nextInt();
		scan.close();
		if(num>=0)
			System.out.println("Factorial of " + num + " is: " + factorial(num));
		else
			System.out.println("Retry with a Postive input Number");
	}

	static int factorial(int num)
	{
		int factorial =1;
		for(int i=1;i<=num;i++)	
			factorial=factorial*i;
		return factorial;
	}

}
