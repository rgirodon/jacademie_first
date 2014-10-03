package org.jacademie.first.test;

import org.jacademie.first.domain.CompteCourant;



public class TestCompteCourant {

	public static void main(String[] args) {
		
		CompteCourant[] tabCompteCourants = new CompteCourant[3];
		
		for (int i = 0; i < tabCompteCourants.length; i++) {
			
			CompteCourant cc = new CompteCourant();
			cc.setSolde(1000D);
			cc.setIntitule("Compte Courant " + (i+1));
			cc.setNumero("CC" + (i+1));
			cc.setMontantDecouvertAutorise(1000.0);
			
			tabCompteCourants[i] = cc;
		}
		
		
		for (CompteCourant cc : tabCompteCourants) {
			
			System.out.println(cc);
		}
	}

}
