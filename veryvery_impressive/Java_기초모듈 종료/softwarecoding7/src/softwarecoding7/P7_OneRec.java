///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 7. Ŭ������ �迭 (6�� InputDataŬ���� �籸��)
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P7_OneRec {
	private String k20_name; // �������� ����
	private int k20_kor; // �������� ����
	private int k20_eng; // �������� ����
	private int k20_mat; // �������� ����
	
	public P7_OneRec(String name, int kor, int eng, int mat) { // ������
		this.k20_name = name; // �̸� �ʱ�ȭ..
		this.k20_kor = kor; // ���� �ʱ�ȭ..
		this.k20_eng = eng; // ���� �ʱ�ȭ..
		this.k20_mat = mat; // ���� �ʱ�ȭ..
	}
	
	public String name() {return this.k20_name;}; // �̸� return..
	public int kor() {return this.k20_kor;}; // ���� return..
	public int eng() {return this.k20_eng;}; // ���� return..
	public int mat() {return this.k20_mat;}; // ���� return..
	public int sum() {return this.k20_kor + this.k20_eng + this.k20_mat;}; // ���� return..
	public double ave() {return this.sum() / 3.0;}; // ��� return...
}

