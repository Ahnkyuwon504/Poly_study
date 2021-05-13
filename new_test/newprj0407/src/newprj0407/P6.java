package newprj0407;

import java.util.Date;
import java.util.Scanner;

public class P6 implements Runnable {
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			System.out.println(new Date());
			Thread.sleep(N*1000);
			
			System.out.println(new Date());
			System.out.println("Time is over.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P6 ch = new P6();
		ch.run();
	}
}
