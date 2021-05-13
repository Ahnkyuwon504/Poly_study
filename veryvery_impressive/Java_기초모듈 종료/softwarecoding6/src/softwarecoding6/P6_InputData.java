package softwarecoding6;

public class P6_InputData {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 6. InputData Class
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	String[] k20_name; // 학생 이름이 저장될 name Array
	int[] k20_kor; int[] k20_eng; int[] k20_mat; // 과목별 점수 저장될 integer Array
	int[] k20_sum; double[] k20_ave; // 합계와 평균 저장될 Array
	
	P6_InputData(int Number_Person) { // 생성자, 인원을 받아서 그 숫자만큼 Array크기 정해줌
		this.k20_name = new String[Number_Person]; // 이름배열 
		this.k20_kor = new int[Number_Person]; // 국어과목 배열
		this.k20_eng = new int[Number_Person]; // 영어과목 배열
		this.k20_mat = new int[Number_Person]; // 수학과목 배열
		this.k20_sum = new int[Number_Person]; // 합계 배열
		this.k20_ave = new double[Number_Person]; // 평균 배열
	}
	
	void SetData(int i, String name, int kor, int eng, int mat) { // 한 명에 대한 과목별 점수 저장 메소드
		this.k20_name[i] = name; // 이름 저장
		this.k20_kor[i] = kor; // 국어 저장
		this.k20_eng[i] = eng; // 영어 저장
		this.k20_mat[i] = mat; // 수학 저장
		this.k20_sum[i] = kor + eng + mat; // 총합 저장
		this.k20_ave[i] = (this.k20_sum[i]) / 3; // 평균 계산되어 저장
	}

}
