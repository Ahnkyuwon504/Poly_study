package newprj0402;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #3. 선택,반복,배열 3번 / 2021.04.01. / 2125341020 안규원
		// for문과 while문
		///////////////////////////////////////////////////
		
		System.out.println(1); // 1 출력
		System.out.println(2); // 2 출력
		System.out.println(3); // 3 출력
		System.out.println(4); // 4 출력
		System.out.println(5); // 5 출력
		
		for (int k20_index = 1; k20_index < 5; k20_index++) { // for문은 i가 1부터 5까지, 5번 실시될것임
			System.out.println(k20_index); // 각 for문마다 i 출력
		}
		
		int k20_i = 0; // 변수 i 선언
		do {
			k20_i++; // 우선 i를 1 올리고
			System.out.println(k20_i); // 1 올라간 i를 출력한다
		} while(k20_i <= 5); // i가 5이하일때까지 계속 실행. 즉 i가 5가 되도 실시되므로, 6도 출력될것이다
		
		k20_i = 1; // i 값 부여
		while (k20_i <= 5) { // i 가 5 이하일때까지 계속 실시됨
			System.out.println(k20_i); // i 출력
			k20_i++; // 출력 후 i를 1 더해줌. 즉 i가 5일때 출력되고, 6이 되므로 6은 출력되지 않을 것이다.
		}

	}

}
