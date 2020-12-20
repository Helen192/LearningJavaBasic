package baitap_01;
/*
 * System.out's main purpose is giving standard output.
 * System.err's main purpose is giving standard error.
 */
import java.util.Scanner;
public class Student extends Person {
	String rollNo;
	float mark;
	String email;
	public Student() {   // empty constructor for purpose (default constructor)
	}
	
	@Override
	public void showInfo() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return super.toString()+"; "+"ID: "+getRollNo()+"; "+"Mark: "+getMark()+"; "+"Email: "+getEmail();
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter student's ID: ");
		while(!setRollNo(sc.nextLine())); // tuc la cai gia tri nhap vao neu khong du 8 ky tu thi se duoc yeu cau nhap lai cho toi khi dung thi thoi
		
		System.out.println("Please enter student's mark: ");
		while(!setMark(Float.parseFloat(sc.nextLine())));  // dung parseFloat de tranh mat ky tu khi ng nhap nhap vao space(khoang trang)
		
		System.out.println("Please enter student's email: ");
		while(!setEmail(sc.nextLine())); // phai chua ky tu @ va ko ton tai khoang trang
		
//		// cach dai de thao khao
//		while(true) {
//			String emailInput = sc.nextLine();
//			boolean check = setEmail(emailInput);
//			if(check) {break;}
//		}
		System.out.println(" ");
	}
	public boolean setRollNo(String rollNo) { // Ma sinh vien phai chua 8 ky tu
		if(rollNo!=null && rollNo.length()==8){
			this.rollNo = rollNo;
			return true;
		}else {
			System.err.println("Please enter the eligible student's ID (ID should contain 8 chars):");
			return false;
		}
		
	}
	public String getRollNo() {
		return rollNo;
	}
	public float getMark() {
		return mark;
	}
	public boolean setMark(float mark) {  // diem trung binh tu 0.0 toi 10.0
		if(mark>=0.0 && mark<=10.0) {
			this.mark = mark;
			return true;
		}else {
			System.err.println("Please enter the eligible mark ( 0.0<= mark <=10.0): ");
			return false;
		}
		
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) { // phai chua ky tu @ va ko ton tai khoang trang
		if(email!=null && email.contains("@") && !email.contains(" ")) {
			this.email = email;
			return true;
		}else {
			System.err.println("Please enter the eligible email: ");
			return false;
		}
		
	}
	public boolean checkScholarship() {
		return mark>=8;
	}
	
	

}
