package newprj0402;

public class HW07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #7. 선택,반복,배열 7번 / 2021.04.01. / 2125341020 안규원
		// break문
		///////////////////////////////////////////////////
		
		int k20_sum, k20_ii; // 변수 정의
		
		k20_sum = 0; // 변수값 부여
		k20_ii = 0; // 변수값 부여
		
		while (true) { // while문은 무한반복된다는 조건. 따라서 break로 나와야한다.
			if (k20_sum > 100) { // break 발동조건
				break; // sum이 100보다 커지면 while문 탈출
			}
			k20_ii++; // k20_ii는 while문 시작할 때 1 더해준다.
			k20_sum += k20_ii; // k20_sum은 그 더해진 ii를 누적해간다.
			System.out.println("k20_ii = " + k20_ii); // ii 출력
			System.out.println("sum = " + k20_sum); // sum 출력
		}
		

	}

}
