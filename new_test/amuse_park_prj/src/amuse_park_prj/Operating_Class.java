package amuse_park_prj;

public class Operating_Class {
	public int get_One_Ticket_Price(int dayOrNight, int Age, int howMany, int treatment) {
		int Price = 0;
		int year_Now = 2021;
		int real_Age;
		// ���� ���� ����
		if (Age < 22) {
			real_Age = 21 - Age;
		} else {
			real_Age = 121 - Age;
		}
		// ��&�� / �������̿� ���� �����̿���
		if (dayOrNight == 1) {
			if (real_Age >= Constant_Value_Class.AGE_OLD) { // �ְ� ���
				Price = Constant_Value_Class.DAY_CHARGE_OLD;
			} else if (real_Age >= Constant_Value_Class.AGE_ADULT) { // �ְ� ����
				Price = Constant_Value_Class.DAY_CHARGE_ADULT;
			} else if (real_Age >= Constant_Value_Class.AGE_TEEN) { // �ְ� û�ҳ�
				Price = Constant_Value_Class.DAY_CHARGE_TEEN;
			} else if (real_Age >= Constant_Value_Class.AGE_CHILD) { // �ְ� ����
				Price = Constant_Value_Class.DAY_CHARGE_CHILD;
			} else { 												// �ְ� ����
				Price = Constant_Value_Class.DAY_CHARGE_BABY;
			} 
		} else if (dayOrNight == 2) {
			if (real_Age >= Constant_Value_Class.AGE_OLD) { // �߰� ���
				Price = Constant_Value_Class.NIGHT_CHARGE_OLD;
			} else if (real_Age >= Constant_Value_Class.AGE_ADULT) { // �߰� ����
				Price = Constant_Value_Class.NIGHT_CHARGE_ADULT;
			} else if (real_Age >= Constant_Value_Class.AGE_TEEN) { // �߰� û�ҳ�
				Price = Constant_Value_Class.NIGHT_CHARGE_TEEN;
			} else if (real_Age >= Constant_Value_Class.AGE_CHILD) { // �߰� ����
				Price = Constant_Value_Class.NIGHT_CHARGE_CHILD;
			} else {												// �߰� ����
				Price = Constant_Value_Class.NIGHT_CHARGE_BABY; 
			} 
		}
		// �����׿� ���� ����
		switch (treatment) {
		case 1: // ����
			break;
		case 2: // �����
			Price *=Constant_Value_Class.SALE_DISABLED;
			break;
		case 3: // ����������
			Price *= Constant_Value_Class.SALE_NATIONAL;
			break;
		case 4: // ���ڳ�
			Price *= Constant_Value_Class.SALE_MULTICHILD;
			break;
		case 5: // �ӻ��
			Price *= Constant_Value_Class.SALE_PREGNANT;
			break;
		}
		// ���� ��
		Price *= howMany;
		return Price;
	}
	
	public String get_OneLine_Ticket (int dayOrNight, int Age, int howMany, int Price, int treatment) {
		String one_Line = "";
		int real_Age; // ���� ���� ���� int ����
		// ���� ���� ����
		if (Age < 22) {
			real_Age = 21 - Age;
		} else {
			real_Age = 121 - Age;
		}
		// ù ��°�� ���� �߰�
		if (dayOrNight == 1) {
			one_Line += "�ְ��� ";
		} else {
			one_Line += "�߰��� ";
		}
		// ���ɱ��� �߰�
		if (real_Age >= Constant_Value_Class.AGE_OLD) { // �ְ� ���
			one_Line += "���   X  ";
		} else if (real_Age >= Constant_Value_Class.AGE_ADULT) { // �ְ� ����
			one_Line += "����   X  ";
		} else if (real_Age >= Constant_Value_Class.AGE_TEEN) { // �ְ� û�ҳ�
			one_Line += "û�ҳ� X  ";
		} else if (real_Age >= Constant_Value_Class.AGE_CHILD) { // �ְ� ����
			one_Line += "����   X  ";
		} else { // �ְ� ����
			one_Line += "����   X  ";
		}
		// ���� �߰�
		one_Line += howMany + "   ";
		// ���� �߰�
		one_Line += Price + "��   ";
		// ������ �߰�
		switch (treatment) {
		case 1: // ����
			one_Line += "*������� ����"; 
			break;
		case 2: // �����
			one_Line += "*����� �������";
			break;
		case 3: // ����������
			one_Line += "*���������� �������";
			break;
		case 4: // ���ڳ�
			one_Line += "*���ڳ� �������";
			break;
		case 5: // �ӻ��
			one_Line += "*�ӻ�� �������";
			break;
		}
		return one_Line;
	}
}
