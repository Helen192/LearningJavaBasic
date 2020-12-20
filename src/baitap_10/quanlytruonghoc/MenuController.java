package baitap_10.quanlytruonghoc;
import java.util.List;
import java.util.Scanner;

public class MenuController {                          // kieu Singleton design pattern
	private static MenuController instance = null;
	
	private MenuController() {
		
	}
	
	public synchronized static MenuController getInstance() {
		if(instance == null) {
			instance = new MenuController();
		}
		return instance;
	}
	
	public void showMenu() {
		System.out.println("1. Add teacher");
		System.out.println("2. Add student");
		System.out.println("3. Add subject");
		System.out.println("4. Add class room");
		System.out.println("5. Add class group");
		System.out.println("6. Add schedule");
		System.out.println("7. Add attendence of one student on a certain day");
		System.out.println("8. Exit");
		System.out.println("Choose: ");
	}
	
	public void inputTeacher() {
		for(;;) {
			Teacher teacher = new Teacher();
			teacher.input();                                   // enter input into object teacher
			
			DataMgr.getInstance().getTeachers().add(teacher);   // luu object teacher vao ArrayList cua teachers
			
			if(!hasNext()) {        // nguoi dung khong muon tiep tuc nhap them thong tin( nguoi dung nhap vao la "n")
				break;
			}
		}
	}
	
	public void inputStudent() {
		for(;;) {
			Student student = new Student();
			student.input();
			
			DataMgr.getInstance().getStudents().add(student);
			
			if(!hasNext()) {
				break;
			}
		}
	}
	
	public void inputSubject() {
		for(;;) {
			Subject subject = new Subject();
			subject.input(); 
			
			DataMgr.getInstance().getSubjects().add(subject);
			
			if(!hasNext()) {
				break;
			}
		}
	}
	
	public void inputClassRoom() {
		for(;;) {
			ClassRoom classRoom = new ClassRoom();
			classRoom.input();
			
			DataMgr.getInstance().getClassRooms().add(classRoom);
			if(!hasNext()) {
				break;
			}
		}
	}
	
	public void inputClassGroup() {
		for(;;) {
			ClassGroup classGroup = new ClassGroup();
			classGroup.input();
			
			DataMgr.getInstance().getClassGroups().add(classGroup);
			if(!hasNext()) {
				break;
			}
		}
	}
	
	public void inputSchedule() {
		for(;;) {
			Schedule schedule = new Schedule();
			schedule.input();
			
			DataMgr.getInstance().getSchedules().add(schedule);
			if(!hasNext()) {
				break;
			}
		}
	}
	
	public void inputAttendence() {
		for(;;) {
			Attendence attendence = new Attendence();
			attendence.input();
			
			DataMgr.getInstance().getAttendence().add(attendence);
			if(!hasNext()) {
				break;
			}
		}
	}
	
	public boolean hasNext() {                   // dung de hoi nguoi nhap xem co muon continue khong. Vi cai nay dc lap lai nhieu lan, neen tao ra 1 method de tai su dung
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to continue(Y/N)?: ");
		String choose = input.nextLine();
		if(choose.equalsIgnoreCase("n")) {
			return false;
		}
		return true;
	}
	
	public boolean checkExit(List<?> KeyList, String keyValue) {
		for (Object key : KeyList) {
			if(key instanceof IKey) {
				if(((IKey) key).getKeyValue().equalsIgnoreCase(keyValue)){
					return true;
				}
			}
		}
		return false;
	}

}



