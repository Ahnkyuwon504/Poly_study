package newexchange_0416;

import java.util.Scanner;

public class Input_Class {
	Scanner sc = null;
	
	public Input_Class() {
		sc = new Scanner(System.in);
	}
	
	public int get_Won_InputFromConsole() {
		int won;
		System.out.printf("���ϴ� ȯ�� �׼��� �Է��ϼ���.\n"
				+ "0���� �Է½� ���α׷��� ����˴ϴ�.\n");
		won = sc.nextInt();
		sc.nextLine();
		return won;
	}
	
	public int get_Nation_InputFromConsole() {
		int N;
		System.out.printf("ȯ���� ������ �����ϼ���.\n1. USD\t2. EURO\t3. YEN\n");
		N = sc.nextInt();
		sc.nextLine();
		return N;
	}

}
