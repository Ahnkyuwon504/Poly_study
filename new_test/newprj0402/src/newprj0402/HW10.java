package newprj0402;

public class HW10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #10. 선택,반복,배열 10번 / 2021.04.01. / 2125341020 안규원
		// for문을 안 쓰고 while문을 썼다.
		///////////////////////////////////////////////////
		
		int k20_iA, k20_iB; // 변수 정의
		k20_iA = 0; // 변수값 부여
		while(true) { // while은 무한반복된다.
			k20_iB = 0; // 변수값 부여
			while(true) { // while은 무한반복된다.
				System.out.printf("*"); // *을 출력한다. 줄넘김 없이.
				if(k20_iA == k20_iB) { // 출력해놓고, 행과 열이 같으면 break
					break; // break할것이다.
				}
				k20_iB++; // iB를 키움으로써 break 조건 만족시킬것임.
			}
			System.out.printf("\n"); // 줄 넘김 처리
			k20_iA++; // iA를 키움으로써 break 조건 만족시킬것임.
			if (k20_iA == 30) { // 30번째 줄까지만 출력할것임.
				break; // break
			}
		}

	}

}
