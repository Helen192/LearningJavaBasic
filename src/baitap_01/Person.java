package baitap_01;
import java.util.*;
public class Person {
	String name;
	String gender;
	String birthday;
	String address;
	
	
	public Person() {
		
	}
	public Person(String name, String gender, String birthday, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		name = sc.nextLine();
		
		System.out.println("Gender: ");
		gender = sc.nextLine();
		
		System.out.println("Birthday: ");
		birthday = sc.nextLine();
		
		System.out.println("Address: ");
		address = sc.nextLine();
	}
	public void showInfo() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "Name: " +getName() +"; " +"Gender: "+getGender()+"; "+"Birthday: "+getBirthday()+"; "+"Address: "+getAddress() ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
