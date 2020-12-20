package project01;
import java.text.DecimalFormat;
import java.util.*;
/*
 * nhap vao mot so tien chia het cho 10000VND. 
 * Sau do in ra so luong to tien 500000VND, 200000VND, 100000VND, 50000VND, 20000VND, 10000VND
 */
public class atmMachine {
	public static void main(String[] args) {
		int money;
		// bien so luong dong tien 
		int fiveHundredThousand;
		int twoHundredThousand;
		int oneHundredThousand;
		int fiftyThousand;
		int twentyThousand;
		int tenThousand;
		
		// bien menh gia
		final int Five_Hundred_Thousand = 500000;
		final int Two_Hundred_Thousand = 200000;
		final int One_Hundred_Thousand = 100000;
		final int Fifty_Thousand = 50000;
		final int Twenty_Thousand = 20000;
		final int Ten_Thousand = 10000;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("your money: ");
			money = sc.nextInt();
		} while (money % 10000 !=0);
		System.out.println("-----------------------------------");
		
		// Bieu thi mot so o dang hang nghin (co dau phay tach giua phan nghin)
		DecimalFormat formatter = new DecimalFormat("#,###");
		
		if(money >= Five_Hundred_Thousand) {
			fiveHundredThousand = money / Five_Hundred_Thousand;
			money = money % Five_Hundred_Thousand;
			System.out.printf("%sVND \t: %d%n", formatter.format(Five_Hundred_Thousand), fiveHundredThousand);
		}
		if(money >= Two_Hundred_Thousand) {
			twoHundredThousand = money / Two_Hundred_Thousand;
			money = money % Two_Hundred_Thousand;
			System.out.printf("%sVND \t: %d%n", formatter.format(Two_Hundred_Thousand), twoHundredThousand);
		}
		if(money >= One_Hundred_Thousand) {
			oneHundredThousand = money / One_Hundred_Thousand;
			money = money % One_Hundred_Thousand;
			System.out.printf("%sVND \t: %d%n", formatter.format(One_Hundred_Thousand), oneHundredThousand);
		}
		if(money >= Fifty_Thousand) {
			fiftyThousand = money / Fifty_Thousand;
			money = money % Fifty_Thousand;
			System.out.printf("%sVND \t: %d%n", formatter.format(Fifty_Thousand), fiftyThousand);
		}
		if(money >= Twenty_Thousand) {
			twentyThousand = money / Twenty_Thousand;
			money = money % Twenty_Thousand;
			System.out.printf("%sVND \t: %d%n", formatter.format(Twenty_Thousand), twentyThousand);
		}
		if(money >= Ten_Thousand) {
			tenThousand = money / Ten_Thousand;
			money = money % Ten_Thousand;
			System.out.printf("%sVND \t: %d%n", formatter.format(Ten_Thousand), tenThousand);
		}
		
		
	}
	

}
