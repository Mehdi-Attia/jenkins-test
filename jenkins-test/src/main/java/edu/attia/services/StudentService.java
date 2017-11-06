package edu.attia.services;

import edu.attia.models.Student;

public class StudentService {

	public double claculateSalary(Student student) {
		return student.getSalary() * 1.15;
	}
	
	public double claculateVipSalary(Student student) {
		return student.getSalary() * 1.5;
	}
}
