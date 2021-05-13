package newprj0305;


import java.util.Calendar;
import java.util.Scanner;

public class Calender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Year : ");
		int year = sc.nextInt();  // year input
		System.out.println("Month : ");
		int month = sc.nextInt();  // month input
		
		int start_day = 0;
		int end_day = 0;
		
		Calendar start = Calendar.getInstance(); // start of day
		Calendar end = Calendar.getInstance(); // end of day
		
		System.out.println(" sun mon tue wed thu fri sat"); // 
		for (int i = 1; i < start_day; i++) {
			System.out.println("    ");
		}
		
		for (int i = 1, n = start_day; i <= end_day; n++, i++) {
			System.out.println((i<10)? "   " + i : "  " + i);
			if(n%7 == 0) {
				System.out.println();
			}
		}

	}

}
