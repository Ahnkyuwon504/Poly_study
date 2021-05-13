package newprj0312;
import java.util.Random;

public class Test06 implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test06 test06 = new Test06();
		Random r = new Random();
		int n = 1;
		int count = 0;
		
		while (true) {
			try {
				Thread.sleep(1000);
				int M = r.nextInt(9) + 1;
				count += M;
				test06.pRit(n, M, count);
				n++;
				if (count >= 100) {
					System.out.println("Count : " + (n-1));
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void pRit(int a, int b, int c) {
		System.out.println("#" + a + " : " + b + "(" + c + ")");
	}
}
