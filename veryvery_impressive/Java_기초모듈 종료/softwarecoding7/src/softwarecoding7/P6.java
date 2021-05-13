///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 6. 배열의 최대, 최소값 찾기
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] iArray = {1,7,5,3,2,1,2,3,4,5,12,212,33,35,9999,3,4,5,1,2,3};
		// Integer Array 만들고..
		for (int i = 0; i < iArray.length; i++) { // 길이만큼
			System.out.printf("k20_iArray[%d] = %d\n", i, iArray[i]);
			// 원소 개별적으로 다 보여주자..
		}
		
		int iMax = iArray[0]; int iMaxPt = 0; // 최댓값, 최댓값의 index 초기화
		int iMin = iArray[0]; int iMinPt = 0; // 최솟값, 최솟값의 index 초기화
		
		for (int i = 0; i < iArray.length; i++) { // 길이만큼 돌려서 test...
			if (iMax < iArray[i]) { // 최댓값보다 크면
				iMax = iArray[i]; // 바꾸고
				iMaxPt = i; // 순서도 저장...
			}
			if (iMin > iArray[i]) { // 최솟값보다 작으면
				iMin = iArray[i]; // 바꾸고
				iMinPt = i; // 순서도 저장...
			}
		}
		
		System.out.printf("Max : iArray[%d] = %d\nMin : iArray[%d] = %d\n", 
						   iMaxPt, iMax, iMinPt, iMin);
		// 출력하여 순서 확인...

	}

}
