package techgig;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CandidateCode {

	int FishCountonTime = 0;
	List<Integer> li = new ArrayList<Integer>();

	CandidateCode(int count,int salmon)
	{
		this.FishCountonTime = count;
		li.add(salmon);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int salmonCount = scan.nextInt();
		long[] len = new long[salmonCount];
		for(int i=0;i<salmonCount;i++) {
			len[i] = scan.nextInt();
		}
		long[] time = new long[salmonCount];
		for(int i=0;i<salmonCount;i++) {
			time[i] = scan.nextInt();
		}
		scan.close();

		if(salmonCount <= 2 && salmonCount > 0)
			System.out.println(salmonCount);
		else 
		{
			Map<Long,CandidateCode> fishcatch = new TreeMap<Long,CandidateCode>();

			long[] arr = new long[2]; 
			for(int i=0;i<salmonCount;i++)
			{
				arr[0] = time[i];
				arr[1] = time[i] + len[i];
				for(long j=arr[0];j<=arr[1];j++)
				{
					if(fishcatch.containsKey(j))
					{
						CandidateCode exist = fishcatch.get(j);
						exist.FishCountonTime = exist.FishCountonTime + 1;
						exist.li.add(i);
					}
					else
						fishcatch.put(j,new CandidateCode(1,i));		
				}
			}

			Set<Integer> possiblities = new TreeSet<Integer>();
			List<Integer> firstlist = new ArrayList<Integer>();

			long i = 1;
			while(!fishcatch.isEmpty())
			{
				for (Entry<Long, CandidateCode> c : fishcatch.entrySet()) 
					if(c.getKey() == i)
						firstlist = c.getValue().li;
					else if(compare(c.getValue().li,firstlist))
						possiblities.add(c.getValue().li.size() + firstlist.size());

				fishcatch.remove(i);
				i++;
			}

			System.out.println(((TreeSet<Integer>) possiblities).last());

		}
	}

	public static boolean compare(List<Integer> comp, List<Integer> first) {

		for(int i=0;i<first.size();i++)
			for(int j=0;j<comp.size();j++)
				if(first.get(i) == comp.get(j))
					return false;

		return true;
	}
}