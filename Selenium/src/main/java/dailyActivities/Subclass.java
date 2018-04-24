package dailyActivities;

public class Subclass extends AbstractCons {
	
	public void m1() {
		System.out.println("M1 Method");
		}
	
	public void m2() {
		System.out.println("M2-SubClass Method");
	}

	public static void main(String[] args) {


		AbstractCons ac = new Subclass();
		ac.m1();
		ac.m2();
		
	}

}
