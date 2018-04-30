package week9.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {


		String value = "1276786 53 3434 2324 3424";
		String pattern = "//d{4}";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(value);
		System.out.println(m.matches());
		
		int count = 0;
		while(m.find())
		{
			System.out.println(m.group());
			if(m.group().length() == 4)
			{	
				count++;
				continue;
			}
			else
				break;
		}
		
		if(count == 4)
			System.out.println("Valid");
		else
			System.err.println("Invalid");
			

	}
}
