package newprj0311;

import java.util.Date;
import java.util.Scanner;

class P6Timer implements Runnable {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		while (true) {
			try {
				Thread.sleep(1000);
				count++;
				if (count==N) {
					System.out.println(new Date());
					break;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class P6Timer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P6Timer p6 = new P6Timer();
		p6.run();

	}

}
