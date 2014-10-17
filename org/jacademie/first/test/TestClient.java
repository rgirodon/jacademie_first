package org.jacademie.first.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jacademie.first.domain.Client;
import org.jacademie.first.domain.Compte;
import org.jacademie.first.domain.CompteCourant;
import org.jacademie.first.domain.CompteEpargne;


public class TestClient {

	private static final Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {

		Client c = new Client("ID",
							  "Prenom",
							  "Nom");
		
		for (int i = 0; i < 10; i++) {
			
			CompteCourant cc = new CompteCourant();
			cc.setSolde(1000D);
			cc.setIntitule("Compte Courant " + (i+1));
			cc.setNumero("CC" + (i+1));
			cc.setMontantDecouvertAutorise(1000.0);
			

			CompteEpargne ce = null;
			
			if (i%2 == 1) {
				ce = new CompteEpargne();
				ce.setSolde(1000D);
				ce.setIntitule("Compte Epargne " + (i+1));
				ce.setNumero("CE" + (i+1));
				ce.setTauxInteret(1.5);
			}
			
			if (cc != null) {
				c.ajouterCompte(cc);
			}
			
			if (ce != null) {
				c.ajouterCompte(ce);
			}
		}
				
		logger.info("Before :");
		logger.info(c);
		
		Compte cc4 = c.retrouverCompte("CC4");
		
		if (cc4 != null) {
			
			logger.info("CC4 : " + cc4);
			
			c.supprimerCompte(cc4);
		}
		
		logger.info("After :");
		logger.info(c);
		logger.info("");
	}

}
