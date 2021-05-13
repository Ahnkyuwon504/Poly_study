package exchange;
import java.util.Scanner;

public class Input_Class {
	Scanner sc = null;													
	public Input_Class() { 												
		sc = new Scanner(System.in);
	}
	
	public double inputFromConsoleWon() {
		double won;														
		System.out.println("\nPlease input won.");						
		won = sc.nextInt();												
		return won;
	}
	
	public int inputFromConsoleType() {
		int N;
		System.out.println("What kind of money do you want?\n"			
                + "1.USD\n\n"
                + "2.EUR\n\n"
                + "3.JPY\n\n"
                + "4.종료시 0 입력\n\n");
		N = sc.nextInt();	
		return N;
	}
 
}