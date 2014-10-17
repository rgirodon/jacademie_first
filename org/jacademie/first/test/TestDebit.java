package org.jacademie.first.test;

import org.jacademie.first.domain.Compte;
import org.jacademie.first.domain.CompteCourant;
import org.jacademie.first.domain.CompteEpargne;
import org.jacademie.first.exception.DebitException;
import org.junit.Assert;
import org.junit.Test;

public class TestDebit {

	@Test
	public void testDebitCompteEpargneOk() {
		
		Compte ce = new CompteEpargne("CE1", "CE1", 1000.0, 1.5, 10000.0);
		
		try {
			ce.debiter(900.0);
		} 
		catch (DebitException e) {
			
			Assert.fail();
		}
		
		Assert.assertEquals((Double)100.0, ce.getSolde());
	}
	
	@Test	
	public void testDebitCompteEpargneNotOk() {
		
		Compte ce = new CompteEpargne("CE1", "CE1", 1000.0, 1.5, 10000.0);
		
		try {
			ce.debiter(1100.0);
			
			Assert.fail();
		} 
		catch (DebitException e) {
			
			Assert.assertEquals((Double)1000.0, ce.getSolde());
		}
	}
	
	@Test
	public void testDebitCompteCourantOkSansDecouvert() {
		
		Compte cc = new CompteCourant("CC1", "CC1", 1000.0, 200.0);
		
		try {
			cc.debiter(900.0);
		} 
		catch (DebitException e) {
			
			Assert.fail();
		}
		
		Assert.assertEquals((Double)100.0, cc.getSolde());
	}
	
	@Test
	public void testDebitCompteCourantOkAvecDecouvert() {
		
		Compte cc = new CompteCourant("CC1", "CC1", 1000.0, 200.0);
		
		try {
			cc.debiter(1100.0);
		} 
		catch (DebitException e) {
			
			Assert.fail();
		}
		
		Assert.assertEquals(-100.0D, cc.getSolde(), 0.001);
	}
	
	@Test
	public void testDebitCompteCourantNotOk() {
		
		Compte cc = new CompteCourant("CC1", "CC1", 1000.0, 200.0);
		
		try {
			cc.debiter(1300.0);
			
			Assert.fail();
		} 
		catch (DebitException e) {
			
			Assert.assertEquals(1000.0D, cc.getSolde(), 0.001);
		}
	}
}
