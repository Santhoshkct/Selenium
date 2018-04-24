package coding.challenges;
import java.util.Arrays;
public class SecondLargestnoMar23 {

	public static void main(String[] args) {
		int[] intArray = {243424,17,21,-879,92,21,474,83674,-200};

		//option #1
		Arrays.sort(intArray);
		System.out.println("Second Largest Number : " + intArray[intArray.length-2]);

		//option #2
		int firstlargest = intArray[0], secondlargest = intArray[1];
		for(int i=1;i<intArray.length;i++)
		{
			if(intArray[i]>firstlargest)
			{
				secondlargest = firstlargest;
				firstlargest = intArray[i];
			}
			else if(intArray[i] > secondlargest)
				secondlargest = intArray[i];
		}
		System.out.println("Second Largest Number : " + secondlargest);
	}
}