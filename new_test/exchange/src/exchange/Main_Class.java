package exchange;

import java.io.FileWriter;
import java.util.Calendar;

public class Main_Class {

	public static void main(String[] args) {
		Input_Class inputClass = new Input_Class();
		double won;
		int N;
		
		do { 	
			won = inputClass.inputFromConsoleWon();
			N = inputClass.inputFromConsoleType();

			switch (N) {													// N�� ���� ���� switch�� ����
			case ConstValue_Class.CHANGE_TYPE_USD:							// final static int �̱� ������ ConstValueClass�� ���� ��ü������������.
				moneyFinal.changeToNation(won, ConstValueClass.USD_RATIO, 
						                  ConstValueClass.DOLLAR, N);			// �Ʊ� ������ moneyFinal ��ü���� changeToUSD�޼ҵ� ����(���԰��� int won) 
				break;
				
			case ConstValue_Class.CHANGE_TYPE_EUR:							//  ���� ���� 
				moneyFinal.changeToNation(won, ConstValueClass.EUR_RATIO, 
						                  ConstValueClass.EURO, N);		    //  �Ʊ� ������ moneyFinal ��ü���� changeToEUR�޼ҵ� ����(���԰��� int won)
				break;
				
			case ConstValue_Class.CHANGE_TYPE_JPY:							//  ���� ����
				moneyFinal.changeToNation(won, ConstValueClass.JPY_RATIO, 
						                  ConstValueClass.JPY, N);				//  �Ʊ� ������ moneyFinal ��ü���� changeToUSD�޼ҵ� ����(���԰��� int won)
				break; 
			}
		} while (N != 0);	
	}
}
