package baitap_11.quanlybeboi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ticket {
	static List<Character> cList = new ArrayList<>();   // cList contains all Characters of a-zA-Z0-9
	static List<Integer> indexList = new ArrayList<>();  // this is to manage all index of a ticket's code ( 1 code gom 6 ky tu)
	
	String code;             // code will created automatically (sinh tu dong gom cac ky tu a-zA-Z0-9 co do dai la 6 ky tu 
	Date registeredDate;
	
	public Ticket() {
	}

	public String getCode() {
		return code;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}
	
	// registeredDate sinh tu dong theo gio he thong
//	public void autoSetRegisteredDate() {
//		SimpleDateFormat format = new SimpleDateFormat("H:mm:ss dd/MM/yyyy");
//		Date date = new Date();
//		registeredDate = format.format(date); // truong hop nay thi registeredDate phai o dang "String"
//	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	
	
	public void show() {
		System.out.println(registeredDate);
	}
	
	public void autoGenerateCode() {      // generate automatically a ticket's code as requirement
		// add all characters a-zA-Z0-9 into cList
		autoGenerateCharacter();
		
		//below code is to generate a ticket's code automatically
		code ="";
		for(int i=0; i<indexList.size(); i++) {
			code += String.valueOf(cList.get(indexList.get(i)));
		}
		int lastIndex = indexList.size()-1;
		indexList.set(lastIndex, indexList.get(lastIndex) + 1);  // tang gia tri cua element o vtri cuoi trong indexList len 1 don vi
		
		for(int i= indexList.size()-1; i>0; i--) {
			if(indexList.get(i) < cList.size()) {  // tuc la gia tri cua cac elements trong indexList van chua vuot qua vi tri index cuoi cung trong cList
				break;
			}
			indexList.set(i, 0);   // thiet lap lai gia tri element cua indexList o vtri i  la ve bang 0. Nhu vayj thi sau lay character trong cList ra se la bang 'a'
			indexList.set(i-1, indexList.get(i-1) +1);  // tuc indexList[i-1] = gia tri cu o vi tri (i-1) + 1.
		}
		
		
	}
	
	private static void autoGenerateCharacter() {
		if(cList.size() >0 ) return;           // if cList has already been generated, then we need only return cList, otherwise we do as below:
		
		// Khoi tao mang du lieu cList
		for(int i= (int)'a'; i<= (int)'z';i++) {    // save all character from a to z into the cList
			cList.add((char) i);
		}
//		for(int i=(int)'A'; i<= (int)'Z';i++) {     // save all character from A to Z into the cList
//			cList.add((char) i);
//		}
		for(int i=(int)'0'; i<= (int)'9';i++) {     // save all character from 0 to 9 into the cList
				cList.add((char) i);
		}
		
		// save index tai thoi diem tiep theo se dc gender
		for(int i=0; i<6; i++) {   // vi code co do dai 6 ky tu, nen la doan nay co nghia la tao ra indexList voi size =6, va cac elements cua indexList deu = 0
			indexList.add(0);
		}
	}
	
	// chuyen doi thoi gian nhap vao kieu String ve kieu Date
	public Date convertStringToDate(String str) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return format.parse(str);
		} catch (ParseException e) {
			Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE,null, e);  // can tim hieu ve Logger
//			e.printStackTrace();
		}
		return new Date();
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		autoGenerateCode();   // generate automatically a ticket's code
		
		System.out.println("Registered date (dd/mm/yyyy): ");
		String registeredDateStr = input.nextLine();
		//convert type String (registeredDateStr) into type of Date
		registeredDate = convertStringToDate(registeredDateStr);
		
	}
	

}
