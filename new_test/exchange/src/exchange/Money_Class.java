package exchange;

import java.io.IOException;

public class Money_Class {
	public Output_Class output_class = null; 

	public Money_Class () { // define constructor#2
		output_class = new Output_Class();
	}

	public boolean checkBalance(double won, int N) {
		boolean temp = true;
		switch (N) {
		case 1:
			if (won <= ConstValue_Class.BALANCE_USD) {
				temp = true;
			} else {
				temp = false;
			}
			break;
		case 2:
			if (won <= ConstValue_Class.BALANCE_EUR) {
				temp = true;
			} else {
				temp = false;
			}
			break;
		case 3:
			if (won <= ConstValue_Class.BALANCE_JPY) {
				temp = true;
			} else {
				temp = false;
			}
			break;
		}
		return temp;
	}

	public void updateBalance(int N, int money) {
		switch (N) {
		case 1:
			 ConstValue_Class.BALANCE_USD = ConstValue_Class.BALANCE_USD - money;
			 break;
		case 2:
			 ConstValue_Class.BALANCE_EUR = ConstValue_Class.BALANCE_EUR - money;
			 break;
		case 3:
			 ConstValue_Class.BALANCE_JPY = ConstValue_Class.BALANCE_JPY - money;
			 break;
		}
	}
	
	public double getNationBalance(int N) {
		double bal = 0;
		switch (N) {
		case 1:
			 bal = ConstValue_Class.BALANCE_USD;
			 break;
		case 2:
			 bal = ConstValue_Class.BALANCE_EUR;
			 break;
		case 3:
			 bal = ConstValue_Class.BALANCE_JPY;
			 break;
		}
		return bal;
	}

	public void changeToNation(double won, double ratio, int[] array, int N) throws IOException {
		double returnDirty, returnWon;
		int returnClean, returnMoreClean, returnWonClean;
		int magicNumber = array[array.length - 1];

		returnDirty = won / ratio;
		returnClean = (int) returnDirty;
		returnMoreClean = (returnClean / magicNumber) * magicNumber;

		returnWon = returnDirty - returnMoreClean;
		returnWon = returnWon * ratio;
		returnWon = returnWon / 10; // cut below 2nd index
		returnWonClean = (int) returnWon * 10;
		
		outputclass.showBalance(N);
		if (checkBalance(returnClean, N) == true) {
			outputclass.printMoney(returnMoreClean, array);
			outputclass.printMoney(returnWonClean, ConstValueClass.WON);
			updateBalance(N, returnMoreClean);
			outputclass.showBalance(N);
		} else {
			outputclass.printMoney((int)getNationBalance(N), array);
			outputclass.printMoney(((int)won - ((int)ratio * (int)getNationBalance(N))), array);
			updateBalance(N, (int)getNationBalance(N));
			outputclass.showBalance(N);
		}
	}

}
