package org.jacademie.first.test;

import org.jacademie.first.domain.Compte;
import org.jacademie.first.domain.CompteCourant;
import org.jacademie.first.domain.CompteEpargne;
import org.jacademie.first.exception.DebitException;

public class TestDebit {

	public static void main(String[] args) {
		
		Compte ce = new CompteEpargne("CE1", "CE1", 1000.0, 1.5, 10000.0);
		
		System.out.println("Au debut : " + ce);
		
		try {
			ce.debiter(900.0);
		} 
		catch (DebitException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Apres 1er debit : " + ce);
		
		try {
			ce.debiter(200.0);
		} 
		catch (DebitException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Apres 2e debit : " + ce);
		
		System.out.println("");
		
		Compte cc = new CompteCourant("CC1", "CC1", 1000.0, 200.0);
		
		System.out.println("Au debut : " + cc);
		
		try {
			cc.debiter(900.0);
		} 
		catch (DebitException e) {
			
			System.out.println(e.getMessage());
		}		
		
		System.out.println("Apres 1er debit : " + cc);
		
		try {
			cc.debiter(200.0);
		} 
		catch (DebitException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Apres 2e debit : " + cc);
		
		try {
			cc.debiter(200.0);
		} 
		catch (DebitException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Apres 3e debit : " + cc);
		
		
		
		/*
		Compte cc0 = new CompteCourant("CC0", "CC0", 1000.0, 200.0);		
		// System.out.println(cc0);
		
		Compte cc1 = new CompteCourant("CC1", "CC1", 1000.0, 200.0);
		// System.out.println(cc1);
		
		Compte ce0 = new CompteEpargne("CE0", "CE0", 1000.0, 1.5);
		// System.out.println(ce0);
		
		Compte ce1 = new CompteEpargne("CE1", "CE1", 1000.0, 1.5);
		// System.out.println(ce1);
		
		Compte[] tabComptes = new Compte[4];
		tabComptes[0] = cc0;
		tabComptes[1] = ce0;
		tabComptes[2] = cc1;
		tabComptes[3] = ce1;
		
		for (Compte compte : tabComptes) {
			
			System.out.println(compte);
			
			if (compte instanceof CompteCourant) {
				
				// cast
				CompteCourant compteCourant = (CompteCourant)compte;
				
				compteCourant.methodeDeCompteCourant();
			}
		}
		*/
	}

}
