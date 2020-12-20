package baitap_02;
import java.util.*;
public class Book {
	private String bookname;  // ten sach
	private String issuedate;  // ngay xuat ban
	private String nickname;  // but danh
	
	// default constructor
	public Book() {
	}

	public Book(String bookname, String issuedate, String nickname) {
		this.bookname = bookname;
		this.issuedate = issuedate;
		this.nickname = nickname;
	}
	
	public void input() {
		System.out.println("==========================================================");
		Scanner input = new Scanner(System.in);
		System.out.println("Book's name: ");
		bookname = input.nextLine();
		
		System.out.println("Date of issue: ");
		issuedate = input.nextLine();
		
		System.out.println("Author's nickname: ");
		nickname = input.nextLine();
	}
	
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "book [bookname=" + bookname + ", issuedate=" + issuedate + ", nickname=" + nickname + "]";
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublisher() {
		return issuedate;
	}

	public void setPublisher(String publisher) {
		this.issuedate = publisher;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	
	

}
