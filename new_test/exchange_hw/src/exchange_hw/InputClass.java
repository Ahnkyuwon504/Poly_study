package exchange_hw;

import java.util.Scanner;

public class InputClass {
	Scanner sc = null;													// constructor
	public InputClass() { 												// constructor ����!!!
		sc = new Scanner(System.in);
	}
	
	public double inputFromConsoleWon() {
		double won;														// �Է¹��� won(�ѱ� ����)
		System.out.println("\nPlease input won.");						// �� ȯ������ ����
		System.out.println("If you want to exit, press 0.");						// �� ȯ������ ����
		won = sc.nextInt();												// won�� scanner���� �ο�
		return won;
	}
	
	public int inputFromConsoleType() {
		int N;
		System.out.println("What kind of money do you want?\n"			// Menu ����
                + "1.USD\n\n"
                + "2.EUR\n\n"
                + "3.JPY");
		N = sc.nextInt();												// N�� user�� menu���ð� �ο�
		return N;
	}

}
