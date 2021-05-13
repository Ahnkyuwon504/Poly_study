package softwarecoding6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P8 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 8. ReportSheet(30 student per one page, 200 student)
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	static int k20_Page; // ������ ��... �л����� ���� �޶���
	static int k20_student = 17; // �л� ��
	static int k20_onepage_Maximum = 10; // �� ������ �ִ� ��°��� ����. 30���� ������..
	private int k20_korsum = 0; private int k20_engsum = 0; private int k20_matsum = 0; // ���� �հ�.. ��� �հ�
	private int k20_sumOfsum; private int k20_avesum; // �հ��� �հ�..��� �հ�
	private int k20_korave; private int k20_engave; private int k20_matave; // ���� ���
	private int k20_ave_sumOfsum; private int k20_aveave; private int k20_number_allstudent; // ���� ����� �հ�..���

	public static void main(String[] args) { // ���� �޼ҵ�
		P8 k20_allpage = new P8(); // ��ü����.. ���������� ��Ƽ� ��� �������� �ɰ���..

		k20_Page = k20_student / k20_onepage_Maximum; // ��������.. �л��� / �ִ���°����л���..���⼭�� 200/30

		// �� �������� 30���̹Ƿ�, 200���� �μ��Ϸ��� 6����������...
		for (int k20_i = 0; k20_i < k20_Page; k20_i++) { // ��������ŭ �ǽ�..
			int k20_student_index = k20_i * k20_onepage_Maximum + 1;
			P7_ReportSheet k20_onepage = new P7_ReportSheet(); // �������� ���� onepage ��ü����

			k20_onepage.PrintHead(k20_i + 1); // ����ǥ �պκ� ���
			k20_onepage.Update_GetScore(k20_onepage_Maximum, k20_i * k20_onepage_Maximum); // ������Ʈ
			for (int k20_j = 0; k20_j < k20_onepage_Maximum; k20_j++) { // �� ���������� 0�� ~ 30��
				k20_onepage.PrintOneStudent(k20_j); // �Ѹ� ���

			}
			k20_allpage.Update(k20_onepage); // �� �������� ����ش�..

			k20_onepage.PrintTail(); // ����ǥ �޺κ� ���
			k20_allpage.PrintTail_Allpage(); // ���������� ���..
		}

		// 200���� 30�� 6������ �μ��ϰ�, ���� 20���� ���� �������...
		if (k20_student % k20_onepage_Maximum != 0) { // ���� �ο��� ���� ���� �ǽõ�..
		P7_ReportSheet onepage = new P7_ReportSheet(); // �� ��ü ����

		onepage.PrintHead(k20_Page + 1); // �պκ�
		onepage.Update_GetScore(k20_student % k20_onepage_Maximum, (k20_student / k20_onepage_Maximum) * k20_onepage_Maximum); // ������Ʈ
		for (int j = 0; j < k20_student % k20_onepage_Maximum; j++) { // ���� �л� ����ŭ..30���� ������
			int k20_student_index = j * k20_onepage_Maximum + 1;
			onepage.PrintOneStudent(j); // �� �� ���

		}
		k20_allpage.Update(onepage); // ������Ʈ

		onepage.PrintTail(); // �޺κ� ���
		k20_allpage.PrintTail_Allpage(); // ���������� ���..���� ��
		}
	}

	void Update(P7_ReportSheet onepage) { // ������Ʈ �޼ҵ�..
		k20_number_allstudent += onepage.k20_iPerson; // ��� �л����� �÷����� �� ���������� ������ ���ȴ�..

		k20_korsum += onepage.k20_korsum; // ���� ����
		k20_engsum += onepage.k20_engsum; // ���� ����
		k20_matsum += onepage.k20_matsum; // ���� ����

		k20_sumOfsum = k20_korsum + k20_engsum + k20_matsum; // ������ ����..
		k20_avesum = k20_sumOfsum / 3; // ������ ���

		k20_korave = k20_korsum / k20_number_allstudent; // ���� �������
		k20_engave = k20_engsum / k20_number_allstudent; // ���� �������
		k20_matave = k20_matsum / k20_number_allstudent; // ���� �������
		k20_ave_sumOfsum = k20_korave + k20_engave + k20_matave; // ������ ������� ��
		k20_aveave = k20_ave_sumOfsum / 3; // ������ ��������� ���... �� ������ ����̶�� ���� ��..
	}

	void PrintTail_Allpage() { // ���������� �μ� �޼ҵ�..
		System.out.printf("====================================================\n"); // �� ���
		System.out.printf("����������\n�հ�         %7d %7d %7d %7d %7d\n", k20_korsum, k20_engsum, k20_matsum, k20_sumOfsum, k20_avesum);
		System.out.printf("���           %5d   %5d   %5d   %5d   %5d\n", k20_korave, k20_engave, k20_matave, k20_ave_sumOfsum, k20_aveave);
		// ����������, �հ�, ���..
		System.out.printf("====================================================\n"); // �� ���
	}
}
