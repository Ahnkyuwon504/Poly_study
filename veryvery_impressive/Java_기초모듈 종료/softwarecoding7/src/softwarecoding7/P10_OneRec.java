///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 10. Ŭ������ ArrayList �����
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P10_OneRec {
	private String k20_student_id; // �������� ����
	private String k20_name; // �������� ����
	private int k20_kor; // �������� ����
	private int k20_eng; // �������� ����
	private int k20_mat; // �������� ����
	
	public P10_OneRec(String student_id, String name, int kor, int eng, int mat) { // ������
		this.k20_student_id = student_id; // �й� �ʱ�ȭ...
		this.k20_name = name; // �̸� �ʱ�ȭ..
		this.k20_kor = kor; // ���� �ʱ�ȭ..
		this.k20_eng = eng; // ���� �ʱ�ȭ..
		this.k20_mat = mat; // ���� �ʱ�ȭ..
	}
	
	public String student_id() {return this.k20_student_id;}; // �̸� return..
	public String name() {return this.k20_name;}; // �̸� return..
	public int kor() {return this.k20_kor;}; // ���� return..
	public int eng() {return this.k20_eng;}; // ���� return..
	public int mat() {return this.k20_mat;}; // ���� return..
	public int sum() {return this.k20_kor + this.k20_eng + this.k20_mat;}; // ���� return..
	public double ave() {return this.sum() / 3.0;}; // ��� return...

	

}
