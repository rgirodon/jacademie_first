package org.jacademie.first.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.jacademie.first.dao.StudentDAO;
import org.jacademie.first.domain.Student;
import org.jacademie.first.service.impl.StudentServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestStudentService {

	public final static Double DELTA_FOR_DOUBLE_ASSERT = 0.00000000001; 
	
	private StudentServiceImpl studentServiceImpl;
	
	private StudentDAO studentDAO;
	
	@Before
	public void init() {
		
		this.studentServiceImpl = new StudentServiceImpl();
		
		this.studentDAO = Mockito.mock(StudentDAO.class);
		
		this.studentServiceImpl.setStudentDAO(this.studentDAO);
	}
	
	@Test
	public void testStudentWithNotes() {
		Student student31 = new Student();
		student31.addNote(20.0);
		student31.addNote(16.0);
		
		Mockito.when(this.studentDAO.retrieveStudent(31)).thenReturn(student31);

		Double expected = 18.0;
		
		assertEquals(expected, this.studentServiceImpl.computeAverageForStudent(31), DELTA_FOR_DOUBLE_ASSERT);
	}

	@Test
	public void testStudentWithNoNote() {
		Student student31 = new Student();
		
		Mockito.when(this.studentDAO.retrieveStudent(31)).thenReturn(student31);

		assertNull(this.studentServiceImpl.computeAverageForStudent(31));
	}
}
