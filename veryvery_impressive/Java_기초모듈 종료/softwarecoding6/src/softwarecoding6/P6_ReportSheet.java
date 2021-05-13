package softwarecoding6;

public class P6_ReportSheet {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 6. ReportSheet
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) { // 메인 메소드
		// TODO Auto-generated method stub
		
		int k20_iPerson = 10; // 10명으로 정하고 시작...
		
		P6_InputData k20_inData = new P6_InputData(k20_iPerson); // 10명의 크기를 갖는 inData 객체가 생성될것임
		
		for (int k20_i = 0; k20_i < k20_iPerson; k20_i++) { // 10명만큼 실시
			String k20_name = String.format("홍길%03d", k20_i); // 이름 생성
			int k20_kor = (int)(Math.random()*100); // 국어점수 생성
			int k20_eng = (int)(Math.random()*100); // 영어점수 생성
			int k20_mat = (int)(Math.random()*100); // 수학점수 생성
			k20_inData.SetData(k20_i, k20_name, k20_kor, k20_eng, k20_mat); // 데이터 세팅
		}
		
		for (int k20_i = 0; k20_i < k20_iPerson; k20_i++) { // 출력할것임...
			System.out.printf("번호:%3d, 이름:%s, 국어:%2d, 영어:%2d, 수학:%2d, " // 간격 맞추기..집중
							+ "총점:%3d, 평균:%f\n", 
							k20_i, k20_inData.k20_name[k20_i], k20_inData.k20_kor[k20_i], k20_inData.k20_eng[k20_i], k20_inData.k20_mat[k20_i],
							k20_inData.k20_sum[k20_i], k20_inData.k20_ave[k20_i]);
		}
	}

}
