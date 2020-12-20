package baitap_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		int choose;
		Scanner scan = new Scanner(System.in);
		do {
			showMenu();
			System.out.print("Choose: ");
			choose = Integer.parseInt(scan.nextLine());
			switch (choose) {
			case 1:
				System.out.print("Entering the quantity of student you want to add in the list: ");
				int n = Integer.parseInt(scan.nextLine());
				for(int i=0; i<n; i++) {
					Student std = new Student();  // taoj 1 object kieu Student
					std.inputInfo();              // nhap thong tin student vao object kieu Student
					
					studentList.add(std);      // adding student in the list
				}
				break;
			case 2:
				for(int i=0; i<studentList.size();i++) {
					studentList.get(i).showInfo();
				}
				break;
			case 3:
				int minIndex = 0, maxIndex = 0;
				float minMark, maxMark;
				minMark = studentList.get(minIndex).getMark();
				maxMark = studentList.get(maxIndex).getMark();
				
				for(int i=1; i<studentList.size();i++) {
					float value = studentList.get(i).getMark();
					if(minMark > value) {
						minIndex = i;
						minMark = value; 
					}
					if(maxMark < value) {
						maxIndex = i;
						maxMark = value;
					}
				}
				System.out.println("Student achieved the highest mark: ");
				studentList.get(maxIndex).showInfo();
				System.out.println("Student achieved the lowest mark: ");
				studentList.get(minIndex).showInfo();
				break;
			case 4:
				System.out.print("Please enter the ID of student you want to search: ");
				String rollNoSearch = scan.nextLine();
				
				int count = 0; // neu count>0 tuc la co svien can tim trong list
				for(Student std : studentList) {
					if(std.getRollNo().equalsIgnoreCase(rollNoSearch)) {
						std.showInfo();
						count++;
					}
				}
				if(count==0) {
					System.out.println("No student with this ID is found");
				}
				break;
			case 5:
				//B1: sap xep sinh vien theo ten tu A->Z
				Collections.sort(studentList, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						int cmp = o1.getName().compareTo(o2.getName());  // so sanh ten cua 2 student o1 va o2
						if(cmp >=0) {   // neu ten cua svien o1 trung or dung truoc ten cua svien 02 thi ko can hoans doi
							return 1;  // cmp =1 tuc la can doi laij
						}else {
							return -1;  // cmp = -1 tuc la khong can doi lai
						}
					}
				});
				
				// B2: hien thi thong tin cua tat ca svien
				for(int i=0; i<studentList.size(); i++) {
					studentList.get(i).showInfo();
				}
				break;
			case 6:
				// B1: sap xem sinh vien theo thu tu diem tu cao xuong thap
				Collections.sort(studentList, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getMark() >= o2.getMark() ? -1 : 1;  // tuc neu diem cua o1 >= diem cua o2 thi la -1(ko can doi), nguocj lai thi la 1(phai doi lai cho nhau)
					};
				});
				
				// B2: hien thi tat ca svien duoc hoc bong
				for(int i=0; i<studentList.size();i++) {
					if(studentList.get(i).checkScholarship()) {
						studentList.get(i).showInfo();
					}
				}
				break;
			case 7:
				System.out.println("Goodbye!");
				break;
			default:
				System.err.println("Error at input.");
				break;
			}
			
		} while (choose!=7);
		
	}
	
	public static void showMenu() {
		System.out.println("1. Adding N students in the list");
		System.out.println("2. Showing information of all students");
		System.out.println("3. Showing students having the highest and lowest mark");
		System.out.println("4. Finding student following their ID");
		System.out.println("5. Sorting students following their names order in alphabet");
		System.out.println("6. Showing students who achive a scholarship and their marks in a decreasing order");
		System.out.println("7. Exit");
	}

}
