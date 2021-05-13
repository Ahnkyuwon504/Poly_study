///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 9. ArrayList 2
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.util.ArrayList;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_iTestMAX = 1000000; // 100만개 숫자 넣을거야..
		ArrayList k20_iAL = new ArrayList(); // ArrayList 선언, 생성
		
		for (int i = 0; i < k20_iTestMAX; i++) { // 100만번 돌아..
			k20_iAL.add((int)(Math.random() * 1000000)); // 난수생성하여 ArrayList add
		}
		
		for (int i = 0; i < k20_iAL.size(); i++) { // 100만번 돌아..
			System.out.printf("ArrayList %d = %d\n", i, k20_iAL.get(i)); //  출력
		}
		
		System.out.printf("************************************\n");
		k20_iAL.sort(null); // ArrayList sort한다...
		
		for (int i = 0; i < k20_iAL.size(); i++) { // 100만번...
			System.out.printf("ArrayList %d = %d\n", i, k20_iAL.get(i)); // 순서대로 출력
		}

	}

}
