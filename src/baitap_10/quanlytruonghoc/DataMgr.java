package baitap_10.quanlytruonghoc;

import java.util.ArrayList;
import java.util.List;

public class DataMgr {                               // kieu Singleton design pattern
	private static DataMgr instance = null;          // object instance dung chung
	
	List<Student> students;                         // Attribute
	List<Teacher> teachers;                        // Attribute
	List<Subject> subjects;							// Attribute
	List<ClassRoom> classRooms;						// Attribute
	List<ClassGroup> classGroups;					// Attribute
	List<Schedule> schedules ;						// Attribute
	List<Attendence> attendence;					// Attribute
	
	private DataMgr() {                // constructor
		students = new ArrayList<>();
		teachers = new ArrayList<>();
		subjects = new ArrayList<>();
		classRooms = new ArrayList<>();
		classGroups = new ArrayList<>();
		schedules = new ArrayList<>();
		attendence = new ArrayList<>();
		
	}

	public synchronized static DataMgr getInstance() {
		if(instance == null) {
			instance = new DataMgr();
		}
		return instance;
	}

	public List<Student> getStudents() {
		return students;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}


	public List<ClassRoom> getClassRooms() {
		return classRooms;
	}


	public List<ClassGroup> getClassGroups() {
		return classGroups;
	}

	
	public List<Schedule> getSchedules() {
		return schedules;
	}

	public List<Attendence> getAttendence() {
		return attendence;
	}

	
	
	
	
}
