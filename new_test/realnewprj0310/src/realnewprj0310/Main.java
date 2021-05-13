package realnewprj0310;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[10];       // size
		String[] name = {"kim", "lee", "park"};
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = i+2;
		}

		System.out.println(numbers[10]);
		System.out.println(name[3]);
	}
}
