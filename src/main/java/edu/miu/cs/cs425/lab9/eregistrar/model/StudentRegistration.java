package edu.miu.cs.cs425.lab9.eregistrar.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="student_registrations")
public class StudentRegistration {

	/*
	 * studentId : (should be the primary key field)
	 * studentNumber: e.g. 000-61-0001 (required)
	 * FirstName: e.g. Anna (required)
	 * MiddleName: (optional)
	 * LastName: e.g. Smith (required) cgpa: e.g. 3.78 (optional) enrollmentDate:
	 * e.g. 2019-5-12 (required) isInternational: (values: "Yes", "No") (required) -
	 * Hint: Implement/present this data in a drop-down list or Radio button
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentId;
	@NotBlank(message= "* Student Number is Required")
	private String studentNumber;
	@NotBlank(message= "* First Name is Required")
	private String firstName;
	private String middleName;
	@NotBlank(message= "* Last Name is Required")
	private String lastName;
	private Float cgpa;
	private LocalDate enrollmentDate;
	private String isInternational;

	public StudentRegistration(String studentNumber, String firstName, String middleName, String lastName, Float cgpa,
			LocalDate enrollmentDate, String isInternational) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.enrollmentDate = enrollmentDate;
		this.isInternational = isInternational;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Float getCgpa() {
		return cgpa;
	}

	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
	}

	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getIsInternational() {
		return isInternational;
	}

	public void setIsInternational(String isInternational) {
		this.isInternational = isInternational;
	}

	public StudentRegistration() {
		// TODO Auto-generated constructor stub
	}

}
