package exchange_hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Money {
	public static void main(String[] args) throws IOException {
		MoneyFinal moneyFinal = new MoneyFinal();    						// moneyFinal ��ü ����, constValue�� final static���� class�� ���� x
		InputClass inputClass = new InputClass();
		double won;
		int N;
		
		ConstValueClass.get_Balance(); // ����� balance �ҷ�����
		
		while(true) { 	// �Է��� ������ �޴´�.
			won = inputClass.inputFromConsoleWon(); if (won == 0)  break;
			N = inputClass.inputFromConsoleType();

			switch (N) {													// N�� ���� ���� switch�� ����
			case ConstValueClass.CHANGE_TYPE_USD:							// final static int �̱� ������ ConstValueClass�� ���� ��ü������������.
				moneyFinal.changeToNation(won, ConstValueClass.USD_RATIO, 
						                  ConstValueClass.DOLLAR, N);			// �Ʊ� ������ moneyFinal ��ü���� changeToUSD�޼ҵ� ����(���԰��� int won) 
				break;
				
			case ConstValueClass.CHANGE_TYPE_EUR:							//  ���� ���� 
				moneyFinal.changeToNation(won, ConstValueClass.EUR_RATIO, 
						                  ConstValueClass.EURO, N);		    //  �Ʊ� ������ moneyFinal ��ü���� changeToEUR�޼ҵ� ����(���԰��� int won)
				
				break;
				
			case ConstValueClass.CHANGE_TYPE_JPY:							//  ���� ����
				moneyFinal.changeToNation(won, ConstValueClass.JPY_RATIO, 
						                  ConstValueClass.JPY, N);				//  �Ʊ� ������ moneyFinal ��ü���� changeToUSD�޼ҵ� ����(���԰��� int won)
				break; 
			}
		}
	}
}
