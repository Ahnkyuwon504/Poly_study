package newprj0311;

public class Second04Thread implements Runnable {
	public static void main(String[] args) throws InterruptedException {
		Second04Thread main = new Second04Thread();
		Thread thread = new Thread(main);
		thread.start();
	}
	
	public void run() {
		System.out.println("Thread");
	}
}
