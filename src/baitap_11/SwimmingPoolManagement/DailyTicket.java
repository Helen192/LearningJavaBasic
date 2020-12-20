package baitap_11.SwimmingPoolManagement;
import java.util.Scanner;

public class DailyTicket extends Ticket {
	String durationCode;
	
	public DailyTicket() {
	}

	@Override
	public void input() {
		super.input();
		Scanner input = new Scanner(System.in);
		boolean isFind = false;
		do {
			DurationTime.showDurationTimes();         // show all durationTimes
			System.out.println("Duration code: ");
			String str = input.nextLine();
			// check, whether the duration code entered has already been in the durationTimes list is. 
			if(DurationTime.checkDurationTime(str)) {
				durationCode = str;
				isFind = true;
			}
			else {
				System.err.println("duration code was not found. Please try again!");  // neu ko tim thay duration code trong List, thi yeu cau ho nhap lai
			}
		} while (isFind);
		
	}
	
	@Override
	public String toString() {
		return DailyTicket.class.getName() + super.toString() +", durationCode= " + durationCode;
	}
	
	public String getDurationCode() {
		return durationCode;
	}

	public void setDurationCode(String durationCode) {
		this.durationCode = durationCode;
	}
	
	

}
