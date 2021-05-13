package softwarecoding2;

import java.util.Scanner;

public class P6 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 6. ScannerEx
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);
		// 두자리 입력하도록 안내문 작성
		// 바로 옆에 입력하는것이 시각적으로 가능하도록 ln없이 줄 안바꿈.
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		// input은 스캐너로 입력받는 다음 라인
		String input = scanner.nextLine();
		// num은 받은 input을 Integer로 변환
		int num = Integer.parseInt(input);
		// 입력내용 출력
		System.out.println("입력내용 : " + input);
		// number 출력, 위와 내용은 같으나... 형이 다르다.
		System.out.printf("num = %d%n", num);

	}

}
