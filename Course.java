package com;

import javax.persistance.Table;

@Entity
@Table
public class Course {

	@Id
	@GeneratedValue
	int courseId;
	String courseName;
	int duratrionInMonth;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuratrionInMonth() {
		return duratrionInMonth;
	}
	public void setDuratrionInMonth(int duratrionInMonth) {
		this.duratrionInMonth = duratrionInMonth;
	}
	
	
}
