package model;

import java.util.Date;
import java.util.List;

public class Attendance {

	private int id;
	private Date attendaceDate;
	private String subject;
	private List<String> listOfAttendance;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getAttendaceDate() {
		return attendaceDate;
	}
	public void setAttendaceDate(Date attendaceDate) {
		this.attendaceDate = attendaceDate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public List<String> getListOfAttendance() {
		return listOfAttendance;
	}
	public void setListOfAttendance(List<String> listOfAttendance) {
		this.listOfAttendance = listOfAttendance;
	}
}
