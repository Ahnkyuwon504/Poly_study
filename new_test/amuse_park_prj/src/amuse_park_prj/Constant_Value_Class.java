package amuse_park_prj;

import java.util.ArrayList;

public class Constant_Value_Class {
	// �ְ� ���
	public final static int DAY_CHARGE_ADULT = 56000;
	public final static int DAY_CHARGE_TEEN = 47000;
	public final static int DAY_CHARGE_CHILD = 44000;
	public final static int DAY_CHARGE_OLD = 44000;
	public final static int DAY_CHARGE_BABY = 0;
	// �߰� ���
	public final static int NIGHT_CHARGE_ADULT = 46000;
	public final static int NIGHT_CHARGE_TEEN = 40000;
	public final static int NIGHT_CHARGE_CHILD = 37000;
	public final static int NIGHT_CHARGE_OLD = 37000;
	public final static int NIGHT_CHARGE_BABY = 0;
	
	// ���� ����
	public final static int AGE_OLD = 65; // 65�� �̻�
	public final static int AGE_ADULT = 19; // 19�� �̻�
	public final static int AGE_TEEN = 13; // 13�� �̻�
	public final static int AGE_CHILD = 3; // 3�� �̻�
	public final static int AGE_BABY = 0; // 2�� ����
	
	// ��� ����
	public final static double SALE_DISABLED = 0.6; // 2�� ����
	public final static double SALE_NATIONAL = 0.5; // 2�� ����
	public final static double SALE_MULTICHILD = 0.8; // 2�� ����
	public final static double SALE_PREGNANT = 0.85; // 2�� ����
	
	// �ܼ� ��¿� ArrayList(�Ѿ�)
	public static ArrayList<String> output_Tickets = new ArrayList<String>();
}
