package newprj0402;

public class HW11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #11. 선택,반복,배열 11번 / 2021.04.01. / 2125341020 안규원
		// 숫자형, 문자형 비교
		///////////////////////////////////////////////////
		/*
		int k20_ii; // 변수 정의
		double k20_iD; // 변수 정의
		
		k20_ii = 10/3; // 변수값 부여. int사이의 연산이므로 3이 저장될것임.
		k20_iD = 10/3.0; // 변수값 부여. int와 double사이의 연산인데, iD가 double이므로 3.333333이 저장될 것임.
		
		if (k20_ii == k20_iD) { // if문의 조건
			System.out.printf("equal\n"); // 둘이 같다면 equal 출력
		} else { // if가 아니라면
			System.out.printf("Not equal[%f][%f]\n", (double)k20_ii, k20_iD); // Not equal 출력
		}															  // 3.0000000과
																	  // 3.3333333이 다르다!
		
		if (k20_iD == 3.333333) { // if문의 조건
			System.out.printf("equal\n"); // double이라서 3.333333으로 표시되는 것뿐이다. 다르다.
		} else { // if문이 아니라면
			System.out.printf("Not equal[3.333333][%f]\n", k20_iD); // 다르므로 이쪽이 출력된다.
		}
		
		k20_iD = (int)k20_iD; // 변수 int형변환
		if (k20_ii == k20_iD) { // int로 바꿨으므로, 원래 int로 정의했던것과 같아진다
			System.out.printf("equal\n"); // 출력
		} else { // 다른 조건이라면
			System.out.printf("Not equal[%d][%d]\n", k20_ii, k20_iD); // 이쪽이 출력되지 않는다.
		}
		
		System.out.printf("int로 인쇄[%d][%f]\n", k20_ii, k20_iD); // int로 인쇄한 것. 출력이 다름에 유의
		System.out.printf("double로 인쇄[%f][%f]\n", (double)k20_ii, k20_iD); // double로 인쇄한 것
		*/
		char k20_a; // 변수 정의
		String k20_aa; // 변수 정의
		boolean k20_bb; // 변수 정의. boolean형태 유의
		
		k20_a = 'c'; // 변수값 부여
		k20_aa = "abcd"; // 변수값 부여
		k20_bb = true; // 변수값 부여. boolean은 true or false로 부여.
		
		if (k20_a == 'b') System.out.printf("a는 b이다.\n"); // k20_a가 b일 때 출력
		if (k20_a == 'c') System.out.printf("a는 c이다.\n"); // k20_a가 c일 때 출력
		if (k20_a == 'd') System.out.printf("a는 d이다.\n"); // k20_a가 d일 때 출력
		
		if (k20_aa.equals("abcd")) System.out.printf("aa는 abcd이다.\n"); // String 비교의 방법
		else System.out.printf("aa는 abcd가 아니다.\n"); // 출력
		
		if (!!k20_bb) System.out.printf("bb의 거짓의 거짓은 참이다."); // boolean 비교의 방법
		else System.out.printf("bb의 거짓의 거짓은 거짓이다."); // 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
