package coding.challenges;

import java.util.Scanner;

public class PascalTriangleDay32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int size = scan.nextInt();
		scan.close();

		int[][] arr = new int[size][size];

		for(int i=0;i<size;i++)
			for(int j=0;j<=i;j++)
			{
				if(i==0 || j==0 || i==j)
					arr[i][j] = 1;
				else
					arr[i][j]=arr[i-1][j-1] + arr[i-1][j];
				
			}
		System.out.println("Pascal Triangle for " + size + " :" );

		for(int i=0;i<size;i++) 
		{
			for(int k=i;k<size;k++)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
				System.out.printf("%d ", arr[i][j]);
			System.out.println();
		}

	}

}
