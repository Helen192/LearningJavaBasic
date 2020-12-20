package baitap_05;
import java.util.Scanner;

public class People {
	String id;
	String fullname;
	int old;
	
	public People() {
	}
	
	public People(String id, String fullname, int old) {
		this.id = id;
		this.fullname = fullname;
		this.old = old;
	}
	
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Adding ID: ");
		id = input.nextLine();
		
		System.out.println("Adding fullname: ");
		fullname = input.nextLine();
		
		System.out.println("Adding age: ");
		old = Integer.parseInt(input.nextLine());
	}
	
	public void showInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", fullname=" + fullname + ", old=" + old + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}
	
	
	

}
