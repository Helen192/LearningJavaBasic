package lesson7.exceptions;
/*
 * tu tao exception reing cho 1 class 
 */
public class CalculatorException extends Exception {
	int x,y;
	
	public CalculatorException(String message, int x, int y) {
		super(message);
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String getMessage() {
		return "x = " +x +", y = " +y + ", " + super.getMessage();
		
	}

}
