package softwarecoding6;

public class Star2 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 2. ������ �޼���(2)
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	static int k20_iStatic; // static ���� ����
	
	public static void add(int k20_i) { // �޼ҵ�
		k20_iStatic++; // static������ ���� �ø�.
		k20_i++; // �޼ҵ��� parameter�� ���� �ø�.
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", k20_iStatic);
		// ���
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", k20_i);
		// ���
	}
	
	public static int add2(int k20_i) { // �޼ҵ�
		k20_iStatic++; // static������ ���� �ø�.
		k20_i++; // �޼ҵ��� parameter ���� �ø�.
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", k20_iStatic);
		// ���
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", k20_i);
		// ���
		return k20_i; // int return�޼ҵ��̹Ƿ� ���ϰ� �־����...
	}

	public static void main(String[] args) { // ���� �޼ҵ�
		// TODO Auto-generated method stub
		int k20_iMain; // ���� ����
		
		k20_iMain = 1; // ������ �ʱ�ȭ
		k20_iStatic = 1; // ������ �ʱ�ȭ
		
		System.out.printf("**********************************\n"); // �� ���
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", k20_iStatic);
		// �翬�� 1
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", k20_iMain);
		// �翬�� 1
		System.out.printf("**********************************\n"); // �� ���
		
		add(k20_iMain); // ù��° �޼ҵ� ȣ��... static�� Ŀ������..
		
		System.out.printf("**********************************\n"); // �� ���
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", k20_iStatic);
		// �翬�� 2..  static�̴ϱ�
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", k20_iMain);
		// �޼ҵ忡���� Ŀ������..�װ��� ���Ϲ����͵� �ƴϰ�..�翬�� �״�� 1
		System.out.printf("**********************************\n"); // �� ���
		
		k20_iMain=add2(k20_iMain); // �ι�° �޼ҵ� ȣ��...��� �� �ٸ�..
		// �������� �ٲ� �����..
		
		System.out.printf("**********************************\n"); // �� ���
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", k20_iStatic);
		// �翬�� 3...
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", k20_iMain); // �� ���
		// �ٲ� �������� return�޾����Ƿ�.. 2�� �Ǿ���
		System.out.printf("**********************************\n"); // �� ���
		

	}

}
