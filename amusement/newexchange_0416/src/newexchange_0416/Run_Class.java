package newexchange_0416;

import java.io.IOException;
import java.util.ArrayList;

public class Run_Class {
	Operating_Class operatingclass = null;
	Output_Class outputclass = null;
	Data_Class dataclass = null;
	Write_Class writeclass = null;
	
	public void run_EachNation(int won_UserWant_Input, int nation_UserWant_Input) throws IOException {
		operatingclass = new Operating_Class();
		outputclass = new Output_Class();
		dataclass = new Data_Class();
		writeclass = new Write_Class();

		int foreigncurrency_ToGive, won_change_ToGive;
		int[] bill_foreign, bill_won;

		int won_UserWant = won_UserWant_Input;
		int nation_UserWant = nation_UserWant_Input;
		int user_choice_balance = get_Balance(nation_UserWant_Input);
		
		foreigncurrency_ToGive = operatingclass.get_ForeignCurrencyToGive_FromUserWon(won_UserWant, nation_UserWant);
		if (user_choice_balance >= foreigncurrency_ToGive) {
			won_change_ToGive = operatingclass.get_WonToGive_Change(won_UserWant, foreigncurrency_ToGive,
					nation_UserWant);
		} else {
			System.out.print("죄송합니다. 해당외화 잔고가 부족하여 보유액만큼 환전하겠습니다.\n");
			foreigncurrency_ToGive = user_choice_balance;
			won_change_ToGive = operatingclass.get_WonToGive_Change(won_UserWant, user_choice_balance, nation_UserWant);
		}
		
		bill_foreign = operatingclass.get_HowMany_Bills(foreigncurrency_ToGive, nation_UserWant);
		bill_won = operatingclass.get_HowMany_Bills(won_change_ToGive, 4);
		
		update_Balance(foreigncurrency_ToGive, nation_UserWant);
		
		outputclass.print_foreign(nation_UserWant, foreigncurrency_ToGive, bill_foreign);
		outputclass.print_won(won_change_ToGive, bill_won);
		
		set_Data(dataclass, won_UserWant_Input, nation_UserWant_Input, foreigncurrency_ToGive,
				bill_foreign, won_change_ToGive, bill_won);
		writeclass.write_Data(dataclass, nation_UserWant);
	}
	
	public static void set_Data (Data_Class dataclass, int won_UserWant_Input, 
			int nation_UserWant_Input, int foreigncurrency_Togive, int[] bill_foreign, 
			int won_change_ToGive, int[] bill_won) {
		
		dataclass.setUSER_WANT_MONEY(won_UserWant_Input);
		dataclass.setUSER_WANT_NATION(nation_UserWant_Input);
		dataclass.setREAL_EXCHANGE_MONEY(foreigncurrency_Togive);
		dataclass.setREAL_EXCHANGE_BILLS(bill_foreign);
		dataclass.setREAL_CHANGE_WON(won_change_ToGive);
		dataclass.setREAL_CHANGE_BILLS(bill_won);
		dataclass.setBALANCE(
				ConstantValue_Class.BALANCE_USD, ConstantValue_Class.BALANCE_EURO, ConstantValue_Class.BALANCE_JPY);
	}

	public static void update_Balance(int foreigncurrency, int nation) {
		switch (nation) {
		case 1:
			ConstantValue_Class.BALANCE_USD -= foreigncurrency; break;
		case 2:
			ConstantValue_Class.BALANCE_EURO -= foreigncurrency; break;
		case 3:
			ConstantValue_Class.BALANCE_JPY -= foreigncurrency; break;
		}
	}
	
	public void update_AllnationBalance(int[] balancearray) {
		ConstantValue_Class.BALANCE_USD = balancearray[0];
		ConstantValue_Class.BALANCE_EURO = balancearray[1];
		ConstantValue_Class.BALANCE_JPY = balancearray[2];
	}

	public static int get_Balance(int nation) {
		int balance = 0;
		switch (nation) {
		case 1:
			balance = ConstantValue_Class.BALANCE_USD;
			break;
		case 2:
			balance = ConstantValue_Class.BALANCE_EURO;
			break;
		case 3:
			balance = ConstantValue_Class.BALANCE_JPY;
			break;
		}
		return balance;
	}

}
