package techgig;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class BobTheBear {

	private static boolean compare(List<List<Integer>> firstlist, List<Integer> store) {
		for (List<Integer> list : firstlist) 
			if(list.equals(store))
				return false;

		return true;
	}

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
			System.out.println("Start");
			Map<Integer,long[]> fish = new TreeMap<Integer,long[]>();


			long max = 0;
			for(int i=0;i<salmonCount;i++)
			{
				long[] arr = new long[2];
				arr[0] = time[i];
				arr[1] = time[i] + len[i];
				fish.put(i, arr);
				if(arr[1] > max)
					max = arr[1];
			}

			for (Entry<Integer, long[]> c : fish.entrySet())
			{	
				System.out.print(c.getKey() + "-->");
				for (long l : c.getValue()) {
					System.out.print(l + " ");
				}
				System.out.println();
			}

			List<List<Integer>> firstlist = new ArrayList<List<Integer>>();

			for(long j=0;j<=max;j++)
			{
				List<Integer> store = new ArrayList<Integer>();
				int count = 0;
				for (Entry<Integer, long[]> check : fish.entrySet())
				{
					long[] value = check.getValue();
					if(j >= value[0] && j<= value[1])
					{
						store.add(check.getKey());
						count++;
					}
				}
				if(count != 0)
					if(firstlist.isEmpty())
						firstlist.add(store);
					else if(compare(firstlist,store))
						firstlist.add(store);
			}

			for (List<Integer> li : firstlist) {
				System.out.println(li);
			}

			Set<Integer> possiblities = new TreeSet<Integer>();

			int maxi = 0;
			for(int i=0;i<firstlist.size();i++)
			{
				if(firstlist.get(i).size() > maxi)
					maxi = firstlist.get(i).size();
				for(int j=i+1;j<firstlist.size();j++)
					if(comparesort(firstlist.get(i),firstlist.get(j)))
						possiblities.add(firstlist.get(i).size() + firstlist.get(j).size());
			}
			possiblities.add(maxi);
			System.out.println(((TreeSet<Integer>) possiblities).last());

		}

	}	
}
