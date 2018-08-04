package model;

import java.util.Date;
import java.util.List;

public class Attendance {

	private Date attendaceDate;
	private String subject;
	private List<String> listOfAttendance;
	
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
