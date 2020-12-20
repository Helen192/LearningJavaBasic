package baitap_10.quanlytruonghoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Schedule {
	int scheduleId;
	String subjectCode, classCode, teacherCode, startDay, expireDay;
	List<String> teachingTime;
	float fromTime, toTime;
	
	public Schedule() {             // constructor
		teachingTime = new ArrayList<>();
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Schedule's ID: ");
		scheduleId = Integer.parseInt(input.nextLine());
		
		System.out.println("Code of subject: ");
		subjectCode = input.nextLine();
		
		System.out.println("Code of class: ");
		classCode = input.nextLine();
		
		System.out.println("Code of teacher: ");
		teacherCode = input.nextLine();
		
		System.out.println("Start day: ");
		startDay = input.nextLine();
		
		System.out.println("Expired day: ");
		expireDay = input.nextLine();
		
		System.out.println("Teaching time: ");
		for(;;) {
			System.out.format("Time (%d): ", teachingTime.size()+1);   // de hien thi ra la khung tim thu may: 
			teachingTime.add(input.nextLine()); 
			
			System.out.println("Do you want to continue (Y/N)?: ");
			String choose = input.nextLine();
			if(choose.equalsIgnoreCase("n")) {
				break;
			}
		}
		
		System.out.println("Teaching time beginn at: ");
		fromTime = Float.parseFloat(input.nextLine());
		
		System.out.println("Teaching time end at: ");
		toTime = Float.parseFloat(input.nextLine());
		
	}
	
	

	@Override
	public String toString() {
		return "ScheduleId=" + scheduleId + ", subjectCode=" + subjectCode + ", classCode=" + classCode
				+ ", teacherCode=" + teacherCode + ", startDay=" + startDay + ", expireDay=" + expireDay
				+ ", fromTime=" + fromTime + ", toTime=" + toTime ;
	}
	
	public void display() {
		System.out.println(toString());
		System.out.println("Teaching time: ");
		for(String value : teachingTime) {      // hien thi ra tat ca time day
			System.out.println(value);
		}
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}

	public String getStartDay() {
		return startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public String getExpireDay() {
		return expireDay;
	}

	public void setExpireDay(String expireDay) {
		this.expireDay = expireDay;
	}

	public List<String> getTeachingTime() {
		return teachingTime;
	}

	public void setTeachingTime(List<String> teachingTime) {
		this.teachingTime = teachingTime;
	}

	public float getFromTime() {
		return fromTime;
	}

	public void setFromTime(float fromTime) {
		this.fromTime = fromTime;
	}

	public float getToTime() {
		return toTime;
	}

	public void setToTime(float toTime) {
		this.toTime = toTime;
	}
	
	
	

	

}
