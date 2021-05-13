///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 11. Ŭ������ ArrayList
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.util.ArrayList;

public class P11_Main {
	static ArrayList<P10_OneRec> OneRec_ArrayList = new ArrayList<P10_OneRec>();
	// ��ü�� Ÿ������ �ϴ� ArrayList ����
	static int sumkor = 0; // ���� �ʱ�ȭ
	static int sumeng = 0; // ���� �ʱ�ȭ
	static int summat = 0; // ���� �ʱ�ȭ
	static int sumsum = 0; // �հ� �ʱ�ȭ
	static int sumave = 0; // ��� �ʱ�ȭ
	static final int iPerson = 20; // 20������..
	
	public static void dataSet() {
		for (int i = 0; i < iPerson; i++) { // 20��ŭ ������ ����
			String student_id = String.format("%03d", i + 1); // �й�
			String name = String.format("ȫ��%03d", i + 1); // �̸�
			int kor = (int)(Math.random() * 100); // �����
			int eng = (int)(Math.random() * 100); // �����
			int mat = (int)(Math.random() * 100); // ���м���
			OneRec_ArrayList.add(new P10_OneRec(student_id, name, kor, eng, mat)); // ��ü �����Ͽ� ArrayList �߰�
		}
	}
	
	public static void HeaderPrint() {
		System.out.printf("***************************************\n"); // �� ���
		System.out.printf("%2s %4s  %2s %2s %2s %2s   %2s\n", // ��� �κ�
						  "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("***************************************\n"); // �� ���
	}
	
	public static void ItemPrint(int i) {
		P10_OneRec rec; // ��ü ���� �׸� ����
		
		rec = OneRec_ArrayList.get(i); // �׸��� ��´�...
		System.out.printf("%3s %4s   %3d  %3d  %3d  %3d %6.2f\n",
				  rec.student_id(), rec.name(), // ��ü�� ��ҵ�
				  rec.kor(), rec.eng(), rec.mat(), rec.sum(), rec.ave());
		
		sumkor += rec.kor(); // ��� ������
		sumeng += rec.eng(); // ��� ������
		summat += rec.mat(); // ��� ������
		sumsum += rec.sum(); // ��� ������
		sumave += rec.ave(); // ��� ������
	}
	
	public static void TailPrint() {
		System.out.printf("***************************************\n");
		System.out.printf(" �����հ� %8d  ������� %6.2f\n", sumkor, sumkor / (double)OneRec_ArrayList.size()); // ���� �հ�... 6���� ���ϰ� �ٸ�
		System.out.printf(" �����հ� %8d  ������� %6.2f\n", sumeng, sumeng / (double)OneRec_ArrayList.size()); // ���� �հ�
		System.out.printf(" �����հ� %8d  ������� %6.2f\n", summat, summat / (double)OneRec_ArrayList.size()); // ���� �հ�
		System.out.printf("***************************************\n");
		System.out.printf(" ������հ� %6d  ����� %6.2f\n", (sumkor + sumeng + summat) / 3, (sumkor + sumeng + summat) / 3.0 / 20.0); // �� ���..�հ�..

	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSet(); // ������ ���� �޼ҵ�
		HeaderPrint(); // ��� ����Ʈ
		for (int i = 0; i < OneRec_ArrayList.size(); i++) {
			ItemPrint(i); // ����ǰ�� ����Ʈ
		}
		TailPrint(); // �ϴ� ����Ʈ
		

	}

}
