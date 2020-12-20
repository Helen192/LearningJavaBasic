package baitap_10.quanlytruonghoc;

import java.util.Scanner;

public class Teacher extends People implements IKey {
	String teacherCode;
	
	public Teacher() {
	}
	
	@Override
	public String getKeyValue() {
		return teacherCode;
	}
	
	@Override
	public void input() {
		super.input();
		Scanner input = new Scanner(System.in);
		System.out.println("Teacher's ID: ");
		// kiem tra xem cai teacherCode moi nhap vao dax ton tai trong List teacher tu truoc do chua
		for(;;) {
			teacherCode = input.nextLine();
			if(MenuController.getInstance().checkExit(DataMgr.getInstance().getTeachers(), teacherCode)) {        // tuc la teacherCode nay da ton tai o trong List teachers rooi
				 System.err.println("Enter again: ");
			}else {
				 break;
			}
		}
		
		
	}

	@Override
	public String toString() {
		return super.toString() + ", teacherCode=" + teacherCode;
	}
	

}
