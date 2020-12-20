package baitap_10.quanlytruonghoc;

import java.util.Scanner;

public class Student extends People implements IKey {
	String rollNo; // Ma so sinh vien
	
	public Student() {
	}

	public Student(String rollNo, String fullname, String gender, String address, String birthday) {
		super(fullname, gender, address, birthday);
		this.rollNo = rollNo;
	}
	
	@Override
	public String getKeyValue() {
		return rollNo;
	}
	
	@Override
	public void input() {
		super.input();
		Scanner input = new Scanner(System.in);
		System.out.println("Student's ID: ");
		for(;;) {
			rollNo = input.nextLine();
			if(MenuController.getInstance().checkExit(DataMgr.getInstance().getStudents(), rollNo)) {
				System.err.println("Please enter again: ");
			}else {
				break;
			}
			
		}
		
		
	}

	@Override
	public String toString() {
		return super.toString() + ", rollNo=" + rollNo ;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	
	

}
