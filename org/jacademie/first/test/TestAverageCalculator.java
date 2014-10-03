package org.jacademie.first.test;

import org.jacademie.first.batch.AverageCalculator;
import org.jacademie.first.test.util.TestDataProvider;
import org.jacademie.first.util.SoldeConsultable;

public class TestAverageCalculator {

	public static void main(String[] args) {
		
		SoldeConsultable[] testData1 = TestDataProvider.buildSoldeConsultableDataFirstSet();
		
		System.out.println("1st Set Average Data : " + AverageCalculator.calculateAverage(testData1));
		
		SoldeConsultable[] testData2 = TestDataProvider.buildSoldeConsultableDataSecondSet();
		
		System.out.println("2nd Set Average Data : " + AverageCalculator.calculateAverage(testData2));
	}

}
