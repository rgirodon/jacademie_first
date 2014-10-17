package org.jacademie.first.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.jacademie.first.util.MathUtil;
import org.junit.Before;
import org.junit.Test;

public class TestMathUtil {

	public static final Double DELTA = 0.0000000001;
	
	private List<Double> notes;
	
	@Before
	public void init() {
		
		this.notes = new ArrayList<Double>();
	}
	
	@Test
	public void testCalculerMoyenneWithNull() {
		
		assertNull(MathUtil.calculerMoyenne(null));
	}
		
	@Test
	public void testCalculerMoyenneWithEmpty() {

		assertEquals((Double)0.0, MathUtil.calculerMoyenne(this.notes));
	}
	
	@Test
	public void testCalculerMoyenneWithOneElementList() {
		
		this.notes.add(2.0);
		
		assertEquals((Double)2.0, MathUtil.calculerMoyenne(this.notes));
	}
	
	@Test
	public void testCalculerMoyenneWithMultiElementList() {
		
		this.notes.add(12.5);
		this.notes.add(7.5);
		this.notes.add(14.0);
		this.notes.add(12.0);
		
		assertEquals((Double)11.5, MathUtil.calculerMoyenne(this.notes), DELTA);
	}
}
