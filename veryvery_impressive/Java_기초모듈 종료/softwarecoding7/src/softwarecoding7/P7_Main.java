///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 7. 클래스의 배열 (6강 InputData클래스 재구성)
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P7_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_iPerson = 5; // 5명으로 정하고 시작...
		
		P7_OneRec[] k20_OneRec_Array = new P7_OneRec[k20_iPerson];
		// OneRec 객체를 담을 Array.. 크기는 5
		k20_OneRec_Array[0] = new P7_OneRec("홍길01", 100, 100, 100);
		// 0번째 객체 생성. 동시에 Array 저장
		k20_OneRec_Array[1] = new P7_OneRec("홍길02", 80, 75, 100);
		// 1번째 객체 생성. 동시에 Array 저장
		k20_OneRec_Array[2] = new P7_OneRec("홍길03", 100, 30, 100);
		// 2번째 객체 생성. 동시에 Array 저장
		k20_OneRec_Array[3] = new P7_OneRec("홍길04", 100, 100, 100);
		// 3번째 객체 생성. 동시에 Array 저장
		k20_OneRec_Array[4] = new P7_OneRec("홍길05", 90, 15, 10);
		// 4번째 객체 생성. 동시에 Array 저장
		

		for (int k20_i = 0; k20_i < k20_iPerson; k20_i++) { // 출력할것임...
			System.out.printf("번호:%3d, 이름:%s, 국어:%3d, 영어:%3d, 수학:%3d, "
					// 이름, 국영수, 총점, 평균을
					// return하는 메소드를 만들어 놓았음으로
					// 호출하면 자동으로 String, integer가 되어 들어간다...
					+ "총점:%3d, 평균:%f\n", k20_i + 1, k20_OneRec_Array[k20_i].name(), 
					k20_OneRec_Array[k20_i].kor(), k20_OneRec_Array[k20_i].eng(), 
					k20_OneRec_Array[k20_i].mat(), k20_OneRec_Array[k20_i].sum(), 
					k20_OneRec_Array[k20_i].ave());
		}

	}

}
