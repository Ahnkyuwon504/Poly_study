package javaprj0330;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OutputClass {
	public String printMoney(int money, int[] array) throws IOException {
		String temp = "";
		ArrayList<Integer> moneyArrayList = new ArrayList<Integer>();
		
		//System.out.println("Return : " + money);
		temp += "Return : " + money + "\n";
		
		
		for (int i = 0; i < array.length; i++) {
			moneyArrayList.add(money/array[i]);
			//System.out.println(array[i] + ": " + moneyArrayList.get(i));
			temp += array[i] + ": " + moneyArrayList.get(i) + "  "; 
			money = money%array[i];
		}
		temp += "\n";
		return temp;
	}
	
	public String showBalance(int N) throws IOException {
		String temp = "";
		switch (N) {
		case 1:
			//System.out.println("Now we have : " + ConstValueClass.BALANCE_USD + " Dollar.");
			temp += "Now we have : " + ConstValueClass.BALANCE_USD + " Dollar.\n";
			break;
		case 2:
			//System.out.println("Now we have : " + ConstValueClass.BALANCE_EUR + " Euro.");
			temp += "Now we have : " + ConstValueClass.BALANCE_EUR + " Euro.\n";
			break;
		case 3:
			//System.out.println("Now we have : " + ConstValueClass.BALANCE_JPY + " Jpy.");
			temp += "Now we have : " + ConstValueClass.BALANCE_JPY + " Jpy.\n";
			break;
		}
		return temp;
	}
}
