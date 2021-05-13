package newprj0405;

import java.util.Scanner;

public class ko20_P12 {
	public final static int[] WON = {10000, 5000, 1000, 500, 100, 50, 10};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Paid_Money, Value_Toy;
		
		System.out.println("Input two numbers which are the paid money and the change.");
		Paid_Money = sc.nextInt();
		Value_Toy = sc.nextInt();
		
		get_How_Many_needed(Paid_Money, Value_Toy);

	}
	
	public static void get_How_Many_needed (int N, int M) {
		int change;
		change = N - M;
		
		for (int i = 0; i < WON.length; i++) {
			System.out.printf("%d - %d\n", WON[i], change/WON[i]);
			change = change%WON[i];
		}
	}
}
