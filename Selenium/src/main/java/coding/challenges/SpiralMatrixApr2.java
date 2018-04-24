package coding.challenges;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SpiralMatrixApr2 {

	@Test
	public void matrix4()  {

		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the row count :");
		int rows = scan.nextInt();
		System.out.println("Enter the column count :");
		int columns = scan.nextInt();
		scan.close();

		int[][] matrix = new int[rows][columns];

		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				matrix[i][j]= (i*4)+j+1;

		System.out.println("Matrix output" + rows + "X" + columns + ":");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
				System.out.printf("%2d ", matrix[i][j] );
			System.out.println();	
		}

		System.out.println("Spiral print of above Matrix ::");	
		int i,j,k;
	    for(i=rows-1, j=0; i>0; i--, j++)
	    {
	        for(k=j; k<i; k++) System.out.printf("%d ", matrix[j][k]);
	        for(k=j; k<i; k++) System.out.printf("%d ", matrix[k][i]);
	        for(k=i; k>j; k--) System.out.printf("%d ", matrix[i][k]);
	        for(k=i; k>j; k--) System.out.printf("%d ", matrix[k][j]);
	 
	    }
	    //if odd size matrix print the middle value
	    int middle = (rows-1)/2;
	     if (rows% 2 == 1) System.out.printf("%d", matrix[middle][middle]);

	}
}
