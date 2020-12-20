package project01;
import java.util.*;

public class multiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Multiplication table: ");
		int number = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.printf("%d x %d = %d %n", number, i, number*i);
		}
	}
	

}
