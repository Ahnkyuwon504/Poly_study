package softwarecoding6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P7_ReportSheet {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 7. ReportSheet(1 page, 30 student)
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	int k20_korsum = 0; int k20_engsum = 0; int k20_matsum = 0; // 총합 계산시 이용할 sum
	private int k20_sumOfsum; private int k20_avesum; private int k20_korave; // 총합, 평균 계산시 이용될것임...
	private int k20_engave; private int k20_matave; private int k20_ave_sumOfsum; private int k20_aveave; // 과목별 평균..이역시 이용될것임..
	private P7_InputData k20_inData; // 객체 선언
	int k20_iPerson; // 인원 수
	
	public static void main(String[] args) {
		P7_ReportSheet k20_score = new P7_ReportSheet(); // 객체 생성
		
		int k20_Number = 30; // 서른명치 뽑을 것임..
		
		k20_score.PrintHead(1); // 성적표 앞부분
		k20_score.Update_GetScore(k20_Number, 0); // 30명에 대해 객체 업데이트
		for (int k20_i = 0; k20_i < k20_Number; k20_i++) { // 30명치만큼
			k20_score.PrintOneStudent(k20_i); // 개별학생 출력
		}
		k20_score.PrintTail(); // 성적표 뒷부분
	}
	
	
	void PrintOneStudent(int k20_i) { // 한명 뽑는 메소드
		System.out.printf("%03d   %s    %3d     %3d     %3d     %3d     %3d\n", k20_i + 1, k20_inData.k20_name[k20_i],
				k20_inData.k20_kor[k20_i], k20_inData.k20_eng[k20_i], k20_inData.k20_mat[k20_i], k20_inData.k20_sum[k20_i], k20_inData.k20_ave[k20_i]);
		// 한줄의 내용이 출력됨...
	}

	public void Update_GetScore (int k20_student_number, int k20_student_index) { // 인원수에 따라 업데이트하는 메소드
		k20_iPerson = k20_student_number; // 학생수만큼 값 부여
		k20_inData = new P7_InputData(k20_iPerson); // 데이터 객체 생성..크기만큼

		for (int i = 0; i < k20_iPerson; i++) { // 학생수만큼 실시
			String k20_name = String.format("홍길%03d", k20_student_index + i + 1); // 이름 생성
			int k20_kor = (int) (Math.random() * 100 + 1); // 국어점수 생성
			int k20_eng = (int) (Math.random() * 100 + 1); // 영어점수 생성
			int k20_mat = (int) (Math.random() * 100 + 1); // 수학점수 생성
			k20_inData.SetData(i, k20_name, k20_kor, k20_eng, k20_mat); // 생성된 객체에 셋팅..

			k20_korsum += k20_kor; // 국어합계
			k20_engsum += k20_eng; // 영어합계
			k20_matsum += k20_mat; // 수학합계
		}

		k20_sumOfsum = k20_korsum + k20_engsum + k20_matsum; // 과목총합
		k20_avesum = k20_sumOfsum / 3; // 합계 평균..과목별 평균

		k20_korave = k20_korsum / k20_iPerson; // 국어과목 평균
		k20_engave = k20_engsum / k20_iPerson; // 영어과목 평균
		k20_matave = k20_matsum / k20_iPerson; // 수학과목 평균
		k20_ave_sumOfsum = k20_korave + k20_engave + k20_matave; // 평균의 합계
		k20_aveave = k20_ave_sumOfsum / 3; // 평균의 평균... 이 시험의 평균이라고 보면 됨..
	}

	void PrintHead(int k20_page) { // 앞부분 출력 메소드
		Calendar k20_cal = Calendar.getInstance(); // Calendar import하여 현재시간 출력
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 현재시간 출력 포맷

		System.out.printf("                     성적집계표\n"); // 텍스트 출력
		System.out.printf("PAGE: %2d              출력일자 : %s\n", k20_page, k20_sdt.format(k20_cal.getTime())); // 페이지 출력
		System.out.printf("====================================================\n"); // 줄 출력
		System.out.printf("번호  이름      국어    영어    수학    총점    평균\n"); // 과목 출력
		System.out.printf("====================================================\n"); // 줄 출력
	}
	
	
	void PrintTail() { // 뒷부분 출력 메소드
		System.out.printf("====================================================\n"); // 줄 출력
		System.out.printf("현재페이지\n합계           %5d   %5d   %5d   %5d   %5d\n", k20_korsum, k20_engsum, k20_matsum, k20_sumOfsum, k20_avesum);
		System.out.printf("평균           %5d   %5d   %5d   %5d   %5d\n", k20_korave, k20_engave, k20_matave, k20_ave_sumOfsum, k20_aveave);
		// 합계, 평균 출력
		System.out.printf("====================================================\n");// 줄 출력
	}
	
}
