package newprj0308;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i=1; i<=9; i++) {
			mulTi(x, sameValue(i));
		}
	}
	
	public static int sameValue(int number) {      // Recursive function which output same value with input
		if (number == 1) {
			return 1;
		} else {
			return sameValue(--number) + 1;
		}
	}
	
	public static void mulTi(int a, int b) {       // print multiplication
		System.out.println(a + " x " + b + " = " + a*b);
	}

}
