package vending;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vending vend = null;
		vend = new Vending(0, 0, 0);
		printMenu(vend);
		
		for(int i=0; i<4; i++) {
		int n = sc.nextInt();
		if (n == 1) {
			vend.setA(vend.getA()+1);
		} else if (n == 2) {
			vend.setB(vend.getB()+1);
		} else if (n == 3) {
			vend.setC(vend.getC()+1);
		} else if (n == 4) {
			vend.setA(0);
			vend.setB(0);
			vend.setC(0);
		}
		printMenu(vend);
		}
	}
	
	public static void printMenu(Vending vend) {
		int balan = 2000 - 500*vend.getA() - 1000*vend.getB() - 700*vend.getC();
		System.out.println("#Vending Machine\n1. Coke - 500\n2. Juice - 1000\n3. Milk - 700\n4. Cancel All");
		System.out.println("* Balance : " + balan);
		System.out.println("* Coke" + vend.getA() + "Juice" + vend.getB() + "Milk" + vend.getC());
	}
	
}
