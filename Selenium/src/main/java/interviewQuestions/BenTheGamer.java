package interviewQuestions;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BenTheGamer {

	public static int coins(int wp, Set<String> st)  {

		char[] marker = new char[wp];
		int output = 0;
		for (String c : st) {
			char[] spot = c.toCharArray();
			int count = 0;
			for(int i=0;i<spot.length;i++)
				if(spot[i] == '1' && marker[i] != 'X')
				{
					count++;
					marker[i] = 'X';
				}
			output = output + (count * count);
		}
		return output;
	}


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String game = scan.nextLine();
		String[] lvl = game.split(" ");
		int level = Integer.parseInt(lvl[0]);
		int weapon = Integer.parseInt(lvl[1]);

		Set<String> st = new TreeSet<>();

		for(int i=0;i<level;i++) {
			String phase = scan.nextLine();
			st.add(phase);
		}
		scan.close();
		System.out.println(coins(weapon,st));
	}
}
