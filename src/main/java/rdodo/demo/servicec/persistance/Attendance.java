package rdodo.demo.servicec.persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Attendance implements Serializable{

	private static final long serialVersionUID = -2886671774160673580L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String studentName;
	private int totalSchoolDays;
	private int totalPresent;
	
	public Attendance() {
		super();
	}

	public Attendance(String studentName, int totalSchoolDays, int totalPresent) {
		super();
		this.studentName = studentName;
		this.totalSchoolDays = totalSchoolDays;
		this.totalPresent = totalPresent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getTotalSchoolDays() {
		return totalSchoolDays;
	}

	public void setTotalSchoolDays(int totalSchoolDays) {
		this.totalSchoolDays = totalSchoolDays;
	}

	public int getTotalPresent() {
		return totalPresent;
	}

	public void setTotalPresent(int totalPresent) {
		this.totalPresent = totalPresent;
	}
	
	
}
