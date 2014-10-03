package org.jacademie.first.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TestCopyFile {

	public static void main(String[] args) {
		
		File srcFile = new File("D:/tmp/fichier1.txt");
		
		File destFile = new File("D:/tmp/fichier2.txt");		
		
		try {
			System.out.println("Copying file...");
			
			FileUtils.copyFile(srcFile, destFile);
			
			System.out.println("Copy file done");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
