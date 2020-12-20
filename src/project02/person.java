package project02;
import java.util.*;
/*
 * nhap danh sach nguoi vao tu ban phim va in ra
 */
public class person {
	private String name;
	private String birthDay;
	private String homeTown;
	private String position;
	private String code;
	
	public person() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter information as below: ");
		System.out.print("Name \t\t: ");
		name = sc.nextLine();
		System.out.print("Birthday \t: ");
		birthDay = sc.nextLine();
		System.out.print("Hometown \t: ");
		homeTown = sc.nextLine();
		System.out.print("Position \t: ");
		position = sc.nextLine();
		System.out.print("Code \t\t: ");
		code = sc.nextLine();
		
	}
	
	public person(String aname, String abirthDay, String ahomeTown, String aposition, String acode) {
		name = aname;
		birthDay = abirthDay;
		homeTown = ahomeTown;
		position = aposition;
		code = acode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public void shownInfo() {
		System.out.println("Name \t\t: " + getName());
		System.out.println("Birthday \t: " + getBirthDay());
		System.out.println("Hometown \t: " + getHomeTown());
	}
	

}
