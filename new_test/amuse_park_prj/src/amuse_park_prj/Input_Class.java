package amuse_park_prj;

import java.util.Scanner;

public class Input_Class {
	Scanner sc = null;
	public Input_Class() {
		sc = new Scanner(System.in);
	}
	// 주&야 권종 선택
	public int day_Or_Night_InputFromConsole() {
		int user_Choice;
		System.out.printf("권종을 선택하세요.\n1. 주간권\n2. 야간권\n");
		user_Choice = sc.nextInt();
		sc.nextLine(); // 오류 해결
		return user_Choice;
	}
	// 주민번호 입력. 앞의 생일만 잘라옴.
	public int social_Number_InputFromConsole() {
		String user_Input;
		int birth;
		System.out.printf("주민번호를 입력하세요.\n");
		user_Input = sc.nextLine();
		birth = Integer.parseInt(user_Input.substring(0, 2));
		return birth;
	}
	// 몇장을 주문할지.
	public int how_Many_InputFromConsole() {
		int user_Choice;
		System.out.printf("몇 장을 주문하시겠습니까? (최대 10장)\n");
		user_Choice = sc.nextInt();
		sc.nextLine(); // 오류 해결
		return user_Choice;
	}
	// 우대사항 선택.
	public int treatment_InputFromConsole() {
		int user_Choice;
		System.out.printf("우대사항을 선택하세요.\n1. 없음 (나이 우대는 자동처리)\n2. 장애인\n");
		System.out.printf("3. 국가유공자\n4. 다자녀\n5. 임산부\n");
		user_Choice = sc.nextInt();
		sc.nextLine(); // 오류 해결
		return user_Choice;
	}
	// 계속 발권 여부
	public int continue_Or_Not_InputFromConsole() {
		int user_Choice;
		System.out.printf("계속 발권하시겠습니까?\n1. 티켓 발권\n2. 종료\n");
		user_Choice = sc.nextInt();
		sc.nextLine(); // 오류 해결
		return user_Choice;
	}
	// 처음부터 주문할지, 프로그램 종료할지 여부
	public int continue_Program_Or_Not_InputFromConsole() {
		int user_Choice;
		System.out.printf("계속 진행(1 : 새로운 주문, 2 : 프로그램 종료)\n");
		user_Choice = sc.nextInt();
		sc.nextLine(); // 오류 해결
		return user_Choice;
	}
	
	
}
