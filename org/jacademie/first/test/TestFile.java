package org.jacademie.first.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jacademie.first.util.FileReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFile {

	private static final Logger logger = LogManager.getLogger();
	
	@BeforeClass
	public static void initGlobal() {
		
		logger.info("Init global...");
		
		logger.info("Init done.");
	}
	
	@Before
	public void init() {
		
		logger.info("Initialisation cas de test...");
		
		logger.info("Initialisation done.");
	}
	
	@Test
	public void testSimpleReadTextFile() {
		
		logger.info("Testing simpleReadTextFile...");
		
		String fichier1Content = FileReader.simpleReadTextFile("D:/tmp/fichier1.txt");
		
		Assert.assertEquals("La J//Academie du 03/10/2014 !", fichier1Content);
		
		logger.info("Testing simpleReadTextFile done.");
	}
	
	@Test
	public void testAdvancedReadTextFile() {
		
		logger.info("Testing advancedReadTextFile...");
		
		String fichier1Content = FileReader.advancedReadTextFile("D:/tmp/fichier1.txt");
		
		Assert.assertEquals("La J//Academie du 03/10/2014 !", fichier1Content);
		
		logger.info("Testing advancedReadTextFile done.");
	}
	
	@Test
	public void testCopyFile() {
		
		try {
			File srcFile = new File("D:/tmp/fichier1.txt");
			
			File destFile = new File("D:/tmp/fichier2.txt");
			
			FileUtils.copyFile(srcFile, destFile);
			
			String fichier1Content = FileReader.advancedReadTextFile("D:/tmp/fichier1.txt");
			
			Assert.assertEquals("La J//Academie du 03/10/2014 !", fichier1Content);
			
			String fichier2Content = FileReader.advancedReadTextFile("D:/tmp/fichier2.txt");
			
			Assert.assertEquals("La J//Academie du 03/10/2014 !", fichier2Content);
			
			Assert.assertEquals(fichier1Content, fichier2Content);
		} 
		catch (IOException e) {
			logger.error(ExceptionUtils.getFullStackTrace(e));
			
			Assert.fail();
		}
	}
}
