package softwarecoding6;

public class P7_InputData {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 7. InputData
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	String[] k20_name;
	int[] k20_kor; int[] k20_eng; int[] k20_mat;
	int[] k20_sum; int[] k20_ave;
	
	P7_InputData(int Number_Person) {
		this.k20_name = new String[Number_Person];
		this.k20_kor = new int[Number_Person];
		this.k20_eng = new int[Number_Person];
		this.k20_mat = new int[Number_Person];
		this.k20_sum = new int[Number_Person];
		this.k20_ave = new int[Number_Person];
	}
	
	void SetData(int i, String name, int kor, int eng, int mat) {
		this.k20_name[i] = name;
		this.k20_kor[i] = kor;
		this.k20_eng[i] = eng;
		this.k20_mat[i] = mat;
		this.k20_sum[i] = kor + eng + mat;
		this.k20_ave[i] = (this.k20_sum[i]) / 3;
	}

}
