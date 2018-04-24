package dailyActivities;

import java.util.HashSet;
import java.util.Set;


public class DuplicateArrayEleMar20 {

	public static void main(String[] args) {

		int[] a = {13,15,67,88,65,67,13,13,99,67,65,13,87,13};

		Set<Integer> st = new HashSet<Integer>();

		for(int i=0;i<a.length;i++)
		{ 
			int count = 0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) 
					count++;
			}
			if(count>0)
				st.add(a[i]);
		}
		for(int b:st)
			System.out.println(b);
	}
}