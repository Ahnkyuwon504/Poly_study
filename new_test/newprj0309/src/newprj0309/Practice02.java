package newprj0309;
import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please inputs the number N for the number of integers.");
		int N = sc.nextInt();
		int sum = 0, max = 0, min = 0, avr = 0;   // set sum, max, min, average
		int i = 0;
		System.out.println("Inputs the numbers.");
		
		while (i<N) {
			int n = sc.nextInt();
			sum += n;
			if (i == 0) {
				max = n;              // when i=0, first term, max=min=value of first term
				min = n;
			} else {
				if (max >= n) {       // max value
				} else {
					max = n;
				}
				if (min <= n) {       // min value
				} else {
					min = n;
				}
			}
			i++;                     
			if (i == N) {
				break;
			}
		}
		
		if (sum%N/N >= 0.5) {           // we want rounded average
			avr = sum/N +1;
		} else {
			avr = sum/N;
		}
		
		System.out.println("Average : " + avr);
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);
		System.out.println("Summation : " + sum);
	}
}
