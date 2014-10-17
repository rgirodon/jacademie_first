package org.jacademie.first.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.jacademie.first.exception.MissingValueException;
import org.jacademie.first.template.Template;
import org.junit.Test;

public class TestTemplate {

	@Test
	public void evaluateWithOneVariable() {
		Template template = new Template("Hello ${name}");
		template.put("name", "R�my");
		String expected = "Hello R�my";
		try {
			assertEquals(expected, template.evaluate());
		} catch (MissingValueException e) {
			fail();
		}
	}
	
	@Test
	public void evaluateWithMultipleVariable() {
		Template template = new Template("Hello ${firstname} ${lastname}");
		template.put("firstname", "R�my");
		template.put("lastname", "Girodon");
		String expected = "Hello R�my Girodon";
		try {
			assertEquals(expected, template.evaluate());
		} catch (MissingValueException e) {
			fail();
		}
	}
	
	@Test
	public void evaluateWithIgnoredVariable() {
		Template template = new Template("Hello ${firstname} ${lastname}");
		template.put("firstname", "R�my");
		template.put("lastname", "Girodon");
		template.put("age", "34");
		String expected = "Hello R�my Girodon";
		try {
			assertEquals(expected, template.evaluate());
		} catch (MissingValueException e) {
			fail();
		}
	}
	
	@Test(expected = MissingValueException.class)
	public void evaluateWithMissingVariable() throws MissingValueException {
		Template template = new Template("Hello ${firstname} ${lastname}");
		template.put("firstname", "R�my");
		template.evaluate();
		fail();
	}
}
