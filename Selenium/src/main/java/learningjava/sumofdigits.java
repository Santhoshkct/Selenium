package learningjava;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int inputNumber = 42132, num, quotient, reminder, sumOfDigits = 0;
		num = inputNumber;
		
		while(inputNumber != 0)
		{
			quotient = inputNumber / 10;
			reminder = inputNumber % 10;
			sumOfDigits = sumOfDigits + reminder;
			inputNumber = quotient;
		}
		
		System.out.println("Sum of Digits in " + num + " is " + sumOfDigits);

	}

}
