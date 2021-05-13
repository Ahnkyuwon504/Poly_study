///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 8. ArrayList
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.util.ArrayList;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k20_iAL = new ArrayList(); // ArrayList 생성
		
		k20_iAL.add("abc"); // 원소 추가
		k20_iAL.add("abcd"); // 원소 추가
		k20_iAL.add("efga"); // 원소 추가
		k20_iAL.add("가나다0"); // 원소 추가
		k20_iAL.add("1234"); // 원소 추가
		k20_iAL.add("123rk45"); // 원소 추가
		
		System.out.printf("****************************************\n"); // 줄 출력
		System.out.printf(" 시작 ArraySize %d\n", k20_iAL.size()); // 변화 없다..지금은
		for (int i = 0; i < k20_iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, k20_iAL.get(i)); // get 조심
		}
		
		k20_iAL.set(3, "가라라라"); // 3번째 원소를 변경..0부터 시작이니까 순서로는 4번째..
		System.out.printf("****************************************\n");
		System.out.printf(" 내용변경 ArraySize %d\n", k20_iAL.size()); // 내용 변경되었다..
		for (int i = 0; i < k20_iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, k20_iAL.get(i)); // 내용 확인
		}
		
		k20_iAL.remove(4); // 4번째 원소 삭제.. ArrayList는 알아서 땡겨진다...
		System.out.printf("****************************************\n");
		System.out.printf(" 내용변경 ArraySize %d\n", k20_iAL.size()); // 내용 변경되었다...
		for (int i = 0; i < k20_iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, k20_iAL.get(i)); // 내용 확인
		}
		
		k20_iAL.sort(null); // 정렬.. 숫자 오고 영어 오고 한글 오고..
		System.out.printf("****************************************\n");
		System.out.printf(" 리스트Sort ArraySize %d\n", k20_iAL.size()); // 순서 변경...
		for (int i = 0; i < k20_iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, k20_iAL.get(i)); // 내용 확인
		}
		
		k20_iAL.clear(); // ArrayList 삭제
		System.out.printf("****************************************\n");
		System.out.printf(" 전부삭제 ArraySize %d\n", k20_iAL.size()); // size가 0이된다..
		for (int i = 0; i < k20_iAL.size(); i++) { // 이 for문 아예 실시 안됨
			System.out.printf(" ArrayList %d = %s\n", i, k20_iAL.get(i));
		}
	}
}
