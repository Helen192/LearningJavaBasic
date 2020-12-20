package baitap03.cat.exam;
import java.util.Scanner;

import baitap03.manager.cat.ColorManager;

public class CatDetail implements ICat {
	String type;
	String color;
	int idColor;
	String address;

	
	public CatDetail() {
	}

	public CatDetail(String type, String color,int idColor, String address) {
		this.type = type;
		this.color = color;
		this.idColor = idColor;
		this.address = address;
	}

	@Override
	public void input() {
		System.out.println("--------------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.println("Type of cat: ");
		type = input.nextLine();
		
		System.out.println("Address: ");
		address = input.nextLine();
	}
	
	public void input(ColorManager colorManager) {
		input();
		Scanner input = new Scanner(System.in);
		System.out.println("Color of cat: ");
		
		//Kiem tra xem mau color da co trong colorList chua. neu chua thi add vao, con co roi thif thoi
		while(true) {
			color = input.nextLine();
			idColor = colorManager.checkColor(color);
			if(idColor!=-1) {
				break;
			}else {
				colorManager.display();
				System.err.println("Only colors in the list is acceptable. Please try again: ");
			}
		}
	}


	@Override
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "CatDetail [name="+ name+ ", type=" + type + ", color=" + color +", color's ID=" +idColor+ ", address=" + address + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIdColor() {
		return idColor;
	}

	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}
	
	
	

}
