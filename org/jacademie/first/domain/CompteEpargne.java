package org.jacademie.first.domain;

import org.jacademie.first.constants.Constants;


public class CompteEpargne extends Compte {
	
	private Double tauxInteret;
	
	private Double plafond;

	public CompteEpargne() {
		
		super();
		
		this.tauxInteret = Constants.DEFAULT_TAUX_INTERET;
		
		this.plafond = Constants.DEFAULT_PLAFOND;
	}
	
	public CompteEpargne(String numero, String intitule, Double solde,
			Double tauxInteret, Double plafond) {
				
		super(numero, intitule, solde);
		
		this.tauxInteret = tauxInteret;
		
		this.plafond = plafond;
	}
	
	@Override
	protected boolean isDebitAutorise(Double montant) {
		
		return (this.getSolde() - montant >= 0);
	}
	
	@Override
	protected boolean isCreditAutorise(Double montant) {
		
		return (this.getSolde() + montant <= this.plafond);
	}
	
	@Override
	public TypeCompte getTypeCompte() {
		
		return TypeCompte.COMPTE_EPARGNE;
	}
	
	@Override
	public String toString() {
		
		String result = super.toString();
		
		result += " (tauxInteret : " + this.tauxInteret + ", plafond : " + this.plafond + ")";
		
		return result;
	}
	
	public Double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	public Double getPlafond() {
		return plafond;
	}

	public void setPlafond(Double plafond) {
		this.plafond = plafond;
	}

}
