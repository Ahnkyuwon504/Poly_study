///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 11. 클래스의 ArrayList
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.util.ArrayList;

public class P11_Main {
	static ArrayList<P10_OneRec> OneRec_ArrayList = new ArrayList<P10_OneRec>();
	// 객체를 타입으로 하는 ArrayList 생성
	static int sumkor = 0; // 국어 초기화
	static int sumeng = 0; // 영어 초기화
	static int summat = 0; // 수학 초기화
	static int sumsum = 0; // 합계 초기화
	static int sumave = 0; // 평균 초기화
	static final int iPerson = 20; // 20명으로..
	
	public static void dataSet() {
		for (int i = 0; i < iPerson; i++) { // 20명만큼 데이터 세팅
			String student_id = String.format("%03d", i + 1); // 학번
			String name = String.format("홍길%03d", i + 1); // 이름
			int kor = (int)(Math.random() * 100); // 국어성적
			int eng = (int)(Math.random() * 100); // 영어성적
			int mat = (int)(Math.random() * 100); // 수학성적
			OneRec_ArrayList.add(new P10_OneRec(student_id, name, kor, eng, mat)); // 객체 생성하여 ArrayList 추가
		}
	}
	
	public static void HeaderPrint() {
		System.out.printf("***************************************\n"); // 줄 출력
		System.out.printf("%2s %4s  %2s %2s %2s %2s   %2s\n", // 헤더 부분
						  "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("***************************************\n"); // 줄 출력
	}
	
	public static void ItemPrint(int i) {
		P10_OneRec rec; // 객체 담을 그릇 선언
		
		rec = OneRec_ArrayList.get(i); // 그릇에 담는다...
		System.out.printf("%3s %4s   %3d  %3d  %3d  %3d %6.2f\n",
				  rec.student_id(), rec.name(), // 객체의 요소들
				  rec.kor(), rec.eng(), rec.mat(), rec.sum(), rec.ave());
		
		sumkor += rec.kor(); // 계속 증가됨
		sumeng += rec.eng(); // 계속 증가됨
		summat += rec.mat(); // 계속 증가됨
		sumsum += rec.sum(); // 계속 증가됨
		sumave += rec.ave(); // 계속 증가됨
	}
	
	public static void TailPrint() {
		System.out.printf("***************************************\n");
		System.out.printf(" 국어합계 %8d  국어평균 %6.2f\n", sumkor, sumkor / (double)OneRec_ArrayList.size()); // 국어 합계... 6강과 묘하게 다름
		System.out.printf(" 영어합계 %8d  영어평균 %6.2f\n", sumeng, sumeng / (double)OneRec_ArrayList.size()); // 영어 합계
		System.out.printf(" 수학합계 %8d  수학평균 %6.2f\n", summat, summat / (double)OneRec_ArrayList.size()); // 수학 합계
		System.out.printf("***************************************\n");
		System.out.printf(" 반평균합계 %6d  반평균 %6.2f\n", (sumkor + sumeng + summat) / 3, (sumkor + sumeng + summat) / 3.0 / 20.0); // 반 평균..합계..

	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSet(); // 데이터 세팅 메소드
		HeaderPrint(); // 헤더 프린트
		for (int i = 0; i < OneRec_ArrayList.size(); i++) {
			ItemPrint(i); // 개별품목 프린트
		}
		TailPrint(); // 하단 프린트
		

	}

}
