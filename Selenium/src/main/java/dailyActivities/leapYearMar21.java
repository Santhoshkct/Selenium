package dailyActivities;

import java.util.Scanner;

public class leapYearMar21 {

	
	public static void leap(int checkLeap)
	{
		if(checkLeap%4==0 && (checkLeap%100!=0 || checkLeap%400==0))
			System.out.println(checkLeap + " is a Leap year");
		else
			System.out.println(checkLeap + " is NOT a Leap year");
	}
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scan.nextInt();
		scan.close();
		leap(year);

	}

}
