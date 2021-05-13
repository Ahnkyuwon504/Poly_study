package newprj0311;

public class First06Exception {

	public static void main(String[] args) {
		int[] numbers = {5, 10, 12};
		
		try {
			System.out.println(numbers[3]);
		} catch (Exception e) {
			System.out.println("exception");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
