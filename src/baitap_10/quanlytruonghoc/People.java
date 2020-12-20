package baitap_10.quanlytruonghoc;
import java.util.Scanner;

public class People {
	String fullname, gender, address, birthday;
	
	public People() {
	}
	
	

	public People(String fullname, String gender, String address, String birthday) {
		this.fullname = fullname;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name: ");
		fullname = input.nextLine();
		
		System.out.println("Gender: ");
		gender = input.nextLine();
		
		System.out.println("Address: ");
		address = input.nextLine();
		
		System.out.println("Birthday (dd/mm/yyyy): ");
		birthday = input.nextLine();
	}


	@Override
	public String toString() {
		return "fullname=" + fullname + ", gender=" + gender + ", address=" + address + ", birthday=" + birthday;
			
	}



	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	

}
