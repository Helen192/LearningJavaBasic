package baitap_10.quanlytruonghoc;
import java.util.Scanner;

public class Subject {
	String subjectCode, subjectName;
	
	public Subject() {
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name of subject: ");
		subjectName = input.nextLine();
		 
		System.out.println("Code of subject: ");
		subjectCode = input.nextLine();
	}
	
	

	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + "]";
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	

}
