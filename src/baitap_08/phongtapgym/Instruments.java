package baitap_08.phongtapgym;
import java.util.Scanner;

public class Instruments implements IInputOutput {
	enum STATUS {
		NEW, OLD
	}
	
	enum TYPE {
		BUY, BORROW
	}
	
	String name;
	float weight, width, height, length;
	STATUS status;
	TYPE type;
	
	public Instruments() {
	}

	@Override
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name: ");
		name = input.nextLine();
		
		System.out.println("Weight: ");
		weight = Float.parseFloat(input.nextLine());
		
		System.out.println("Width: ");
		width = Float.parseFloat(input.nextLine());
		
		System.out.println("Height: ");
		height = Float.parseFloat(input.nextLine());
		
		System.out.println("Length: ");
		length = Float.parseFloat(input.nextLine());
		
		String choose;
		// enter a status of instrument. This process will be repeated until user enter the right input
		do {
			System.out.println("Status of instrument (new/old): ");
			choose = input.nextLine();
		} while (!(choose.equalsIgnoreCase("new") || choose.equalsIgnoreCase("old")));
		if(choose.equalsIgnoreCase("new")) {
			status = STATUS.NEW;
		}else {
			status = STATUS.OLD;
		}
		
		// enter a type of instrument. This process will be repeated until user enter the right input
		do {
		System.out.println("Type of instrument (buy/borrow): ");
		choose = input.nextLine();
		} while (!(choose.equalsIgnoreCase("buy") || choose.equalsIgnoreCase("borrow")));
		if(choose.equalsIgnoreCase("buy")) {
			type = TYPE.BUY;
		}else {
			type = TYPE.BORROW;
		}
		
	}

	@Override
	public void display() {
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "Instruments [name=" + name + ", weight=" + weight + ", width=" + width + ", height=" + height
				+ ", length=" + length + ", status=" + getStatusString() + ", type=" + getTypeString() + "]";
	}
	
	// Viet lai cach hien thi cua enum STATUS. vi neu ko, thi cach hien thi cua no se la chu in hoa
	public String getStatusString() {
		if(status == STATUS.NEW) {
			return "new";
		}
		return "old";
		
	}
	public String getTypeString() {
		if(type == TYPE.BUY) {
			return "buy";
		}
		return "borrow";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}
	
	

}
