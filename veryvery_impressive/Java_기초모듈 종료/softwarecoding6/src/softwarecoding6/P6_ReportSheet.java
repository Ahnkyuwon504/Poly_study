package softwarecoding6;

public class P6_ReportSheet {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 6. ReportSheet
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) { // ���� �޼ҵ�
		// TODO Auto-generated method stub
		
		int k20_iPerson = 10; // 10������ ���ϰ� ����...
		
		P6_InputData k20_inData = new P6_InputData(k20_iPerson); // 10���� ũ�⸦ ���� inData ��ü�� �����ɰ���
		
		for (int k20_i = 0; k20_i < k20_iPerson; k20_i++) { // 10��ŭ �ǽ�
			String k20_name = String.format("ȫ��%03d", k20_i); // �̸� ����
			int k20_kor = (int)(Math.random()*100); // �������� ����
			int k20_eng = (int)(Math.random()*100); // �������� ����
			int k20_mat = (int)(Math.random()*100); // �������� ����
			k20_inData.SetData(k20_i, k20_name, k20_kor, k20_eng, k20_mat); // ������ ����
		}
		
		for (int k20_i = 0; k20_i < k20_iPerson; k20_i++) { // ����Ұ���...
			System.out.printf("��ȣ:%3d, �̸�:%s, ����:%2d, ����:%2d, ����:%2d, " // ���� ���߱�..����
							+ "����:%3d, ���:%f\n", 
							k20_i, k20_inData.k20_name[k20_i], k20_inData.k20_kor[k20_i], k20_inData.k20_eng[k20_i], k20_inData.k20_mat[k20_i],
							k20_inData.k20_sum[k20_i], k20_inData.k20_ave[k20_i]);
		}
	}

}
