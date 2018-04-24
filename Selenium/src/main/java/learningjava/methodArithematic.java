package learningjava;

public class methodArithematic {

	public static void main(String[] args) {

		int num1 = 23, num2 = 33;

		System.out.println("Addition of " + add(num1,num2));
		System.out.println("Subtraction of " + sub(num1,num2));
		System.out.println("Multiplication of " + mul(num1,num2));
		System.out.println("Division of " + div(num1,num2));
		System.out.println("Modules of " + mod(num1,num2));

		/*	//Relational Operators
		System.out.println( number1 + " Greater than " + number2 + " = " + (number1>number2));
		System.out.println( number1 + " Lesser than " + number2 + " = " + (number1<number2));
		System.out.println( number1 + " Greater than or Equal to " + number2 + " = " + (number1>=number2));
		System.out.println( number1 + " Lesser than or Equal to " + number2 + " = " + (number1<=number2));
		System.out.println( number1 + " Not Equal to " + number2 + " = " + (number1!=number2));

		//Logical Operators
		System.out.println( number1 + " &(AND) " + number2 + " = " + (number1&number2));
		System.out.println( number1 + " |(OR) " + number2 + " = " + (number1|number2));
		System.out.println(number1 + " ^(XOR) " + number2 + " = " + (number1^number2));

		//Ternary Operator
		int r = (number1>number2)?number1:number2;
		System.out.println(r + " is Big");
		 */
	}

	//Arithmetic Operators

	public static int add(int num1,int num2)
	{
		return (num1+num2);
	}
	public static int sub(int num1,int num2)
	{
		return (num1-num2);
	}
	public static int mul(int num1,int num2)
	{
		return (num1*num2);
	}
	public static int div(int num1,int num2)
	{
		return (num1/num2);
	}
	public static int mod(int num1,int num2)
	{
		return (num1%num2);
	}

}
