package newprj0402;

public class HW13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #13. ����,�ݺ�,�迭 13�� / 2021.04.01. / 2125341020 �ȱԿ�
		// ��������1
		///////////////////////////////////////////////////
		
		for (int k20_i = 1; k20_i < 13; k20_i++) { // for�� Ȱ���Ͽ� 1������ 12������ ������.
			System.out.printf(" %d�� => ",k20_i); // ���� �˷��ִ� ���
			for (int k20_j = 1; k20_j < 32; k20_j++) { // ������ for�� Ȱ���Ͽ� 1�Ϻ��� �� ���� ���ϱ���.
				System.out.printf("%d,", k20_j); // ���� �˷��ִ� ���
				
				if (k20_i == 1 && k20_j == 30) { // 1���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 2 && k20_j == 27) { // 2���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 3 && k20_j == 30) { // 3���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 4 && k20_j == 29) { // 4���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 5 && k20_j == 30) { // 5���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 6 && k20_j == 29) { // 6���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 7 && k20_j == 30) { // 7���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 8 && k20_j == 30) { // 8���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 9 && k20_j == 29) { // 9���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 10 && k20_j == 30) { // 10���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 11 && k20_j == 29) { // 11���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
				if (k20_i == 12 && k20_j == 30) { // 12���� ������ �Ǹ� break
					System.out.printf("%d", k20_j+1); break; // ���Ͽ� �޸� ���°� �Ⱦ ���� ����
				}
			}
			System.out.printf("\n"); // �Ѵ� �Է� �������� �ٳѰܼ� �����޷� �Ѿ
		}

	}

}
