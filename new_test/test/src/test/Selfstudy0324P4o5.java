package test;

public class Selfstudy0324P4o5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selfstudy0324P4o5 self = new Selfstudy0324P4o5();

		for (int i = 1; i < 10; i++) {
			self.First(i);
		}

	}

	public void First(int i) {
		for (int j = 1; j < 10; j++) {
			System.out.println(i + " x " + j + " = " + i * j);
		}
	}

}
