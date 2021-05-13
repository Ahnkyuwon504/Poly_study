package third_amusement;

public class Operating_class {
	
	public int GetPrice(String day_Or_night, String real_age, int amount, String treatment) {
		int price = 0;
		
		for (int i = 0; i < ConstantValue_class.CHARGE_DOUBLE_ARRAY.length; i++) {
			for (int j = 0; j < ConstantValue_class.CHARGE_DOUBLE_ARRAY[i].length; j++) {
				if (day_Or_night.equals(ConstantValue_class.DAYNIGHT_ARRAY[i])) {
					if (real_age.equals(ConstantValue_class.STRING_AGE_ARRAY[j])) {
						price = ConstantValue_class.CHARGE_DOUBLE_ARRAY[i][j];
						break;
					}
				}
			}
			
		}
		price *= amount;
		for (int i = 0; i < ConstantValue_class.TREAT_ARRAY.length; i++) {
			if (treatment.equals(ConstantValue_class.TREAT_ARRAY[i])) {
				price *= ConstantValue_class.DISCOUNT_TREAT_ARRAY[i];
				break;
			}
			
		}
		return price;
	}

}
