package newexchange_0416;

import java.util.Scanner;

public class Input_Class {
	Scanner sc = null;
	
	public Input_Class() {
		sc = new Scanner(System.in);
	}
	
	public int get_Won_InputFromConsole() {
		int won;
		System.out.printf("원하는 환전 액수를 입력하세요.\n"
				+ "0원을 입력시 프로그램이 종료됩니다.\n");
		won = sc.nextInt();
		sc.nextLine();
		return won;
	}
	
	public int get_Nation_InputFromConsole() {
		int N;
		System.out.printf("환전할 종류를 선택하세요.\n1. USD\t2. EURO\t3. YEN\n");
		N = sc.nextInt();
		sc.nextLine();
		return N;
	}

}
