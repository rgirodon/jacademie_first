package org.jacademie.first.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jacademie.first.batch.AverageCalculator;
import org.jacademie.first.test.util.TestDataProvider;
import org.jacademie.first.util.SoldeConsultable;

public class TestAverageCalculator {

	private static final Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		
		logger.debug("Debut du programme...");
		
		SoldeConsultable[] testData1 = TestDataProvider.buildSoldeConsultableDataFirstSet();
		
		logger.info("1st Set Average Data : " + AverageCalculator.calculateAverage(testData1));
		
		SoldeConsultable[] testData2 = TestDataProvider.buildSoldeConsultableDataSecondSet();
		
		logger.info("2nd Set Average Data : " + AverageCalculator.calculateAverage(testData2));
		
		logger.debug("Fin du programme.");
	}

}
