package softwarecoding6;

public class Star1 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 1. ������ �޼���(1)
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	public static void iamMethod() { // �޼��� ����
		System.out.printf("�޼ҵ�� �ҷ����~~\n"); // �ؽ�Ʈ ���
	}

	public static void main(String[] args) { // ���� �޼���
		// TODO Auto-generated method stub
		Star1.iamMethod(); // ��ü���� ���� �޼��� ȣ��
		// static�̶� ����...
		iamMethod(); // Ŭ������ �����ϰ� ȣ��
	}
}
