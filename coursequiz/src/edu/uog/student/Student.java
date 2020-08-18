package edu.uog.student;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TBLSTUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long STUDENT_ID;
	
	@Column(name = "STUDENT_ROLLNO")
	private String STUDENT_ROLLNO;
	
	@Column(name = "STUDY_PROGRAM")
	private String STUDY_PROGRAM;
	
	@Column(name = "STUDY_YEAR")
	private String STUDY_YEAR;
	
	public int getSTUDENT_ID() {
		return STUDENT_ID;
	}

	public void setSTUDENT_ID(int sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}

	

	public String getSTUDENT_ROLLNO() {
		return STUDENT_ROLLNO;
	}

	public void setSTUDENT_ROLLNO(String sTUDENT_ROLLNO) {
		STUDENT_ROLLNO = sTUDENT_ROLLNO;
	}

	public String getSTUDY_PROGRAM() {
		return STUDY_PROGRAM;
	}

	public void setSTUDY_PROGRAM(String sTUDY_PROGRAM) {
		STUDY_PROGRAM = sTUDY_PROGRAM;
	}

	public String getSTUDY_YEAR() {
		return STUDY_YEAR;
	}

	public void setSTUDY_YEAR(String sTUDY_YEAR) {
		STUDY_YEAR = sTUDY_YEAR;
	}

	public String toString() {
		String str = null;
		
		str = this.STUDENT_ID
				+ "," + this.STUDENT_ROLLNO
				+ "," + this.STUDY_PROGRAM
				+ "," + this.STUDY_YEAR;
		
		return str;
	}

}


