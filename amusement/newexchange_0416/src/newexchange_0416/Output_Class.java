package newexchange_0416;

public class Output_Class {
	
	public void print_foreign (int nation, int foreign, int[] bill_foreign) {
		switch (nation) {
		case 1 :
			System.out.printf("\n***********************************\n"
					+ "지급 달러 : %d달러\n지급 달러 세부사항\n", foreign);
			for (int i = 0; i < bill_foreign.length; i++) {
				System.out.printf("%d달러 : %d장 ", ConstantValue_Class.USD_BILL[i], bill_foreign[i]);
			}
			System.out.printf("\n"); break;
		case 2 :
			System.out.printf("\n지급 유로 : %d유로\n지급 유로 세부사항\n", foreign);
			for (int i = 0; i < bill_foreign.length; i++) {
				System.out.printf("%d유로 : %d장 ", ConstantValue_Class.EURO_BILL[i], bill_foreign[i]);
			}
			System.out.printf("\n"); break;
		case 3 :
			System.out.printf("\n지급 엔화 : %d엔\n지급 엔화 세부사항\n", foreign);
			for (int i = 0; i < bill_foreign.length; i++) {
				System.out.printf("%d엔 : %d장 ", ConstantValue_Class.JPY_BILL[i], bill_foreign[i]);
			}
			System.out.printf("\n"); break;
		}
	}
	
	public void print_won (int won, int[] bill_won) {
		System.out.printf("\n지급 원(거스름돈) : %d\n지급 원 세부사항\n", won);
		for (int i = 0; i < bill_won.length; i++) {
			System.out.printf("%d원 : %d장 ", ConstantValue_Class.WON_BILL[i], bill_won[i]);
		}
		System.out.printf("\n\n");
		System.out.printf("현재 잔고상황 : %d달러, %d유로, %d엔\n", 
				ConstantValue_Class.BALANCE_USD, ConstantValue_Class.BALANCE_EURO, ConstantValue_Class.BALANCE_JPY);
		System.out.printf("이용해 주셔서 감사합니다.\n***********************************\n\n");
	}

}
