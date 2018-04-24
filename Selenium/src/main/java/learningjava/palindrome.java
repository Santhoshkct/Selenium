package learningjava;

public class palindrome {

	public static void main(String[] args) {
		
		int inputNumber = 534315,num,rem = 0, rev = 0/*,length=0*/;
		num = inputNumber;
				
		while(num > 0)
		{
			rem = num % 10;
			rev = (rev*10) + rem;
			num = num /10;
		}
		/*for(length=0;num >0;num=num/10,length++);
		
		System.out.println("Length of the Number " + inputNumber + " is " + length);
		
		num = inputNumber;
		while(num !=0)
		{
			rem = num % 10;
			rev = (int) (rev + (rem * Math.pow(10,length-1)));
			num = num / 10;
			length--;
			System.out.println(rev);
		}*/

		if(rev == inputNumber)
			System.out.println(inputNumber + " is a Palindrome");	
		else
			System.out.println(inputNumber + " is not a Palindrome");
	}

}
