package newprj0402;

public class HW20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #20. 선택,반복,배열 20번 / 2021.04.01. / 2125341020 안규원
		// sin함수 그래프
		///////////////////////////////////////////////////
		
		double k20_fSin; // double 변수 정의. 우리가 흔히 사용하는 것은 라디안이 아니라 '도'이다.
						 // sin에 그 '도'를 넣었을 때 나오는 값을 부여할 것이다.
		
		for (int k20_i = 0; k20_i < 360; k20_i++) { // 0도부터 359도 까지 for문 실시
			k20_fSin = Math.sin(k20_i * 3.141592 / 180); // k20_fSin은 새롭게 부여된다.
			// k20_i 그대로 넣으면 라디안으로 들어간다. 따라서 파이값의 근사값을 곱하고, 180으로 나누어'도'로 만든 것.
			System.out.printf("%d sin ==> %f\n", k20_i, k20_fSin); // 1도면 1도의 sin값 출력
																   // '도' 에 따른 sin값 보여줌
		}
		
		for (int k20_i = 0; k20_i < 360; k20_i++) { // 0도부터 359도 까지 for문 실시
			k20_fSin = Math.sin(k20_i * 3.141592 / 180); // 똑같이 '라디안'을 '도'로 변환하여 부여
			
			int k20_iSpace = (int) ((1.0 - k20_fSin) * 50); /* sin값에 따라 가로 길이가 달라진다.
															 * 대각선인 변의 길이는 50으로 일정하지만,
															 * 가로세로 길이가 달라지므로
															 * 가로 길이를 시각적으료 표현해주기 위해
															 * k20_iSpace 변수 정의한 것
															 */ 
			for (int k20_j = 0; k20_j < k20_iSpace; k20_j++) { // 방금 정의한 k20_iSpace의 크기만큼
				System.out.printf(" ");						   // 공백을 찍어줌으로써
			}												   // 우리가 시각적으로 확인할 수 있다.
															   // 결국 원이 출력될 것이다.
				System.out.printf("*[%f][%d]\n", k20_fSin, k20_iSpace); // 원의 끝단에 값도 같이 출력
		}
		

	}

}
