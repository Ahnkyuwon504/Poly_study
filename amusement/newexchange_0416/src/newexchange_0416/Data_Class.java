package newexchange_0416;

import java.util.ArrayList;

public class Data_Class {
	private int USER_WANT_MONEY;
	private String USER_WANT_NATION;
	
	private int REAL_EXCHANGE_MONEY;
	private int[] REAL_EXCHANGE_BILLS;
	private int REAL_CHANGE_WON;
	private int[] REAL_CHANGE_BILLS;
	
	private int[] BALANCE = new int[3];
	
	public int getUSER_WANT_MONEY() {
		return USER_WANT_MONEY;
	}
	public void setUSER_WANT_MONEY(int uSER_WANT_MONEY) {
		this.USER_WANT_MONEY = uSER_WANT_MONEY;
	}
	public String getUSER_WANT_NATION() {
		return USER_WANT_NATION;
	}
	public void setUSER_WANT_NATION(int N) {
		String user_want_nation = "";
		switch (N) {
		case 1 : user_want_nation = "Dollar"; break;
		case 2 : user_want_nation = "Euro"; break;
		case 3 : user_want_nation = "Jpy"; break;
		}
		this.USER_WANT_NATION = user_want_nation;
	}
	public int getREAL_EXCHANGE_MONEY() {
		return REAL_EXCHANGE_MONEY;
	}
	public void setREAL_EXCHANGE_MONEY(int rEAL_EXCHANGE_MONEY) {
		this.REAL_EXCHANGE_MONEY = rEAL_EXCHANGE_MONEY;
	}
	
	public int getREAL_CHANGE_WON() {
		return REAL_CHANGE_WON;
	}
	public void setREAL_CHANGE_WON(int rEAL_CHANGE_WON) {
		this.REAL_CHANGE_WON = rEAL_CHANGE_WON;
	}
	
	public int[] getBALANCE() {
		return BALANCE;
	}
	public void setBALANCE(int dol, int euro, int jpy) {
		int[] balance = new int[3];
		balance[0] = dol; balance[1] = euro; balance[2] = jpy;
		this.BALANCE = balance;
	}
	
	public int[] getREAL_EXCHANGE_BILLS() {
		return REAL_EXCHANGE_BILLS;
	}
	public void setREAL_EXCHANGE_BILLS(int[] rEAL_EXCHANGE_BILLS) {
		this.REAL_EXCHANGE_BILLS = rEAL_EXCHANGE_BILLS;
	}
	public int[] getREAL_CHANGE_BILLS() {
		return REAL_CHANGE_BILLS;
	}
	public void setREAL_CHANGE_BILLS(int[] rEAL_CHANGE_BILLS) {
		this.REAL_CHANGE_BILLS = rEAL_CHANGE_BILLS;
	}
}
