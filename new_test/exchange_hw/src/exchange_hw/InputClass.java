package exchange_hw;

import java.util.Scanner;

public class InputClass {
	Scanner sc = null;													// constructor
	public InputClass() { 												// constructor 정석!!!
		sc = new Scanner(System.in);
	}
	
	public double inputFromConsoleWon() {
		double won;														// 입력받을 won(한국 돈을)
		System.out.println("\nPlease input won.");						// 얼마 환전할지 질문
		System.out.println("If you want to exit, press 0.");						// 얼마 환전할지 질문
		won = sc.nextInt();												// won에 scanner변수 부여
		return won;
	}
	
	public int inputFromConsoleType() {
		int N;
		System.out.println("What kind of money do you want?\n"			// Menu 제공
                + "1.USD\n\n"
                + "2.EUR\n\n"
                + "3.JPY");
		N = sc.nextInt();												// N에 user의 menu선택값 부여
		return N;
	}

}
