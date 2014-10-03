package org.jacademie.first.test;

import org.jacademie.first.domain.CompteEpargne;

public class TestDebit {

	public static void main(String[] args) {
		
		CompteEpargne ce = new CompteEpargne("CE1", "CE1", 1000.0, 1.5);
		ce.debiter(900.0);
		System.out.println("Apres 1er debit : " + ce);
		ce.debiter(200.0);
		System.out.println("Apres 2e debit : " + ce);
	}

}
