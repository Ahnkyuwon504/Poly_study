package third_amusement;

import java.util.Scanner;

public class Input_class {
	Scanner sc = null;

	public Input_class() {
		sc = new Scanner(System.in);
	}

	public int get_dayOrnight_Inputfromconsole() {
		int dayOrnight = 0;
		System.out.printf("1. 주간권\n2. 야간권\n");
		dayOrnight = sc.nextInt();

		if ((dayOrnight != 1) && (dayOrnight != 2)) {
			while (true) {
				System.out.printf("1 또는 2를 입력해주세요.\n");
				dayOrnight = sc.nextInt();
				if ((dayOrnight == 1) || (dayOrnight == 2)) {
					break;
				}
			}
		}
		sc.nextLine();
		return dayOrnight;
	}

	public String get_socialnumber_Inputfromconsole() {
		String socialnumber = "";
		System.out.printf("주민번호 앞자리를 입력해주세요.\n");
		socialnumber = sc.nextLine();

		while (socialnumber.length() != 6) {
			System.out.printf("주민번호 앞자리를 입력해주세요.\n");
			socialnumber = sc.nextLine();
		}
		return socialnumber;
	}

	public int get_amount_Inputfromconsole() {
		int amount = 0;
		System.out.printf("수량을 입력해주세요.(최대 10장)\n");
		amount = sc.nextInt();
		sc.nextLine();

		if (amount > 10) {
			System.out.printf("10장을 초과하여 입력하셨습니다.\n10장으로 처리됩니다.\n");
			return 10;
		}
		return amount;
	}

	public int get_treatment_Inputfromconsole() {
		int treatment = 0;
		System.out.printf("1. 우대사항 없음. 2. 장애인 3. 국가 유공자 4. 다자녀 5. 임산부\n");
		treatment = sc.nextInt();
		sc.nextLine();

		while (treatment != 1 && treatment != 2 && treatment != 3 && treatment != 4 && treatment != 5) {
			System.out.printf("1부터 5 사이의 숫자를 입력해주세요.\n");
			treatment = sc.nextInt();
			sc.nextLine();
		}
		return treatment;
	}

	public int exitOrnot() {
		int exit = 0;
		System.out.printf("티켓 발급을 계속 진행하시겠습니까?\n1. 계속 진행 2. 종료\n");
		exit = sc.nextInt();

		while (exit != 1 && exit != 2) {
			System.out.printf("1 또는 2를 입력해주세요.\n");
			exit = sc.nextInt();
		}
		return exit;
	}

	public int final_exitOrnot() {
		int exit = 0;
		System.out.printf("티켓 발급 프로그램을 다시 진행하시겠습니까?\n1. 재발급 2. 프로그램 종료\n");
		exit = sc.nextInt();

		while (exit != 1 && exit != 2) {
			System.out.printf("1 또는 2를 입력해주세요.\n");
			exit = sc.nextInt();
		}
		return exit;
	}

}
