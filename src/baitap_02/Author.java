package baitap_02;
import java.util.*;
public class Author {
	
	private String name;
	private int old;
	private String nickname;
	private String birthday;
	private String address;
	
	//default constructor
	public Author() {
	}

	
	public Author(String nickname) {    // constructor chi de nhap moi nickname. de tranh viec nhap lai nickname nhieu lan
		this.nickname = nickname;
	}


	public Author(String name, int old, String nickname, String birthday, String address) {
		this.name = name;
		this.old = old;
		this.nickname = nickname;
		this.birthday = birthday;
		this.address = address;
	}
	//Note: Moi tac gia chi co 1 nickname va khong duoc trung nhau. Neu nhap vao nickname da co trong AuthorList roi thi phai nhap lai
	public void input(ArrayList<Author> authorList) {             // chuyen vao 1 parameter la 1 cai authorList da co san de kiem tra xem cai nickname muon nhap them vao co bi trung  o trong authorList khong
		input();   // cai input() nay la khong co phan nhap nickname
		Scanner input = new Scanner(System.in);
		System.out.println("Nickname: ");
		// cachs 1:
//		while(true) {
//			nickname = input.nextLine();
//			boolean isFind = false;
//			for(int i=0; i<authorList.size();i++) {
//				if(authorList.get(i).getNickname().equalsIgnoreCase(nickname)) {
//					isFind = true;
//                  break;
//				}
//			}
//			if(!isFind) {  // tuc la nickname can them vao ko bi trung trong authorList
//				break;
//			}else {
//				System.err.println("This nickname is already in the list. Please enter another nickname: ");
//			}
//		}
		// Cach 2: tu lam
		boolean isFind = false;
		do {
			nickname = input.nextLine();
			for(int i=0; i<authorList.size();i++) {
				if(authorList.get(i).getNickname().equalsIgnoreCase(nickname)) {
					System.err.println("This nickname is already in the list. Please enter another nickname: ");
					isFind = true;
					break;
				} else {isFind = false;}
			}
			
		} while (isFind);  // tu neu isFind =true, thi no se van lap lai vong do-while
		
	}
	
	// input nay ko can nhap nickname nua, vi da nhap nickname o trong bookList roi. 
	public void input() {             
		Scanner input = new Scanner(System.in);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Name: ");
		name = input.nextLine();
		
		System.out.println("Age: ");
		old = Integer.parseInt(input.nextLine());
		
		System.out.println("Birthday: ");
		birthday = input.nextLine();
		
		System.out.println("Address: ");
		address = input.nextLine();
	}

	public void display() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Author [name=" + name + ", old=" + old + ", nickname=" + nickname + ", birthday=" + birthday
				+ ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public int getOld() {
		return old;
	}

	public String getNickname() {
		return nickname;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getAddress() {
		return address;
	}
	
	
	
	
	

}
