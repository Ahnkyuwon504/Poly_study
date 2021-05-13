package realnewprj0310;
import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of numbers.");
		int N = sc.nextInt();
		int[] numberArray = new int[N];
		
		System.out.println("Inputs a series of numbers.");
		for (int i=0; i<N; i++) {
			numberArray[i] = sc.nextInt();
		}
		
		System.out.println("Inputs a number among the numbers above.");
		int M = sc.nextInt();
		int Answer = 0;
		int Answernumber = 0;
		for (int i=0; i<N; i++) {
			if (i==0) {
				Answer = Math.abs(M - numberArray[0]);
				Answernumber = 0;
			} else {
				if (Answer > Math.abs(M -numberArray[i])) {
					Answernumber = i;
				} else if (Answer <= Math.abs(M -numberArray[i])){
					Answernumber = i-1;
				}
			}
		}
		System.out.println(numberArray[Answernumber]);
	}
}
