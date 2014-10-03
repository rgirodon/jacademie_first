package org.jacademie.first.test;

import org.jacademie.first.domain.Client;
import org.jacademie.first.domain.Compte;
import org.jacademie.first.domain.CompteCourant;
import org.jacademie.first.domain.CompteEpargne;


public class TestClient {

	public static void main(String[] args) {

		Client[] tabClients = new Client[3];
		
		for (int i = 0; i < tabClients.length; i++) {
			
			CompteCourant cc = new CompteCourant();
			cc.setSolde(1000D);
			cc.setIntitule("Compte Courant " + (i+1));
			cc.setNumero("CC" + (i+1));
			cc.setMontantDecouvertAutorise(1000.0);
			

			CompteEpargne ce = null;
			
			if (i != (tabClients.length - 1)) {
				ce = new CompteEpargne();
				ce.setSolde(1000D);
				ce.setIntitule("Compte Epargne " + (i+1));
				ce.setNumero("CC" + (i+1));
				ce.setTauxInteret(1.5);
			}
			
			Client c = new Client("ID" + (i+1),
								  "Prenom" + (i+1),
								  "Nom" + (i+1),
								  cc,
								  ce
								  );
			
			tabClients[i] = c;
		}
		
		
		for (Client c : tabClients) {
			
			System.out.println(c);
		}
	}

}
