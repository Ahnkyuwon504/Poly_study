package newprj0311;

public class Second02Thread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second02Thread thread = new Second02Thread();
		thread.start();

	}
	
	public void run() {
		int cnt = 0;
		while (true) {
			if ((cnt>0) && (cnt%10==0)) {
				System.out.println();
				cnt++;
			} 
			try {
				Thread.sleep(100);
				System.out.print("*");
				cnt++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
