package newexchange_0416;

public class Output_Class {
	
	public void print_foreign (int nation, int foreign, int[] bill_foreign) {
		switch (nation) {
		case 1 :
			System.out.printf("\n***********************************\n"
					+ "���� �޷� : %d�޷�\n���� �޷� ���λ���\n", foreign);
			for (int i = 0; i < bill_foreign.length; i++) {
				System.out.printf("%d�޷� : %d�� ", ConstantValue_Class.USD_BILL[i], bill_foreign[i]);
			}
			System.out.printf("\n"); break;
		case 2 :
			System.out.printf("\n���� ���� : %d����\n���� ���� ���λ���\n", foreign);
			for (int i = 0; i < bill_foreign.length; i++) {
				System.out.printf("%d���� : %d�� ", ConstantValue_Class.EURO_BILL[i], bill_foreign[i]);
			}
			System.out.printf("\n"); break;
		case 3 :
			System.out.printf("\n���� ��ȭ : %d��\n���� ��ȭ ���λ���\n", foreign);
			for (int i = 0; i < bill_foreign.length; i++) {
				System.out.printf("%d�� : %d�� ", ConstantValue_Class.JPY_BILL[i], bill_foreign[i]);
			}
			System.out.printf("\n"); break;
		}
	}
	
	public void print_won (int won, int[] bill_won) {
		System.out.printf("\n���� ��(�Ž�����) : %d\n���� �� ���λ���\n", won);
		for (int i = 0; i < bill_won.length; i++) {
			System.out.printf("%d�� : %d�� ", ConstantValue_Class.WON_BILL[i], bill_won[i]);
		}
		System.out.printf("\n\n");
		System.out.printf("���� �ܰ��Ȳ : %d�޷�, %d����, %d��\n", 
				ConstantValue_Class.BALANCE_USD, ConstantValue_Class.BALANCE_EURO, ConstantValue_Class.BALANCE_JPY);
		System.out.printf("�̿��� �ּż� �����մϴ�.\n***********************************\n\n");
	}

}
