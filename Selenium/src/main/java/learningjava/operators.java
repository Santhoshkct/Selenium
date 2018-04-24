package learningjava;

public class operators {

	public static void main(String[] args) {
		
		int number1 = 23, number2 = 33;
		
		//Arithmetic Operators
		
		System.out.println("Addition of "+ number1 +" & "+ number2 + " is " + (number1+number2));
		System.out.println("Subtraction of "+ number1 +" & "+ number2 + " is " + (number1-number2));
		System.out.println("Division of "+ number1 +" & "+ number2 + " is " + (number1/number2));
		System.out.println("Modules of "+ number1 +" & "+ number2 + " is " + (number1%number2));
		System.out.println("Multiplication of "+ number1 +" & "+ number2 + " is " + (number1*number2));
		
		//Relational Operators
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
	
	}

}
