package newprj0402;

public class HW19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #19. 선택,반복,배열 19번 / 2021.04.01. / 2125341020 안규원
		// 띄어쓰기 연습
		///////////////////////////////////////////////////
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // for문은 i가 0부터 9까지, 10번 실행될것임
			for (int k20_j = 0; k20_j < k20_i; k20_j++) { // 각 for문마다, j를 0부터 i에 해당하는 값까지 실시할것임
										  // i가 0일땐 가능한 j가 없으므로 띄어쓰기가 없음.
				System.out.printf(" "); // for문이 실행되는 만큼 띄어쓰기가 출력될 것임.
			}
			System.out.printf("%d\n", k20_i); // i에 해당하는 for문이 실시될 때마다 줄바꾸기
		}
	}
}
