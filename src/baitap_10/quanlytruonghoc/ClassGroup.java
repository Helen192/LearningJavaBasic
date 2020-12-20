package baitap_10.quanlytruonghoc;
import java.util.Scanner;

public class ClassGroup {
	String classCode, rollNo;
	
	public ClassGroup() {
	}

	public ClassGroup(String classCode, String rollNo) {
		this.classCode = classCode;
		this.rollNo = rollNo;
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Code of class: ");
		classCode = input.nextLine();
		
		System.out.println("Student's ID: ");
		rollNo = input.nextLine();
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	
	
	

}
