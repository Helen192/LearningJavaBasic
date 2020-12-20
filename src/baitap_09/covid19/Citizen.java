package baitap_09.covid19;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Citizen {
	static enum STATUS {           
		NORMAL, FOLLOW, ACTIVE
	};
	
	String name, id, gender, address, tmpaddress;
	int age;
	STATUS status;
	List<String> path;        // lich trinh di chuyen cua 1 nguoi
	
	public Citizen() {               // vi khi nhap thong tin tung nguoi, thi ban dau status la normal va lich trinh di chuyen la leer
		status = STATUS.NORMAL;
		path = new ArrayList<>();
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name: ");
		name = input.nextLine();
		
		System.out.println("ID (CMTND): ");
		id = input.nextLine();
		
		System.out.println("Gender: ");
		gender = input.nextLine();
		
		System.out.println("Address: ");
		address = input.nextLine();
		
		System.out.println("Temporary address: ");
		tmpaddress = input.nextLine();
		
		System.out.println("Age: ");
		age = Integer.parseInt(input.nextLine());
		System.out.println("");
		
	}
	
	public void inputPath() {       // update moving paths of patients
		Scanner input = new Scanner(System.in);
		String addPath;
		for(;;) {    // day la loop vo hanj. neu muon dung lai thif phai dung lenh break
			System.out.println("Enter address: ");
			addPath = input.nextLine();
			
			if(!path.contains(addPath)) {    // checking, whether addPath is already in the list or not.  
				path.add(addPath);
			}
			
			System.out.println(" Do you want to continue to add or not (y/n) : ");
			addPath = input.nextLine();
			if(addPath.equalsIgnoreCase("n")) {
				break;              // neu nguoi dung ko muon nhap tiep, thi break khoi vong lap for
			}
		}
	}
	public void inputStatus() {
		Scanner input = new Scanner(System.in);
		System.out.println("------------- Health's status ----------");
		System.out.println("1. NORMAL");
		System.out.println("2. FOLLOW");
		System.out.println("3. ACTIVE");
		System.out.println("Choose (1 or 2 or 3: ");
		int choose = Integer.parseInt(input.nextLine());
		
		switch (choose) {
		case 1:
			status = STATUS.NORMAL;
			break;
		case 2:
			status = STATUS.FOLLOW;
			break;
		default:
			status = STATUS.ACTIVE;
			break;
		}
	}
	
	
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", id=" + id + ", gender=" + gender 
				+ ", address=" + address + ", tmpaddress="
				+ tmpaddress + ", age=" + age 
				+", status=" +getStringStatus()+ "]";
	}
	
	public String getStringStatus() {        
		switch (status) {
		case NORMAL:
			return "Normal";
		case FOLLOW:
			return "Follow";
		default:
			return "Active";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTmpaddress() {
		return tmpaddress;
	}

	public void setTmpaddress(String tmpaddress) {
		this.tmpaddress = tmpaddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public List<String> getPath() {
		return path;
	}

	public void setPath(List<String> path) {
		this.path = path;
	}
	
	

}
