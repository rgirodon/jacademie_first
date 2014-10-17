package org.jacademie.first.batch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jacademie.first.util.SoldeConsultable;

public class AverageCalculator {

	private static final Logger logger = LogManager.getLogger();
	
	public static Double calculateAverage(SoldeConsultable[] soldeConsultables) {
		
		logger.debug("In calculateAverage...");
		
		Double result = 0.0;
		
		if (soldeConsultables.length != 0) {
			
			for (SoldeConsultable soldeConsultable : soldeConsultables) {
				
				result = result + soldeConsultable.consulteSolde();
			}
			
			result = result / soldeConsultables.length;
		}
		
		logger.debug("calculateAverage done.");
		
		return result;
	}
}
