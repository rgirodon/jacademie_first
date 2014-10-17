package org.jacademie.first.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jacademie.first.util.FileReader;

public class TestFile {

	private static final Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		
		File srcFile = new File("D:/tmp/fichier1.txt");
		
		File destFile = new File("D:/tmp/fichier2.txt");		
		
		try {
			logger.info("Copying file...");
			
			FileUtils.copyFile(srcFile, destFile);
			
			logger.info("Copy file done");
			
			String fichier1Content = FileReader.simpleReadTextFile("D:/tmp/fichier1.txt");
			
			logger.info("Contenu fichier 1 : " + fichier1Content);
			
			String fichier2Content = FileReader.advancedReadTextFile("D:/tmp/fichier2.txt");
			
			logger.info("Contenu fichier 2 : " + fichier2Content);
		} 
		catch (IOException e) {
			logger.error(ExceptionUtils.getFullStackTrace(e));
		}
	}
}
