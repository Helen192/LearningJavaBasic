package project02;
import java.util.*;
/*
 * nhap danh sach svien vao tu ban phim va in ra
 */
public class student extends person {
	private double score;
	
	public student() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("Score \t\t: ");
		score = sc.nextDouble();
	}
	
	public student(String aname, String abirthDay, String ahomeTown, String aposition, String acode, double ascore) {
		super(aname, abirthDay, ahomeTown, aposition, acode);
		score = ascore;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public void studentInfo() {
		shownInfo();
		System.out.println("Score \t\t: " + getScore());
	}
	

}
