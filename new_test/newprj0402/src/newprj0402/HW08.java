package newprj0402;

public class HW08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #8. 선택,반복,배열 8번 / 2021.04.01. / 2125341020 안규원
		// continue문
		///////////////////////////////////////////////////
		
		for (int k20_i = 0; k20_i <= 10; k20_i++) { // for문은 0부터 10까지 실시
			if (k20_i%3 == 0) { // continue되는 조건 제시
				continue; // continue는, break와 다르게 빠져나오지 않고, 그 while문의 끝으로 이동
			}
			System.out.println(k20_i); // i 출력. 3의배수만 안 출력될것임.
		}

	}

}
