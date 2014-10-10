package org.jacademie.first.test.util;

import org.jacademie.first.constants.Constants;
import org.jacademie.first.exception.BusinessException;
import org.jacademie.first.exception.TechnicalException;

public class TestExceptionUtil {

	public static void effectuerTraitement1(int number) throws BusinessException {
		
		if (number <= Constants.MAX_ITERATION) {
			
			for (int i = 0; i < number; i++) {
			
				System.out.println("J'effectue un traitement : " + i);
			}
		}
		else {
			throw new BusinessException(Constants.MAX_ITERATION_EXCEEDED + number);
		}
	}
	
	public static void effectuerTraitement2(int number) {
		
		if (number <= Constants.MAX_ITERATION) {
			
			for (int i = 0; i < number; i++) {
			
				System.out.println("J'effectue un traitement : " + i);
			}
		}
		else {
			throw new TechnicalException(Constants.MAX_ITERATION_EXCEEDED + number);
		}
	}
}
