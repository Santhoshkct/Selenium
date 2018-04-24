package interviewQuestions;

public class DifferenceArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 32, 24, 5, 53, 532, 523, 23, 12, 21 };

		for (int i = 0; i < a.length; i++)
			for (int j = i; j < a.length; j++)
				if (a[i] - a[j] == 2 || a[j] - a[i] == 2)
					System.out.println(a[i] + " " + a[j]);
	}

}

