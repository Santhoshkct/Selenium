package coding.challenges;

import java.util.Scanner;

public class ArithematicMar14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1:");
		int num1 = scan.nextInt();
		System.out.println("Enter the num2");
		int num2 = scan.nextInt();
		System.out.println("Enter the Arthimetic Operation:");
		String operation = scan.next();
		scan.close();

		switch(operation)
		{
		case "Add" : System.out.println("Addition of " + num1 + " and " + num2 + " is : " + (num1+num2));
		break;

		case "Subtract" : System.out.println("Subtraction of " + num1 + " and " + num2 + " is : " + (num1-num2));
		break;

		case "Multiply" : System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + (num1*num2));
		break;

		case "Divide" : System.out.println("Division of " + num1 + " and " + num2 + " is : " + (num1/num2));
		break;

		default : System.out.printf("Enter the valid operator name in String:\nAdd\nSubtract\nMultiply\nDivide" );
		}
	}
}
