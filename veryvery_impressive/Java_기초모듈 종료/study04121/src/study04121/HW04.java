package study04121;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////////////////////////////////////////////////////////
		// #4. �����ÿ���(������ ��� ��) 4�� / 2125341020�ȱԿ�
		// ������ ��� 1
		////////////////////////////////////////////////////////////////////////
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); // ��ǥ ����ֱ����� import
		Calendar k20_cal = Calendar.getInstance(); // Calendar import�Ͽ� ����ð� ��� ����
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // ����ð� ����ϴ� ����

		int k20_iPrice = 10000; // �Ѿ� �� �ο�
		double k20_tax = 0.1; // ���� �� �ο�. 10%�̴�
		// ���� ������ 10%���, 33,000���� ���� 30,000���� ���� 3,000���� �հ��̴�
		int k20_real_iPrice = (int) (k20_iPrice / (k20_tax + 1));
		// ������ ���ϱ� ���� ���� ����
		// �� �հ���� 1+tax�� ���� ��, 1�� ���Ͽ� ���� ����
		int k20_tax_iPrice = (int) Math.ceil(k20_iPrice * k20_tax / (k20_tax + 1));
		// ���� ���� ����
		// �� �հ���� 1+tax�� ���� ��, tax�� ���Ͽ� ���� ����

		System.out.printf("\n\n�ſ����\n"); // �ſ���� ���. �� �տ��� �ٹٲ� 2��
		System.out.printf("�ܸ��� : 2N68665898%18s\n", "��ǥ��ȣ : 042317"); // �ؽ�Ʈ ���
		System.out.printf("������ : �Ѿ��ġ�\n"); // �ؽ�Ʈ ���
		System.out.printf("��  �� : ��� ������ �д籸 Ȳ�����351���� 10 ,1��\n"); // �ؽ�Ʈ ���
		System.out.printf("��ǥ�� : ��â��\n"); // �ؽ�Ʈ ���
		System.out.printf("����� : 752-53-00558%21s", "TEL : 7055695\n"); // �ؽ�Ʈ ���
		System.out.printf("-----------------------------------------\n"); // ���� �� ���
		System.out.printf("%-8s%28s ��\n", "��  ��", k20_df.format(k20_real_iPrice));
		// �ݾ� ���, ���� �κ�
		System.out.printf("%-8s%27s ��\n", "�ΰ���", k20_df.format(k20_tax_iPrice));
		// �ΰ��� ���, ���� �κ�
		System.out.printf("%-8s%28s ��\n", "��  ��", k20_df.format(k20_iPrice));
		// �Ѿ� ���
		System.out.printf("-----------------------------------------\n"); // ���� �� ���
		System.out.printf("�츮ī��\n"); // �ؽ�Ʈ ���
		System.out.printf("ī���ȣ : 5387-20**-****-4613(S) %4s\n", "�Ͻú�"); // �ؽ�Ʈ ���
		System.out.printf("�ŷ��Ͻ� : %s\n", k20_sdt.format(k20_cal.getTime())); // �ؽ�Ʈ ���
		// ���� �ð��� �Ʊ� ������ k20_cal ��ü �̿��Ͽ� �ҷ���.
		// ��� ������ k20_sdt�� �����Ͽ���.
		System.out.printf("���ι�ȣ : 70404427\n"); // �ؽ�Ʈ ���
		System.out.printf("�ŷ���ȣ : 357734873739\n"); // �ؽ�Ʈ ���
		System.out.printf("���� : ��ī���      ���� : 720068568\n"); // �ؽ�Ʈ ���
		System.out.printf("�˸� : EDC����ǥ\n"); // �ؽ�Ʈ ���
		System.out.printf("���� : TEL)1544-4700\n"); // �ؽ�Ʈ ���
		System.out.printf("-----------------------------------------\n"); // ���� �� ���
		System.out.printf("              * �����մϴ� *\n"); // �ؽ�Ʈ ���
		System.out.printf("%39s", "ǥ��V2.08_20200212"); // �ؽ�Ʈ ���
	}
}
