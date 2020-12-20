package baitap_02;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<Author> authorList = new ArrayList<>(); // quan ly danh sach cac tac gia
		ArrayList<Book> bookList = new ArrayList<>(); // quan ly danh sach cac cuon sach
		Scanner input = new Scanner(System.in);
		int choose, n;  // n la so luongj sach/tac gia muon nhap them vao
		do {
			showMenu();
			choose = Integer.parseInt(input.nextLine());
			switch (choose) {
			case 1:
				System.out.println("Number of books you want to add into the book list: ");
				n = Integer.parseInt(input.nextLine());
				for(int i=0; i<n; i++) {
					Book book = new Book();  // tao objeck Book
					book.input();            // nhap noi dung cua book 
					
					// add book vao trong bookList. nhung chu ys la: neu nhap toi nickname, ma cai nickname nay chua co trong authorList thi se hien ra muc add them author
					boolean isFind = false;  // bien nay kiem tra xe da co nickname can them trong authorList chua
					for(int j=0; j<authorList.size(); j++) {
						if(authorList.get(j).getNickname().equalsIgnoreCase(book.getNickname())) {
							isFind = true;
							break;
						}
					}
					if(!isFind) {  // tuc la isFind chua duoc tim thay. Vay thi se phai hienj ra muc de them tac gia vao authorList
						System.out.println("This author wasn't saved. Please add information in the author list as following:");
						Author author = new Author(book.getNickname()); // vi nickname da dc nhap trong phan book.input() o tren roi. nen la su dung cai constructor nay
						author.input();  // dung method input() nay vi khong can nhap them nickname vao
						
						// luu thong tin tac gia vao authorList
						authorList.add(author);
					}
					// luu book vao bookList
					bookList.add(book);
				}
				break;
			case 2:
				for(Book book: bookList) {
					book.display();
				}
				break;
			case 3:
				// nhap thong tin tac gia
				System.out.println("Number of authors you want to add into the author list: ");
				n = Integer.parseInt(input.nextLine());
				
				for(int i=0; i<n; i++) {
					Author author = new Author();
					author.input(authorList);          // Note: Moi tac gia co 1 nickname duy nhat, neu nhap vao nickname da co trong authoList roi thi yeu cau nhap lai
					
					// luu tac gia vao authoList
					authorList.add(author);
				}
				break;
			case 4:
				System.out.println("Please enter nickname of author you want to search: ");
				String nickname = input.nextLine();
				// tim kiem tat ca cac sach cua nickname vua nhap roi hien thi ra man hinh
				for(int i=0;i<bookList.size();i++) {
					if(bookList.get(i).getNickname().equalsIgnoreCase(nickname)) {
						bookList.get(i).display();
					}
				}
				break;
			case 5:
				System.out.println("Goodbye!");
				break;

			default:
				System.err.println("wrong input!");
				break;
			}
			
		} while (choose !=5);
		
		
	}
	
	static void showMenu() {
		System.out.println("1. Entering book's information");
		System.out.println("2. Showing all book's on the screen");
		System.out.println("3. Entering author's information of book");
		System.out.println("4. Searching book based on nickname of the author");
		System.out.println("5. Exit");
	}

}
