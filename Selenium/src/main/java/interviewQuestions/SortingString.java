package interviewQuestions;

import java.util.Scanner;

public class SortingString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input String");
		String input = scan.nextLine();
		scan.close();

		String temp = null;
		String[] store = input.split(" ");

		for(int i=0;i<store.length;i++) 
			for(int j=i+1;j<store.length;j++)
				if(store[i].length() > store[j].length())
				{
					temp = store[j];
					store[j] = store[i];
					store[i] = temp;
				}

		for (String string : store) {
			System.out.println(string);
		}
	}
}
