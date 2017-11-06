package edu.attia.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.attia.models.Student;
import edu.attia.services.StudentService;

public class StudentTest {

	StudentService studentService;
	Student student;

	@Before
	public void init() {
		student = new Student(1, "Mehdi", 1500);
		studentService = new StudentService();
	}

	@Test
	public void testSalary() {
		assertEquals(1725.0, studentService.claculateSalary(student), 1);
	}

}
