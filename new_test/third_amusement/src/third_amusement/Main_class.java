package third_amusement;

public class Main_class {

	public static void main(String[] args) {
		Input_class inputclass = new Input_class();
		Operating_class operatingclass = new Operating_class();
		
		while (true) {
			TicketInfo_class ticketinfoclass = new TicketInfo_class();
			while (true) {
				ticketinfoclass.setDay_Or_night(inputclass.get_dayOrnight_Inputfromconsole());
				ticketinfoclass.setAge(inputclass.get_socialnumber_Inputfromconsole());
				ticketinfoclass.setAmount(inputclass.get_amount_Inputfromconsole());
				ticketinfoclass.setTreatment(inputclass.get_treatment_Inputfromconsole());
				ticketinfoclass.setPrice(ticketinfoclass.getDay_Or_night(), ticketinfoclass.getAge(), 
										 ticketinfoclass.getAmount(), ticketinfoclass.getTreatment());
				
				
				
				
				
				
				
				
				
				
				
				
				if (inputclass.exitOrnot() == 2) {
					break;
				}
			}
			
			if (inputclass.final_exitOrnot() == 2) {
				break;
			}
		}

	}

}
