package lessonn6.string.arraylist;
/*
 * nhap tu ban phim 1 chuoi va luu vao bien: sourceStr
 * nhap tu ban phim 1 chuoi tiep theo va luu vao bien: searchingStr
 * Yeu cau: Tim kiem so lan xuat hien chuoi searchingStr trong chuoi sourceStr va in ra 
 * vi tri xuat hien cua chuoi do trong sourceStr
 */

import java.util.Scanner;

public class baiTapString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the source String: ");
		String sourceStr = sc.nextLine();
		System.out.println(sourceStr);
		
		System.out.print("Please enter the String that you want to search in the source String: ");
		String searchingStr = sc.nextLine();
		System.out.println(searchingStr);
		
		int count = 0;
		for(int i=0; i<sourceStr.length();) {  // khong thiet lap de i++
			int index = sourceStr.indexOf(searchingStr, i);  // indexOf se tra ve -1 neu searchingStr ko nam trong sourceStr
			if(index>=0) {
				count ++;
				i = index +1;
				System.out.println("Index: " + index);
			}
			else {break;}
		}
		System.out.println("Count: " +count);
		
		
		
	}
	

}
