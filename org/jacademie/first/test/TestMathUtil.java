package org.jacademie.first.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.jacademie.first.util.MathUtil;
import org.junit.Before;
import org.junit.Test;

public class TestMathUtil {

	private List<Integer> integers;
	
	@Before
	public void init() {
		
		this.integers = new ArrayList<Integer>();
	}
	
	@Test
	public void testCalculerMoyenneWithNull() {
		
		assertNull(MathUtil.calculerMoyenne(null));
	}
		
	@Test
	public void testCalculerMoyenneWithEmpty() {

		assertEquals((Integer)0, MathUtil.calculerMoyenne(this.integers));
	}
	
	@Test
	public void testCalculerMoyenneWithOneElementList() {
		
		this.integers.add(2);
		
		assertEquals((Integer)2, MathUtil.calculerMoyenne(this.integers));
	}
	
	@Test
	public void testCalculerMoyenneWithMultiElementList() {
		
		this.integers.add(2);
		this.integers.add(8);
		this.integers.add(14);
		
		assertEquals((Integer)8, MathUtil.calculerMoyenne(this.integers));
	}
}
