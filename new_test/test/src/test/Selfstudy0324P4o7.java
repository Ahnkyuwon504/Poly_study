package test;
import java.util.Scanner;

public class Selfstudy0324P4o7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fAct(N));
		

	}
	
	public static int fAct(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * (fAct(--number));
		}
	}

}
