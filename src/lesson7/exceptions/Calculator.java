package lesson7.exceptions;

public class Calculator {
	public static int devide(int x, int y) throws CalculatorException {
		if(y==0) {  // tuc khi y=0 thi no se tao ra 1 cai exception thong bao cho nguoi dung
			// tra ve 1 crash => thong bao cho lap trinh vien khac hieu
			throw new CalculatorException("Devide by zero",x,y);
		}else {
			return x/y;
		}
		
	}
	

}
