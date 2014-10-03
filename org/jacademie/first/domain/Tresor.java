package org.jacademie.first.domain;

import org.jacademie.first.constants.Constants;
import org.jacademie.first.util.SoldeConsultable;

public class Tresor implements SoldeConsultable {

	private Integer nbGoldenPieces;
	
	public Tresor(Integer nbGoldenPieces) {
		
		this.nbGoldenPieces = nbGoldenPieces;
	}
	
	@Override
	public Double consulteSolde() {
		
		return this.nbGoldenPieces * Constants.GOLD_RATE;
	}

	public Integer getNbGoldenPieces() {
		return nbGoldenPieces;
	}

	public void setNbGoldenPieces(Integer nbGoldenPieces) {
		this.nbGoldenPieces = nbGoldenPieces;
	}

}
