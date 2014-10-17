package org.jacademie.first.service.impl;

import org.jacademie.first.dao.StudentDAO;
import org.jacademie.first.domain.Student;

public class StudentServiceImpl {

	private StudentDAO studentDAO;

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public StudentServiceImpl() {		
	}
	
	public Double computeAverageForStudent(Integer studentId) {
		
		Double result = 0.0;
		
		Student student = this.studentDAO.retrieveStudent(studentId);
		
		if (!student.getNotes().isEmpty()) {
			for (Double note : student.getNotes()) {
				result = result + note;
			}
			result = result / student.getNotes().size();
		}
		else {
			result = null;
		}
		
		return result;
	}
}
