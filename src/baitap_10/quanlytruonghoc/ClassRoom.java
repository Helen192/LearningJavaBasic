package baitap_10.quanlytruonghoc;
import java.util.Scanner;

public class ClassRoom {
	String className, classCode;
	
	public ClassRoom() {
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		 System.out.println("Name of class: ");
		 className = input.nextLine();
		 
		 System.out.println("Code of class: ");
		 classCode = input.nextLine();
	}
	

	@Override
	public String toString() {
		return "ClassRoom [className=" + className + ", classCode=" + classCode + "]";
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	
}
