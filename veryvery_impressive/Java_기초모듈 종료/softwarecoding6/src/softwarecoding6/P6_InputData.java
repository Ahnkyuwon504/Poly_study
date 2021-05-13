package softwarecoding6;

public class P6_InputData {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 6. InputData Class
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	String[] k20_name; // �л� �̸��� ����� name Array
	int[] k20_kor; int[] k20_eng; int[] k20_mat; // ���� ���� ����� integer Array
	int[] k20_sum; double[] k20_ave; // �հ�� ��� ����� Array
	
	P6_InputData(int Number_Person) { // ������, �ο��� �޾Ƽ� �� ���ڸ�ŭ Arrayũ�� ������
		this.k20_name = new String[Number_Person]; // �̸��迭 
		this.k20_kor = new int[Number_Person]; // ������� �迭
		this.k20_eng = new int[Number_Person]; // ������� �迭
		this.k20_mat = new int[Number_Person]; // ���а��� �迭
		this.k20_sum = new int[Number_Person]; // �հ� �迭
		this.k20_ave = new double[Number_Person]; // ��� �迭
	}
	
	void SetData(int i, String name, int kor, int eng, int mat) { // �� �� ���� ���� ���� ���� �޼ҵ�
		this.k20_name[i] = name; // �̸� ����
		this.k20_kor[i] = kor; // ���� ����
		this.k20_eng[i] = eng; // ���� ����
		this.k20_mat[i] = mat; // ���� ����
		this.k20_sum[i] = kor + eng + mat; // ���� ����
		this.k20_ave[i] = (this.k20_sum[i]) / 3; // ��� ���Ǿ� ����
	}

}
