package org.jacademie.first.domain;

import org.jacademie.first.constants.Constants;

public class CompteEpargne extends Compte {
	
	private Double tauxInteret;

	public CompteEpargne() {
		
		super();
		
		this.tauxInteret = 0.0;
	}
	
	public CompteEpargne(String numero, String intitule, Double solde,
			Double tauxInteret) {
				
		super(numero, intitule, solde);
		
		this.tauxInteret = tauxInteret;
	}
	
	@Override
	protected boolean isDebitAutorise(Double montant) {
		
		return (this.getSolde() - montant >= 0);
	}
	
	@Override
	public TypeCompte getTypeCompte() {
		
		return TypeCompte.COMPTE_EPARGNE;
	}
	
	@Override
	public String toString() {
		
		String result = super.toString();
		
		result += " (tauxInteret : " + this.tauxInteret + ")";
		
		return result;
	}
	
	public Double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

}
