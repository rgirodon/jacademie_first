package org.jacademie.first.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileReader {

	private static final Logger logger = LogManager.getLogger();
	
	public static String simpleReadTextFile(String filePath) {
		
		logger.info("Simple read text file : " + filePath + "...");

		
		File file = new File(filePath);
		
		try(
			FileInputStream fis = new FileInputStream(file); 
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
				) {
			
			StringBuilder sb = new StringBuilder();
			
			String readLine = null;
			
			while ((readLine = br.readLine()) != null) {
				
				sb.append(readLine).append("\n");
			}
			
			logger.info("Simple read text file done.");
			
			return sb.toString();
		}
		catch(Exception e) {
			
			logger.error("Error while reading file : " + filePath);

			logger.error(ExceptionUtils.getFullStackTrace(e));
			
			return null;
		}
	}
	
	public static String advancedReadTextFile(String filePath) {
		
		try {
			logger.info("Advanced read text file : " + filePath + "...");
			
			File file = new File(filePath);
			
			String result =  FileUtils.readFileToString(file);
			
			logger.info("Advanced read text file done.");
			
			return result;
		}
		catch(Exception e) {
			
			logger.error("Error while reading file : " + filePath);

			logger.error(ExceptionUtils.getFullStackTrace(e));
			
			return null;
		}
	}
}
