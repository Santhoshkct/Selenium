package week9.Regex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapQues {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String val =scan.nextLine();
		scan.close();
		char[] cs = val.toCharArray();

		Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();

		for(int i=0;i<cs.length;i++)
			if(cs[i] != ' ')	
				if(m.containsKey(cs[i]))
					m.put(cs[i], m.get(cs[i])+1);
				else
					m.put(cs[i], 1);

		for (Entry<Character, Integer> c : m.entrySet()) {
			System.out.println(c.getKey() + "-->" + c.getValue());
		}

	}

}
