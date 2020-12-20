package project02;
import java.util.*;

/*
 * Quan ly danh sach sinh vien, voi cac lua chon nhiem vu khac nhau: nhap them sinh vien, xoa sv,tra diem sv,
 */
public class studentManagement {
	static ArrayList<student> object = new ArrayList<student>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu();
		String activity;
		String nextActivity;
		do {
			System.out.print("Please enter the code of activity: ");
			activity = sc.next();
			switch (activity) {
			case "1": 
				addingInfo();
				break;
			case "2":
				changingInfo();
				break;
			case "3":
				changingScoreAll();
				break;
			case "4":
				changingScoreOne();
				break;
			case "5":
				deletingStudent();
				break;
			case "6":	
				System.out.println("---------------- END PROGRAMM -----------------");
				break;
			default:
				System.out.println("You entered unsuitable information. Please try again.");
				break;
			}
			System.out.print("Do you want to continue( yes/no): ");
			nextActivity = sc.next();
			// if users don't enter yes or no, then program will ask them to enter the input again until it's correct.
			while(!nextActivity.equalsIgnoreCase("yes") && !nextActivity.equalsIgnoreCase("no")) {
				System.out.print("suitable answer is only yes or no. Please try again: ");
				nextActivity = sc.next();
			}
		}while(nextActivity.equalsIgnoreCase("yes"));	
	}
	
	public static void menu() {
		System.out.println("--------------------- STUDENTS MANAGEMENT -------------------");
		System.out.println("1. Adding a student's info");
		System.out.println("2. Changing student's info");
		System.out.println("3. Changing score of all students");
		System.out.println("4. Changing score of one student or more");
		System.out.println("5. Deleting a student from the list");
		System.out.println("6. Exit");
		System.out.println("------------------------------------------------------------------");
		
	}
	
	public static void addingInfo() {
		student addedStudent = new student();
		object.add(addedStudent);
	}
	public static void changingInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Finding (name/birthday/code): ");
		String findingInfo = sc.nextLine();
		// seek for student and then change information
		int count =0;
		for(int i=0; i<object.size(); i++) {
			if(object.get(i).getName().equalsIgnoreCase(findingInfo) || 
			    object.get(i).getBirthDay().equalsIgnoreCase(findingInfo) ||
			      object.get(i).getCode().equalsIgnoreCase(findingInfo)) {
				count +=1; // rising count, when a student is found
				// show information of the student
				object.get(i).studentInfo();
				System.out.print("Is the person who you're looking  for (yes/no)?: ");
				String looking = sc.next();
				if(looking.equalsIgnoreCase("yes")) {
					object.remove(i);
					object.set(i,new student());
				}
			}
		}
		if(count==0) {
			System.out.println("----> No matching information");
		}
	}
	
	// update score of all students
	public static void changingScoreAll() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<object.size();i++) {
			object.get(i).studentInfo();
			System.out.println("-------------------------------------------------");
			System.out.print("Updating score : ");
			double updateScore = sc.nextDouble();
			object.get(i).setScore(updateScore);
			
		}
	}
	// update score of some students
	public static void changingScoreOne() {
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.print("Finding (name/birthday/code): ");
			String findInfo = sc.nextLine();
			for(int i=0; i<object.size();i++) {
				if(object.get(i).getName().equalsIgnoreCase(findInfo) ||
						object.get(i).getBirthDay().equalsIgnoreCase(findInfo) ||
						object.get(i).getCode().equalsIgnoreCase(findInfo)) {
					object.get(i).studentInfo();
					System.out.println("--------------------------------------------");
					System.out.print("Updating score: ");
					double updatingScore = sc.nextDouble();
					object.get(i).setScore(updatingScore);
					break;
				}
			}
			System.out.print("Do you want to continue (yes/no)?: ");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
	}
	
	public static void deletingStudent() {
		Scanner sc = new Scanner(System.in);
		String findingInfo;
		do {
			System.out.print("Finding (name/birthday/code): ");
			findingInfo = sc.nextLine();
			for(int  i=0; i<object.size();i++) {
				if(object.get(i).getName().equalsIgnoreCase(findingInfo) ||
						object.get(i).getBirthDay().equalsIgnoreCase(findingInfo) ||
						object.get(i).getCode().equalsIgnoreCase(findingInfo)) {
					object.get(i).studentInfo();
					System.out.println("---------------------------------------------------------");
					System.out.print("Are you sure to delete this student (yes/no)?: ");
					String choice = sc.next();
					if(choice.equalsIgnoreCase("yes")) {
						object.remove(i);
						System.out.println("------ The process is completed -------");
						break;
					}
					else {break;}
				}
			}
			System.out.print("Do you want to continue (yes/no)?: ");
			findingInfo = sc.next();
		}while(findingInfo.equalsIgnoreCase("yes"));
	
	}
		
	

}
