package learningjava;

import java.util.Arrays;

//import java.util.Scanner;

public class twoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Define a String with size without initialization 
		String bloodList[][]=new String[5][2]; 
		/*		//2. Getting the string using Scanner Function
		Scanner get = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Name " + (i+1) + ":");
			bloodList[i][0] = get.next();
			System.out.println("Blood Group:");
			bloodList[i][1] = get.next();
		}
		get.close();
		 */
		/*for(int j=0;j<5;j++)
			System.out.println("Name :" + bloodList[j][0] + " | Blood Group:" + bloodList[j][1]);
		 */
		bloodList=new String[][] {{"Sam","O+"},{"Karthik","AB-"},{"Vinoth","A-"},{"Dinesh","O-"},{"Anjas","A-ve"}};

		System.out.println("Using single for loop");
		for(int j=0;j<5;j++)
			System.out.println("Name : " + bloodList[j][0] + " | Blood Group: " + bloodList[j][1]);

		System.out.println();
		System.out.println("Using Nested for loop");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(j==0)
					System.out.print("Name : ");
				else
					System.out.print(" | Blood Group: ");
				System.out.print(bloodList[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Using single foreach loop");

		for(String[] name:bloodList)
		{
		System.out.println(Arrays.toString(name));
		}
		
		System.out.println();
		System.out.println("Using Nested foreach loop");

		for(String[] name:bloodList)
		{
			for(String sub:name)

			{
				System.out.print(sub +"  ");
			}
			System.out.println();
		}
	
	
	
	
	
	}
	
	
}



