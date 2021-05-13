package newprj0305;
import java.util.Scanner;

public class CurrencyConverter2 {     // 환율계산기
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("#Current Converter");
		System.out.println("1. South Korean won -> United States Dollar");
		System.out.println("2. United States Dollar -> South Korean won");
		System.out.println("3. ");
		
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Won :");   // 1won = 0.00089 dollar
			double i = sc.nextDouble();
			i = (Math.round(0.0089*i))/10.0;
			System.out.println(i + "dollar");
		} else if (n == 2) {
			System.out.println("Dollar :");  // 1dollar = 1,127.16 won
			double i = sc.nextDouble();
			i = (Math.round(1127.16*i));
			System.out.println(i + "won");
		}
	}
}
