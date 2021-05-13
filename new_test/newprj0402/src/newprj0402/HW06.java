package newprj0402;

public class HW06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #6. 선택,반복,배열 6번 / 2021.04.01. / 2125341020 안규원
		// while문
		///////////////////////////////////////////////////
		
		for (int k20_i = 2; k20_i <= 9; k20_i++) { // for문은 2부터 9까지 실시
			for (int k20_j = 1; k20_j <= 9; k20_j++) { // for문은 1부터 9까지 실시
				System.out.println(k20_i + " * " + k20_j + " = " + k20_i*k20_j); // 구구단의 한 행을 출력
			}
		}
		
		int k20_i = 2; // while문을 쓰기 위해 변수 정의
		while (k20_i <= 9) { // while문의 발동조건
			int k20_j = 1; // while문 안에서 또 while문을 쓰기 위해 변수 정의
			while (k20_j <= 9) { // while문의 발동 조건
				System.out.println(k20_i + " * " + k20_j + " = " + k20_i*k20_j); // 구구단 출력 
				k20_j++; // while문 종료시키기 위한 장치
			}
			k20_i++; // while문 종료시키기 위한 장치
		}

	}

}
