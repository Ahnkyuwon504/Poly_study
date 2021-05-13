///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 12. �� ������ ��������ǥ
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class P12_Main {
	static ArrayList<P10_OneRec> OneRec_ArrayList = new ArrayList<P10_OneRec>();
	// ��ü�� Ÿ������ �ϴ� ArrayList ����
	static int sumkor = 0; // ������ �ʱ�ȭ
	static int sumeng = 0; // ������ �ʱ�ȭ
	static int summat = 0; // ������ �ʱ�ȭ
	static int sumsum = 0; // ������ �ʱ�ȭ
	static int sumave = 0; // ����� �ʱ�ȭ

	static int sum_sumkor = 0; // �������� �ʱ�ȭ
	static int sum_sumeng = 0; // �������� �ʱ�ȭ
	static int sum_summat = 0; // �������� �ʱ�ȭ
	static int sum_sumsum = 0; // �������� �ʱ�ȭ
	static int sum_sumave = 0; // �������� �ʱ�ȭ
	
	static int iPerson_onepage = 0;  // ���������� �þ�� �ο���..��ն����� �̷��� �ؾ���...

	static final int iPerson = 30; // 200�� �����Ŵ�..
	static final int onepage_MaxPrint = 30; // �������� ���� ��...

	public static void dataSet() {
		for (int i = 0; i < iPerson; i++) { // ������ ����..
			String student_id = String.format("%03d", i + 1); // �й�..
			String name = String.format("ȫ��%03d", i + 1); // �̸�..
			int kor = (int) (Math.random() * 100); // ����..
			int eng = (int) (Math.random() * 100); // ����
			int mat = (int) (Math.random() * 100); // ����
			OneRec_ArrayList.add(new P10_OneRec(student_id, name, kor, eng, mat)); // ��üArrayList�� add
		}
	}

	public static void HeaderPrint(int i) { // ��� ����Ʈ �޼ҵ�..
		Calendar k20_cal = Calendar.getInstance(); // Calendar import�Ͽ� ����ð� ���
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ����ð� ��� ����

		System.out.printf("                    ��������ǥ\n\n");
		System.out.printf("PAGE : %2d             ������� : %s\n", i, k20_sdt.format(k20_cal.getTime())); // ��� �κ�...
		System.out.printf("====================================================\n");
		System.out.printf("%2s %4s  %2s     %2s     %2s    %2s     %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("====================================================\n");
	}

	public static void ItemPrint(int i, int j) { // ����ǰ�� �μ�...
		P10_OneRec rec; // ���� �׸� ����

		rec = OneRec_ArrayList.get(i + (j - 1) * onepage_MaxPrint); // �׸��� ��´�..
		System.out.printf("%3s%6s  %3d      %3d      %3d      %3d   %6.2f\n", rec.student_id(), rec.name(), rec.kor(), rec.eng(),
				rec.mat(), rec.sum(), rec.ave());

		sumkor += rec.kor(); //���ذ���...
		sumeng += rec.eng(); //���ذ���...
		summat += rec.mat(); //���ذ���...
		sumsum += rec.sum(); //���ذ���...
		sumave += rec.ave(); //���ذ���...

	}

	public static void TailPrint(int onepageMax) { //�ϴܺ� �μ�
		sum_sumkor += sumkor; // ���� �����հ�
		sum_sumeng += sumeng; // ���� �����հ�
		sum_summat += summat; // ���� �����հ�
		sum_sumsum += sumsum; // �հ��� �����հ�
		sum_sumave += sumave; // ��� �����հ�
		
		iPerson_onepage += onepageMax; // �ο� �����հ� 

		System.out.printf("====================================================\n");
		System.out.printf("����������\n");
		System.out.printf("�հ�    %8d %8d %8d %8d %8.2f\n", // �հ� ���.. 
				sumkor, sumeng, summat, sumsum, sumsum / 3.0);
		System.out.printf("���    %8.2f %8.2f %8.2f %8.2f %8.2f\n",  // ��� ���...
				sumkor / (double) onepageMax,
				sumeng / (double) onepageMax, 
				summat / (double) onepageMax,
				sumsum / (double) onepageMax, 
				sumsum / 3.0 / (double) onepageMax);
		System.out.printf("====================================================\n");
		System.out.printf("����������\n");
		System.out.printf("�հ�    %8d %8d %8d %8d %8.2f\n",  // �հ� ���..
				sum_sumkor, sum_sumeng, sum_summat, sum_sumsum, sum_sumsum / 3.0); // ��� ���...
		System.out.printf("���    %8.2f %8.2f %8.2f %8.2f %8.2f\n", 
				sum_sumkor / (double) iPerson_onepage,
				sum_sumeng / (double) iPerson_onepage, 
				sum_summat / (double) iPerson_onepage,
				sum_sumsum / (double) iPerson_onepage,
				sum_sumsum / 3.0 / (double) iPerson_onepage);
		System.out.printf("====================================================\n\n\n");


		sumkor = 0; // �������� ����� ������������ �ʱ�ȭ...
		sumeng = 0;
		summat = 0;
		sumsum = 0;
		sumave = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dataSet(); // ������ ����..
		//dataSort(); // ������ ��Ʈ...
		
		for (int j = 1; j <= iPerson / onepage_MaxPrint; j++) { // ������..
			HeaderPrint(j); // ��� ����Ʈ
			for (int i = 0; i < onepage_MaxPrint; i++) {
				ItemPrint(i, j); // �� ǰ�� ����Ʈ..
			}
			TailPrint(onepage_MaxPrint); // �ϴܺ� ����Ʈ..
		}
		
		HeaderPrint(iPerson / onepage_MaxPrint + 1); // ������ ������..����� �ƽøغ��� ���� ��µɰ���..
		for (int i = 0; i < iPerson % onepage_MaxPrint; i++) { 
			ItemPrint(i, iPerson / onepage_MaxPrint + 1); // �� ǰ�� ����Ʈ...
		}
		TailPrint(iPerson % onepage_MaxPrint); // �ϴܺ� ����Ʈ.. ���� �ο��鸸ŭ ���..

		
	}
	
	public static void dataSort() { // ��Ʈ �޼���..
		Comparator<P10_OneRec> bikyeokijun = new Comparator<P10_OneRec>() {
			public int compare(P10_OneRec a1, P10_OneRec a2) { // a1 a2 �ٲ��.. ���� �ٲ��..
				return (a2.sum() - a1.sum());
			}
		};
		Collections.sort(OneRec_ArrayList, bikyeokijun); // ������ ���ƹ�����...
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
