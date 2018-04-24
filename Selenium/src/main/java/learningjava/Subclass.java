package learningjava;

public class Subclass implements Interface1,Interface2 {



	public static void main(String[] args) {

		Interface1 ic2 = new Subclass();
		ic2.m1();

		Interface2 ic1 = new Subclass();
		ic1.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

}
