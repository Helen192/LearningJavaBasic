package lesson7.exceptions;
import java.util.*;
public class baiTapExceptions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter x: ");
		int x = sc.nextInt();
		System.out.print("Please enter y: ");
		int y = sc.nextInt();
		try {      // noi dung phan can bat loi
			int result = x/y;
			System.out.println(x +" : " + y +" = " + result);
			
		} catch(Exception e){     // khi loi sai ra thi chuong trinh se lam gi
			e.printStackTrace();
		} finally {     // finally ap dung khi muon giai phong tai nguyen, huy ket noi. Con neu ko can thi co the bo finally
			System.out.println("Finish.");
		}
		
		System.out.println("========== Tinh va bat loi voi Exception tu tao==========");
		try {
			int result = Calculator.devide(x, y);
			System.out.println(x +" : " + y +" = " + result);
		} catch(CalculatorException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
