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

	private static boolean comparesort(List<Integer> comp, List<Integer> first) {
		for(int i=0;i<first.size();i++)
			for(int j=0;j<comp.size();j++)
				if(first.get(i) == comp.get(j))
					return false;

		return true;
	}	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int salmonCount = scan.nextInt();
		long[] len = new long[salmonCount];
		for(int i=0;i<salmonCount;i++) {
			len[i] = scan.nextLong();
		}
		long[] time = new long[salmonCount];
		for(int i=0;i<salmonCount;i++) {
			time[i] = scan.nextLong();
		}
		scan.close();

		if(salmonCount <= 2 && salmonCount > 0)
			System.out.println(salmonCount);
		else 
		{
			Map<Long,List<Integer>> fish = new TreeMap<Long,List<Integer>>();

			for(int i=0;i<salmonCount-1;i++)
			{
				List<Integer> li = new ArrayList<Integer>();
				List<Integer> liLen = new ArrayList<Integer>();
				li.add(i);
				liLen.add(i);
				for(int j=i+1;j<salmonCount;j++)
				{
					if(time[i] >= time[j] && time[i] <= (time[j] + len[j]))
						li.add(j);
					if((time[i] + len[i]) >= time[j] && (time[i] + len[i]) <= (time[j] + len[j]))
						liLen.add(j);
				}
				if(!fish.containsKey(time[i]))	
					fish.put(time[i],li);
				if(!fish.containsKey(time[i] + len[i]))
					fish.put((time[i] + len[i]), liLen);
			}
			List<List<Integer>> store = new ArrayList<List<Integer>>();

			for ( Entry<Long, List<Integer>> c : fish.entrySet()) {
				store.add(c.getValue());
			}

			Set<Integer> possiblities = new TreeSet<Integer>();

			int maxi = 0;
			for(int i=0;i<store.size()-1;i++)
			{
				if(store.get(i).size() > maxi)
					maxi = store.get(i).size();
				for(int j=i+1;j<store.size();j++)
					if(comparesort(store.get(i),store.get(j)))
						possiblities.add(store.get(i).size() + store.get(j).size());
			}
			possiblities.add(maxi);
			System.out.println(((TreeSet<Integer>) possiblities).last());
		}

	}	
}