package newprj0407;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class k20_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		
		int sleepTime = 1000 * get_Input_TimeN();
		System.out.printf("%s : Start\n", dateAndTime);
		
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		time = new Date();
		dateAndTime = format.format(time);
		System.out.printf("%s : End", dateAndTime);
	}
	
	public static int get_Input_TimeN () {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		return N;
	}
}
