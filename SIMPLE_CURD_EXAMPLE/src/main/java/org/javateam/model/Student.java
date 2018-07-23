/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * NAME:shaikh irfan
 *
 * TIME:5:28:40 am
 *DATE:05-Dec-2017
 *TAGS:
 */
@XmlRootElement
public class Student {
	private int studentId;
	private String studentName;
	private String schoolName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	/**
	 * @param studentId
	 * @param studentName
	 * @param schoolName
	 */
	public Student(int studentId, String studentName, String schoolName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.schoolName = schoolName;
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", schoolName=" + schoolName + "]";
	}
	

}
