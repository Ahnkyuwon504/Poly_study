package newprj0305;

public class Math01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.min(3, 13));
		System.out.println(Math.max(123, 54));
		System.out.println(Math.abs(-23.1));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.random());
		
		double temp = Math.random() * 45;   // 0~1������ ���������� 45�� �������Ƿ� 0~45���� ����
		int temp2 = (int) Math.round(temp);
		System.out.println(temp);
		System.out.println((int)temp);
		
		
		for (int i = 0; i < 6; i++) {
			double temp3 = Math.random() * 45;
			System.out.print((int)temp3 + " ");   // �ζ�
		}
	}
}
