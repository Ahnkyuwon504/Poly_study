package softwarecoding6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P7_ReportSheet {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 7. ReportSheet(1 page, 30 student)
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	int k20_korsum = 0; int k20_engsum = 0; int k20_matsum = 0; // ���� ���� �̿��� sum
	private int k20_sumOfsum; private int k20_avesum; private int k20_korave; // ����, ��� ���� �̿�ɰ���...
	private int k20_engave; private int k20_matave; private int k20_ave_sumOfsum; private int k20_aveave; // ���� ���..�̿��� �̿�ɰ���..
	private P7_InputData k20_inData; // ��ü ����
	int k20_iPerson; // �ο� ��
	
	public static void main(String[] args) {
		P7_ReportSheet k20_score = new P7_ReportSheet(); // ��ü ����
		
		int k20_Number = 30; // ������ġ ���� ����..
		
		k20_score.PrintHead(1); // ����ǥ �պκ�
		k20_score.Update_GetScore(k20_Number, 0); // 30�� ���� ��ü ������Ʈ
		for (int k20_i = 0; k20_i < k20_Number; k20_i++) { // 30��ġ��ŭ
			k20_score.PrintOneStudent(k20_i); // �����л� ���
		}
		k20_score.PrintTail(); // ����ǥ �޺κ�
	}
	
	
	void PrintOneStudent(int k20_i) { // �Ѹ� �̴� �޼ҵ�
		System.out.printf("%03d   %s    %3d     %3d     %3d     %3d     %3d\n", k20_i + 1, k20_inData.k20_name[k20_i],
				k20_inData.k20_kor[k20_i], k20_inData.k20_eng[k20_i], k20_inData.k20_mat[k20_i], k20_inData.k20_sum[k20_i], k20_inData.k20_ave[k20_i]);
		// ������ ������ ��µ�...
	}

	public void Update_GetScore (int k20_student_number, int k20_student_index) { // �ο����� ���� ������Ʈ�ϴ� �޼ҵ�
		k20_iPerson = k20_student_number; // �л�����ŭ �� �ο�
		k20_inData = new P7_InputData(k20_iPerson); // ������ ��ü ����..ũ�⸸ŭ

		for (int i = 0; i < k20_iPerson; i++) { // �л�����ŭ �ǽ�
			String k20_name = String.format("ȫ��%03d", k20_student_index + i + 1); // �̸� ����
			int k20_kor = (int) (Math.random() * 100 + 1); // �������� ����
			int k20_eng = (int) (Math.random() * 100 + 1); // �������� ����
			int k20_mat = (int) (Math.random() * 100 + 1); // �������� ����
			k20_inData.SetData(i, k20_name, k20_kor, k20_eng, k20_mat); // ������ ��ü�� ����..

			k20_korsum += k20_kor; // �����հ�
			k20_engsum += k20_eng; // �����հ�
			k20_matsum += k20_mat; // �����հ�
		}

		k20_sumOfsum = k20_korsum + k20_engsum + k20_matsum; // ��������
		k20_avesum = k20_sumOfsum / 3; // �հ� ���..���� ���

		k20_korave = k20_korsum / k20_iPerson; // ������� ���
		k20_engave = k20_engsum / k20_iPerson; // ������� ���
		k20_matave = k20_matsum / k20_iPerson; // ���а��� ���
		k20_ave_sumOfsum = k20_korave + k20_engave + k20_matave; // ����� �հ�
		k20_aveave = k20_ave_sumOfsum / 3; // ����� ���... �� ������ ����̶�� ���� ��..
	}

	void PrintHead(int k20_page) { // �պκ� ��� �޼ҵ�
		Calendar k20_cal = Calendar.getInstance(); // Calendar import�Ͽ� ����ð� ���
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ����ð� ��� ����

		System.out.printf("                     ��������ǥ\n"); // �ؽ�Ʈ ���
		System.out.printf("PAGE: %2d              ������� : %s\n", k20_page, k20_sdt.format(k20_cal.getTime())); // ������ ���
		System.out.printf("====================================================\n"); // �� ���
		System.out.printf("��ȣ  �̸�      ����    ����    ����    ����    ���\n"); // ���� ���
		System.out.printf("====================================================\n"); // �� ���
	}
	
	
	void PrintTail() { // �޺κ� ��� �޼ҵ�
		System.out.printf("====================================================\n"); // �� ���
		System.out.printf("����������\n�հ�           %5d   %5d   %5d   %5d   %5d\n", k20_korsum, k20_engsum, k20_matsum, k20_sumOfsum, k20_avesum);
		System.out.printf("���           %5d   %5d   %5d   %5d   %5d\n", k20_korave, k20_engave, k20_matave, k20_ave_sumOfsum, k20_aveave);
		// �հ�, ��� ���
		System.out.printf("====================================================\n");// �� ���
	}
	
}
