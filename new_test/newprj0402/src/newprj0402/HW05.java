package newprj0402;

public class HW05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #5. 선택,반복,배열 5번 / 2021.04.01. / 2125341020 안규원
		// while문
		///////////////////////////////////////////////////
		
		int k20_i; // 변수 선언
		k20_i = 10; // 변수값 부여
		
		while(k20_i >= 0) { // while문은 i가 0 이상일때 무한 반복
			System.out.println(k20_i--); // i를 출력하고, 1을 빼줌
		} // 따라서 i가 10일때 출력되고, 0일때까지 모두 출력될것임
		for (int k20_j = 10; k20_j >= 0; k20_j--) { // for문은 10부터 0까지 실시될것임
			System.out.println(k20_j); // 10부터 0까지 j 출력
		}
		
		
		k20_i = 0; // 변수값 부여
		while (k20_i >= 0) { // while문은 i가 0 이상일 때 무한 반복
			k20_i = 10; // i에 10을 부여
			System.out.println(k20_i--); // i를 출력하고, 1을 빼줌. 그러나 모든 while문에서 새롭게 10을 부여하므로
		}							 // 이 while문은 영원히 반복된다.
		
		
		k20_i = 10;	// 변수값 부여
		while (k20_i < 10) { // while문은 i가 10 미만일 때 무한 반복
			System.out.println(k20_i--); // i 출력하고 1 빼줌. 계속 i줄어들지만, 조건이 10미만이므로 애초에 실행되지가 않음.
		}

	}

}
