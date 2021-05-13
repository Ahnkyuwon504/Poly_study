///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 12. 다 페이지 성적집계표
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class P12_Main {
	static ArrayList<P10_OneRec> OneRec_ArrayList = new ArrayList<P10_OneRec>();
	// 객체를 타입으로 하는 ArrayList 생성
	static int sumkor = 0; // 국어합 초기화
	static int sumeng = 0; // 영어합 초기화
	static int summat = 0; // 수학합 초기화
	static int sumsum = 0; // 과목합 초기화
	static int sumave = 0; // 평균합 초기화

	static int sum_sumkor = 0; // 페이지합 초기화
	static int sum_sumeng = 0; // 페이지합 초기화
	static int sum_summat = 0; // 페이지합 초기화
	static int sum_sumsum = 0; // 페이지합 초기화
	static int sum_sumave = 0; // 페이지합 초기화
	
	static int iPerson_onepage = 0;  // 페이지마다 늘어나는 인원들..평균때문에 이렇게 해야함...

	static final int iPerson = 30; // 200명 넣을거다..
	static final int onepage_MaxPrint = 30; // 한페이지 서른 명씩...

	public static void dataSet() {
		for (int i = 0; i < iPerson; i++) { // 데이터 세팅..
			String student_id = String.format("%03d", i + 1); // 학번..
			String name = String.format("홍길%03d", i + 1); // 이름..
			int kor = (int) (Math.random() * 100); // 국어..
			int eng = (int) (Math.random() * 100); // 영어
			int mat = (int) (Math.random() * 100); // 수학
			OneRec_ArrayList.add(new P10_OneRec(student_id, name, kor, eng, mat)); // 객체ArrayList에 add
		}
	}

	public static void HeaderPrint(int i) { // 헤더 프린트 메소드..
		Calendar k20_cal = Calendar.getInstance(); // Calendar import하여 현재시간 출력
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 현재시간 출력 포맷

		System.out.printf("                    성적집계표\n\n");
		System.out.printf("PAGE : %2d             출력일자 : %s\n", i, k20_sdt.format(k20_cal.getTime())); // 헤더 부분...
		System.out.printf("====================================================\n");
		System.out.printf("%2s %4s  %2s     %2s     %2s    %2s     %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("====================================================\n");
	}

	public static void ItemPrint(int i, int j) { // 개별품목 인쇄...
		P10_OneRec rec; // 담을 그릇 선언

		rec = OneRec_ArrayList.get(i + (j - 1) * onepage_MaxPrint); // 그릇에 담는다..
		System.out.printf("%3s%6s  %3d      %3d      %3d      %3d   %6.2f\n", rec.student_id(), rec.name(), rec.kor(), rec.eng(),
				rec.mat(), rec.sum(), rec.ave());

		sumkor += rec.kor(); //더해간다...
		sumeng += rec.eng(); //더해간다...
		summat += rec.mat(); //더해간다...
		sumsum += rec.sum(); //더해간다...
		sumave += rec.ave(); //더해간다...

	}

	public static void TailPrint(int onepageMax) { //하단부 인쇄
		sum_sumkor += sumkor; // 국어 누적합계
		sum_sumeng += sumeng; // 영어 누적합계
		sum_summat += summat; // 수학 누적합계
		sum_sumsum += sumsum; // 합계의 누적합계
		sum_sumave += sumave; // 평균 누적합계
		
		iPerson_onepage += onepageMax; // 인원 누적합계 

		System.out.printf("====================================================\n");
		System.out.printf("현재페이지\n");
		System.out.printf("합계    %8d %8d %8d %8d %8.2f\n", // 합계 출력.. 
				sumkor, sumeng, summat, sumsum, sumsum / 3.0);
		System.out.printf("평균    %8.2f %8.2f %8.2f %8.2f %8.2f\n",  // 평균 출력...
				sumkor / (double) onepageMax,
				sumeng / (double) onepageMax, 
				summat / (double) onepageMax,
				sumsum / (double) onepageMax, 
				sumsum / 3.0 / (double) onepageMax);
		System.out.printf("====================================================\n");
		System.out.printf("누적페이지\n");
		System.out.printf("합계    %8d %8d %8d %8d %8.2f\n",  // 합계 출력..
				sum_sumkor, sum_sumeng, sum_summat, sum_sumsum, sum_sumsum / 3.0); // 평균 출력...
		System.out.printf("평균    %8.2f %8.2f %8.2f %8.2f %8.2f\n", 
				sum_sumkor / (double) iPerson_onepage,
				sum_sumeng / (double) iPerson_onepage, 
				sum_summat / (double) iPerson_onepage,
				sum_sumsum / (double) iPerson_onepage,
				sum_sumsum / 3.0 / (double) iPerson_onepage);
		System.out.printf("====================================================\n\n\n");


		sumkor = 0; // 한페이지 출력후 페이지변수는 초기화...
		sumeng = 0;
		summat = 0;
		sumsum = 0;
		sumave = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dataSet(); // 데이터 세팅..
		//dataSort(); // 데이터 소트...
		
		for (int j = 1; j <= iPerson / onepage_MaxPrint; j++) { // 페이지..
			HeaderPrint(j); // 헤더 프린트
			for (int i = 0; i < onepage_MaxPrint; i++) {
				ItemPrint(i, j); // 각 품목 프린트..
			}
			TailPrint(onepage_MaxPrint); // 하단부 프린트..
		}
		
		HeaderPrint(iPerson / onepage_MaxPrint + 1); // 마지막 페이지..여기는 맥시멈보다 적게 출력될것임..
		for (int i = 0; i < iPerson % onepage_MaxPrint; i++) { 
			ItemPrint(i, iPerson / onepage_MaxPrint + 1); // 각 품목 프린트...
		}
		TailPrint(iPerson % onepage_MaxPrint); // 하단부 프린트.. 남은 인원들만큼 출력..

		
	}
	
	public static void dataSort() { // 소트 메서드..
		Comparator<P10_OneRec> bikyeokijun = new Comparator<P10_OneRec>() {
			public int compare(P10_OneRec a1, P10_OneRec a2) { // a1 a2 바뀌면.. 순서 바뀐다..
				return (a2.sum() - a1.sum());
			}
		};
		Collections.sort(OneRec_ArrayList, bikyeokijun); // 순서를 갈아버린다...
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
