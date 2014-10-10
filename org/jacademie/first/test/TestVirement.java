package org.jacademie.first.test;

import org.jacademie.first.domain.Compte;
import org.jacademie.first.domain.CompteCourant;
import org.jacademie.first.domain.CompteEpargne;
import org.jacademie.first.exception.CreditException;
import org.jacademie.first.exception.DebitException;

public class TestVirement {

	public static void main(String[] args) {
		
		Compte ce1 = new CompteEpargne("CE1", "CE1", 1000.0, 1.5, 10000.0);		
		Compte cc1 = new CompteCourant("CC1", "CC1", 1000.0, 200.0);
				
		System.out.println("Au debut : " + ce1);
		System.out.println("Au debut : " + cc1);
		
		try {
			ce1.effectuerVirement(cc1, 900.0);
		} 
		catch (DebitException dex) {			
			System.out.println(dex.getMessage());
		}
		catch (CreditException cex) {
			System.out.println(cex.getMessage());
		}
		
		System.out.println("Apres 1er debit : " + ce1);
		System.out.println("Apres 1er debit : " + cc1);
		
		try {
			ce1.effectuerVirement(cc1, 200.0);
		} 
		catch (DebitException dex) {			
			System.out.println(dex.getMessage());
		}
		catch (CreditException cex) {
			System.out.println(cex.getMessage());
		}
				
		System.out.println("Apres 2e debit : " + ce1);
		System.out.println("Apres 2e debit : " + cc1);
		
		System.out.println("");
		
		Compte ce2 = new CompteEpargne("CE2", "CE2", 1000.0, 1.5, 10000.0);		
		Compte cc2 = new CompteCourant("CC2", "CC2", 10000.0, 200.0);
				
		System.out.println("Au debut : " + ce2);
		System.out.println("Au debut : " + cc2);
		
		try {
			cc2.effectuerVirement(ce2, 9000.0);
		} 
		catch (DebitException dex) {			
			System.out.println(dex.getMessage());
		}
		catch (CreditException cex) {
			System.out.println(cex.getMessage());
		}
		
		System.out.println("Apres 1er debit : " + ce2);
		System.out.println("Apres 1er debit : " + cc2);
		
		try {
			cc2.effectuerVirement(ce2, 1000.0);
		} 
		catch (DebitException dex) {			
			System.out.println(dex.getMessage());
		}
		catch (CreditException cex) {
			System.out.println(cex.getMessage());
		}
				
		System.out.println("Apres 2e debit : " + ce2);
		System.out.println("Apres 2e debit : " + cc2);
	}

}
