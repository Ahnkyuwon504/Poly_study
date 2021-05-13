import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What number do you want from 2 to 9?");
		int n = sc.nextInt();
		
		
		if (n < 10) {
			for (int j = 2; j < 10; j+=2) {
				for (int k = 0; k < 2; k++) {
					System.out.println(n + "X" + (j+k) + " = " + (n * (j+k)));
				}
		    }
		} else {
			System.out.println("Please input number under 10");
		}
	}
}
