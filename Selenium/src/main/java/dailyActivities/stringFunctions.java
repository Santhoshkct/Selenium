package dailyActivities;

public class stringFunctions {

	stringFunctions()
	{

		System.out.println("First Program");
	}

	public static boolean compare(String first,String second) {
	
		if(first == second)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "TestLeaf Java";
		String str2 = "TestLeaf Java";
		String str3 = new String("TestLeaf Java");
		String str4 = new String("testleaf java");
		String str5 = new String("Java");

		System.out.println("Str1 == Str2 " + compare(str1,str2));
		System.out.println("Str1.equals(str2) " + str1.equals(str2));
		System.out.println("Str1 == Str3 " + compare(str1,str3));
		System.out.println("Str1.equals(str3) " + str1.equals(str3));
		System.out.println(" Str1.Ignorecase " + str1.equalsIgnoreCase(str4));
		System.out.println("str3 " + str3.contains(str5));


	}

}
