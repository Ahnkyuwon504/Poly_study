package amuse_park_prj;

import java.util.ArrayList;

public class Constant_Value_Class {
	// 주간 요금
	public final static int DAY_CHARGE_ADULT = 56000;
	public final static int DAY_CHARGE_TEEN = 47000;
	public final static int DAY_CHARGE_CHILD = 44000;
	public final static int DAY_CHARGE_OLD = 44000;
	public final static int DAY_CHARGE_BABY = 0;
	// 야간 요금
	public final static int NIGHT_CHARGE_ADULT = 46000;
	public final static int NIGHT_CHARGE_TEEN = 40000;
	public final static int NIGHT_CHARGE_CHILD = 37000;
	public final static int NIGHT_CHARGE_OLD = 37000;
	public final static int NIGHT_CHARGE_BABY = 0;
	
	// 나이 구분
	public final static int AGE_OLD = 65; // 65세 이상
	public final static int AGE_ADULT = 19; // 19세 이상
	public final static int AGE_TEEN = 13; // 13세 이상
	public final static int AGE_CHILD = 3; // 3세 이상
	public final static int AGE_BABY = 0; // 2세 이하
	
	// 우대 할인
	public final static double SALE_DISABLED = 0.6; // 2세 이하
	public final static double SALE_NATIONAL = 0.5; // 2세 이하
	public final static double SALE_MULTICHILD = 0.8; // 2세 이하
	public final static double SALE_PREGNANT = 0.85; // 2세 이하
	
	// 콘솔 출력용 ArrayList(총액)
	public static ArrayList<String> output_Tickets = new ArrayList<String>();
}
