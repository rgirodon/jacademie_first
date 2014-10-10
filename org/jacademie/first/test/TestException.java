package org.jacademie.first.test;

import org.jacademie.first.exception.BusinessException;
import org.jacademie.first.test.util.TestExceptionUtil;

public class TestException {

	public static void main(String[] args) {
		try {
			TestExceptionUtil.effectuerTraitement1(5);
			
			TestExceptionUtil.effectuerTraitement1(15);
		}
		catch(BusinessException be) {
			
			System.out.println(be.getMessage());
		}
		
		TestExceptionUtil.effectuerTraitement2(5);
		
		TestExceptionUtil.effectuerTraitement2(15);
	}

}
