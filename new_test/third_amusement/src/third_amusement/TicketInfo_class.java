package third_amusement;

public class TicketInfo_class {
	private int day_Or_night; // int 받아서 int로 가지고있다가 String return
	private int realage;		  // String 주민번호 받아서 int로 가지고있다가 String return
	private int amount;		  // int 받아서 int로 가지고있다가 int return
	private int treatment;	  // int 받아서 int로 가지고있다가 String return
	private int price;		  // 위의 4개 인자를 받아서 int return
	
	public TicketInfo_class() {
		
	}
	//////////////////////////////////////////////////////
	public String getDay_Or_night() {
		if (day_Or_night == 1) {
			return ConstantValue_class.DAY;
		} else {
			return ConstantValue_class.NIGHT;
		}
	}

	public void setDay_Or_night(int day_Or_night) {
		this.day_Or_night = day_Or_night;
	}
	//////////////////////////////////////////////////////
	public String getAge() {
		String string_age = "";
		
		for (int i = 0; i < ConstantValue_class.AGE_ARRAY.length; i++) {
			if (realage >= ConstantValue_class.AGE_ARRAY[i]) {
				string_age = ConstantValue_class.STRING_AGE_ARRAY[i];
				break;
			}
		}
		return string_age;
	}

	public void setAge(String socialnumber) {
		int year = Integer.parseInt(socialnumber.substring(0, 2));
		
		if (year < 22) {
			this.realage = 22 - year;
		} else {
			this.realage = 122 - year;
		}
	}
	//////////////////////////////////////////////////////
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	//////////////////////////////////////////////////////
	public String getTreatment() {
		String string_treatment = "";
		
		for (int i = 0; i < ConstantValue_class.TREAT_ARRAY.length; i++) {
			if ((treatment - 1) == i) {
				string_treatment = ConstantValue_class.TREAT_ARRAY[i];
				break;
			}
		}
		return string_treatment;
	}

	public void setTreatment(int treatment) {
		this.treatment = treatment;
	}
	//////////////////////////////////////////////////////
	public int getPrice() {
		return price;
	}

	public void setPrice(String day_Or_night, String realage, int amount, String treatment) {
		Operating_class operatingclass = new Operating_class();
		this.price = operatingclass.GetPrice(day_Or_night, realage, amount, treatment);
	}

}
