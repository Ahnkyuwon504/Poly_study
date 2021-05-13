package softwarecoding6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P8 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 8. ReportSheet(30 student per one page, 200 student)
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	static int k20_Page; // 페이지 수... 학생수에 따라 달라짐
	static int k20_student = 17; // 학생 수
	static int k20_onepage_Maximum = 10; // 한 페이지 최대 출력가능 숫자. 30으로 설정함..
	private int k20_korsum = 0; private int k20_engsum = 0; private int k20_matsum = 0; // 과목별 합계.. 모든 합계
	private int k20_sumOfsum; private int k20_avesum; // 합계의 합계..모든 합계
	private int k20_korave; private int k20_engave; private int k20_matave; // 과목별 평균
	private int k20_ave_sumOfsum; private int k20_aveave; private int k20_number_allstudent; // 과목별 평균의 합계..평균

	public static void main(String[] args) { // 메인 메소드
		P8 k20_allpage = new P8(); // 객체생성.. 한페이지씩 담아서 모든 페이지가 될것임..

		k20_Page = k20_student / k20_onepage_Maximum; // 페이지는.. 학생수 / 최대출력가능학생수..여기서는 200/30

		// 한 페이지당 30명이므로, 200명을 인쇄하려면 6페이지까지...
		for (int k20_i = 0; k20_i < k20_Page; k20_i++) { // 페이지만큼 실시..
			int k20_student_index = k20_i * k20_onepage_Maximum + 1;
			P7_ReportSheet k20_onepage = new P7_ReportSheet(); // 페이지에 대한 onepage 객체생성

			k20_onepage.PrintHead(k20_i + 1); // 성적표 앞부분 출력
			k20_onepage.Update_GetScore(k20_onepage_Maximum, k20_i * k20_onepage_Maximum); // 업데이트
			for (int k20_j = 0; k20_j < k20_onepage_Maximum; k20_j++) { // 한 페이지에서 0명 ~ 30명
				k20_onepage.PrintOneStudent(k20_j); // 한명씩 출력

			}
			k20_allpage.Update(k20_onepage); // 한 페이지를 담아준다..

			k20_onepage.PrintTail(); // 성적표 뒷부분 출력
			k20_allpage.PrintTail_Allpage(); // 누적페이지 출력..
		}

		// 200명에서 30명씩 6페이지 인쇄하고, 남은 20명을 따로 해줘야함...
		if (k20_student % k20_onepage_Maximum != 0) { // 남은 인원이 있을 때만 실시됨..
		P7_ReportSheet onepage = new P7_ReportSheet(); // 또 객체 생성

		onepage.PrintHead(k20_Page + 1); // 앞부분
		onepage.Update_GetScore(k20_student % k20_onepage_Maximum, (k20_student / k20_onepage_Maximum) * k20_onepage_Maximum); // 업데이트
		for (int j = 0; j < k20_student % k20_onepage_Maximum; j++) { // 남은 학생 수만큼..30보다 적겠지
			int k20_student_index = j * k20_onepage_Maximum + 1;
			onepage.PrintOneStudent(j); // 한 명씩 출력

		}
		k20_allpage.Update(onepage); // 업데이트

		onepage.PrintTail(); // 뒷부분 출력
		k20_allpage.PrintTail_Allpage(); // 누적페이지 출력..이제 끝
		}
	}

	void Update(P7_ReportSheet onepage) { // 업데이트 메소드..
		k20_number_allstudent += onepage.k20_iPerson; // 모든 학생수를 늘려가야 각 페이지마다 누적이 계산된다..

		k20_korsum += onepage.k20_korsum; // 누적 국어
		k20_engsum += onepage.k20_engsum; // 누적 영어
		k20_matsum += onepage.k20_matsum; // 누적 수학

		k20_sumOfsum = k20_korsum + k20_engsum + k20_matsum; // 누적의 누적..
		k20_avesum = k20_sumOfsum / 3; // 누적의 평균

		k20_korave = k20_korsum / k20_number_allstudent; // 국어 누적평균
		k20_engave = k20_engsum / k20_number_allstudent; // 영어 누적평균
		k20_matave = k20_matsum / k20_number_allstudent; // 수학 누적평균
		k20_ave_sumOfsum = k20_korave + k20_engave + k20_matave; // 국영수 누적평균 합
		k20_aveave = k20_ave_sumOfsum / 3; // 국영수 누적평균의 평균... 이 시험의 평균이라고 보면 됨..
	}

	void PrintTail_Allpage() { // 누적페이지 인쇄 메소드..
		System.out.printf("====================================================\n"); // 줄 출력
		System.out.printf("누적페이지\n합계         %7d %7d %7d %7d %7d\n", k20_korsum, k20_engsum, k20_matsum, k20_sumOfsum, k20_avesum);
		System.out.printf("평균           %5d   %5d   %5d   %5d   %5d\n", k20_korave, k20_engave, k20_matave, k20_ave_sumOfsum, k20_aveave);
		// 누적페이지, 합계, 평균..
		System.out.printf("====================================================\n"); // 줄 출력
	}
}
