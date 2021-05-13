package amuse_park_prj;

public class Operating_Class {
	public int get_One_Ticket_Price(int dayOrNight, int Age, int howMany, int treatment) {
		int Price = 0;
		int year_Now = 2021;
		int real_Age;
		// 실제 나이 산출
		if (Age < 22) {
			real_Age = 21 - Age;
		} else {
			real_Age = 121 - Age;
		}
		// 주&야 / 실제나이에 따른 최초이용요금
		if (dayOrNight == 1) {
			if (real_Age >= Constant_Value_Class.AGE_OLD) { // 주간 경로
				Price = Constant_Value_Class.DAY_CHARGE_OLD;
			} else if (real_Age >= Constant_Value_Class.AGE_ADULT) { // 주간 대인
				Price = Constant_Value_Class.DAY_CHARGE_ADULT;
			} else if (real_Age >= Constant_Value_Class.AGE_TEEN) { // 주간 청소년
				Price = Constant_Value_Class.DAY_CHARGE_TEEN;
			} else if (real_Age >= Constant_Value_Class.AGE_CHILD) { // 주간 소인
				Price = Constant_Value_Class.DAY_CHARGE_CHILD;
			} else { 												// 주간 유아
				Price = Constant_Value_Class.DAY_CHARGE_BABY;
			} 
		} else if (dayOrNight == 2) {
			if (real_Age >= Constant_Value_Class.AGE_OLD) { // 야간 경로
				Price = Constant_Value_Class.NIGHT_CHARGE_OLD;
			} else if (real_Age >= Constant_Value_Class.AGE_ADULT) { // 야간 대인
				Price = Constant_Value_Class.NIGHT_CHARGE_ADULT;
			} else if (real_Age >= Constant_Value_Class.AGE_TEEN) { // 야간 청소년
				Price = Constant_Value_Class.NIGHT_CHARGE_TEEN;
			} else if (real_Age >= Constant_Value_Class.AGE_CHILD) { // 야간 소인
				Price = Constant_Value_Class.NIGHT_CHARGE_CHILD;
			} else {												// 야간 유아
				Price = Constant_Value_Class.NIGHT_CHARGE_BABY; 
			} 
		}
		// 우대사항에 대해 할인
		switch (treatment) {
		case 1: // 없음
			break;
		case 2: // 장애인
			Price *=Constant_Value_Class.SALE_DISABLED;
			break;
		case 3: // 국가유공자
			Price *= Constant_Value_Class.SALE_NATIONAL;
			break;
		case 4: // 다자녀
			Price *= Constant_Value_Class.SALE_MULTICHILD;
			break;
		case 5: // 임산부
			Price *= Constant_Value_Class.SALE_PREGNANT;
			break;
		}
		// 수량 곱
		Price *= howMany;
		return Price;
	}
	
	public String get_OneLine_Ticket (int dayOrNight, int Age, int howMany, int Price, int treatment) {
		String one_Line = "";
		int real_Age; // 실제 나이 구할 int 선언
		// 실제 나이 산출
		if (Age < 22) {
			real_Age = 21 - Age;
		} else {
			real_Age = 121 - Age;
		}
		// 첫 번째로 권종 추가
		if (dayOrNight == 1) {
			one_Line += "주간권 ";
		} else {
			one_Line += "야갼권 ";
		}
		// 연령구분 추가
		if (real_Age >= Constant_Value_Class.AGE_OLD) { // 주간 경로
			one_Line += "경로   X  ";
		} else if (real_Age >= Constant_Value_Class.AGE_ADULT) { // 주간 대인
			one_Line += "대인   X  ";
		} else if (real_Age >= Constant_Value_Class.AGE_TEEN) { // 주간 청소년
			one_Line += "청소년 X  ";
		} else if (real_Age >= Constant_Value_Class.AGE_CHILD) { // 주간 소인
			one_Line += "소인   X  ";
		} else { // 주간 유아
			one_Line += "유아   X  ";
		}
		// 수량 추가
		one_Line += howMany + "   ";
		// 가격 추가
		one_Line += Price + "원   ";
		// 우대사항 추가
		switch (treatment) {
		case 1: // 없음
			one_Line += "*우대적용 없음"; 
			break;
		case 2: // 장애인
			one_Line += "*장애인 우대적용";
			break;
		case 3: // 국가유공자
			one_Line += "*국가유공자 우대적용";
			break;
		case 4: // 다자녀
			one_Line += "*다자녀 우대적용";
			break;
		case 5: // 임산부
			one_Line += "*임산부 우대적용";
			break;
		}
		return one_Line;
	}
}
