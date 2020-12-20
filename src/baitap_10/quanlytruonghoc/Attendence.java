package baitap_10.quanlytruonghoc;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Attendence {
	enum STATUS {
		PRESENT, ABSENT, PA   //PA: nghi hoc co xin phep
	}
	String rollNo;
	int scheduleId;
	String createdAt, updatedAt;
	STATUS status;
	
	public Attendence() {
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rollNo: ");
		rollNo = input.nextLine();
		
		System.out.println("Schedule's ID: ");
		scheduleId = Integer.parseInt(input.nextLine());
		
		System.out.println("Status: ");
		System.out.println("1. Present");
		System.out.println("2. Absent");
		System.out.println("3. PA");
		System.out.println("Choose (1 or 2 or 3): ");
		int choose = Integer.parseInt(input.nextLine());
		switch (choose) {
		case 1:
			status = STATUS.PRESENT;
			break;
		case 2:
			status = STATUS.ABSENT;
			break;
		default:
			status = STATUS.PA;
			break;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy ");
		Date date = new Date();
		createdAt = dateFormat.format(date);
		updatedAt = createdAt;
	}

	@Override
	public String toString() {
		return "Attendence [rollNo=" + rollNo + ", scheduleId=" + scheduleId + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", status=" + getStatusString() + "]";
	}
	
	public String getStatusString() {
		switch (status) {
		case PRESENT:
			return "Present";
		case ABSENT:
			return "Absent";
		default:
			return "PA";
		}
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}
	
	

}



