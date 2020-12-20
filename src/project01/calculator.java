package project01;
import java.util.*;
public class calculator {
	public static void main(String[] args) {
		int numberFirst;
		int numberSecond;
		String calculate;
		Scanner sc = new Scanner(System.in);
		System.out.print("Number first: ");
		numberFirst = sc.nextInt();
		System.out.print("Number second: ");
		numberSecond = sc.nextInt();
		System.out.print("Caculating operation: ");
		calculate = sc.next();
		switch (calculate) {
		case "+":
			System.out.printf("%d + %d = %d %n", numberFirst, numberSecond, numberFirst+numberSecond);
			break;
		case "-":
			System.out.printf("%d - %d = %d %n", numberFirst, numberSecond, numberFirst-numberSecond);
			break;
		case "*":
		case "x":
		case "X":
			System.out.printf("%d * %d = %d %n", numberFirst, numberSecond, numberFirst*numberSecond);
			break;
		case ":":
		case "/":
			System.out.printf("%d : %d = %d %n", numberFirst, numberSecond, numberFirst/numberSecond);
			break;
		default:
			System.out.println("Error: wrong operation");
			break;
		}
	}

}
