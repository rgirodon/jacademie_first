package org.jacademie.first.test.util;

import org.jacademie.first.domain.CompteCourant;
import org.jacademie.first.domain.CompteEpargne;
import org.jacademie.first.domain.Tresor;
import org.jacademie.first.util.SoldeConsultable;

public class TestDataProvider {

	public static SoldeConsultable[] buildSoldeConsultableDataFirstSet() {
		
		SoldeConsultable[] result = new SoldeConsultable[10];
		
		result[0] = new CompteEpargne("CE1", "CE1", 1000.0, 1.5, 10000.0);
		result[1] = new CompteCourant("CC1", "CC1", 2000.0, 200.0);
		result[2] = new CompteEpargne("CE2", "CE2", 3000.0, 1.5, 10000.0);
		result[3] = new CompteCourant("CC2", "CC2", 4000.0, 200.0);
		result[4] = new CompteEpargne("CE3", "CE3", 5000.0, 1.5, 10000.0);
		result[5] = new CompteCourant("CC3", "CC3", 6000.0, 200.0);
		result[6] = new CompteEpargne("CE4", "CE4", 7000.0, 1.5, 10000.0);
		result[7] = new CompteCourant("CC4", "CC4", 8000.0, 200.0);
		result[8] = new CompteEpargne("CE5", "CE5", 9000.0, 1.5, 10000.0);
		result[9] = new CompteCourant("CC5", "CC5", 10000.0, 200.0);
		
		return result;
	}
	
	public static SoldeConsultable[] buildSoldeConsultableDataSecondSet() {
		
		SoldeConsultable[] result = new SoldeConsultable[2];
		
		result[0] = new Tresor(100);
		result[1] = new Tresor(50);
		
		return result;
	}
}
