package softwarecoding2;

public class P4 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 4. String Ex
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ja" + "va"; // 변수 선언 및 초기화
		String str = name + 8.0; // 변수 선언 및 초기화. name의 값 이용
		
		System.out.println(name); // name 출력
		System.out.println(str); // str 출력
		System.out.println(7 + " "); // 7이후 공백 출력
		System.out.println(" " + 7); // 공백 이후 7 출력
		System.out.println(7 + ""); // 7 출력
		System.out.println("" + 7); // 7 출력
		System.out.println("" + ""); // 공백 출력
		System.out.println(7 + 7 + ""); // 7과 7의 합이 이루어지고 14 출력
		System.out.println("" + 7 + 7 + 6); // 공백 출력 후 숫자들이라
		// 문자 그대로 776 출력됨

	}

}
