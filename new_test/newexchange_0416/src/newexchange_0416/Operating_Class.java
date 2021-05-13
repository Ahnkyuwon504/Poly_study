package newexchange_0416;

import java.util.ArrayList;
import java.util.Iterator;

public class Operating_Class {
	public int get_ForeignCurrencyToGive_FromUserWon (int UserWon, int Nation) {
		int ForeignCurrency = 0;
		
		switch (Nation) {
		case ConstantValue_Class.USER_CHOICE_USD :
			ForeignCurrency = (int) (UserWon / ConstantValue_Class.USD_RATIO); break;
		case ConstantValue_Class.USER_CHOICE_EURO :
			ForeignCurrency = (int) (UserWon / ConstantValue_Class.EURO_RATIO);
			ForeignCurrency -= ForeignCurrency%5; break;
		case ConstantValue_Class.USER_CHOICE_JPY :
			ForeignCurrency = (int) (UserWon / ConstantValue_Class.JPY_RATIO);
			ForeignCurrency -= ForeignCurrency%1000; break;
		}
		return ForeignCurrency;
	}
	
	public int get_WonToGive_Change (int UserWon, int ForeignToGive, int Nation) {
		int won_ToGive = 0;
		
		switch (Nation) {
		case ConstantValue_Class.USER_CHOICE_USD :
			won_ToGive = UserWon - (int) (ForeignToGive * ConstantValue_Class.USD_RATIO); break;
		case ConstantValue_Class.USER_CHOICE_EURO :
			won_ToGive = UserWon - (int) (ForeignToGive * ConstantValue_Class.EURO_RATIO); break;
		case ConstantValue_Class.USER_CHOICE_JPY :
			won_ToGive = UserWon - (int) (ForeignToGive * ConstantValue_Class.JPY_RATIO); break;
		}
		won_ToGive -= won_ToGive%10;
		return won_ToGive;
	}
	
	public int[] get_HowMany_Bills (int amount, int N) {
		int[] howmany_bill = null;
		int[] list_bill = null;
		
		switch (N) {
		case 1 : list_bill = ConstantValue_Class.USD_BILL; break;
		case 2 : list_bill = ConstantValue_Class.EURO_BILL; break;
		case 3 : list_bill = ConstantValue_Class.JPY_BILL; break;
		case 4 : list_bill = ConstantValue_Class.WON_BILL; break;
		}
		howmany_bill = new int[list_bill.length];
	
		int howmany_eachbill;
		for (int i = 0; i < list_bill.length; i++) {
			howmany_eachbill = amount/list_bill[i];
			amount = amount%list_bill[i];
			howmany_bill[i] = howmany_eachbill;
		}
		return howmany_bill;
	}
}
