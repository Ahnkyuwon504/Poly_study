package project1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Test1 test1 = new Test1();
		
		System.out.println("Selects a number.");
		test1.printMenu();                    
		
		int N = sc.nextInt();
		System.out.println(test1.printPrice(N));
	}
}
