package org.jacademie.first.domain;

import static org.jacademie.first.constants.Constants.*;

public class CompteCourant extends Compte {

	private Double montantDecouvertAutorise;
	
	public CompteCourant() {

		super();
		
		this.montantDecouvertAutorise = 0.0;
	}
	
	public CompteCourant(String numero, String intitule, Double solde,
			Double montantDecouvertAutorise) {
			
		super(numero, intitule, solde);
		
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}
	
	@Override
	protected boolean isDebitAutorise(Double montant) {
		
		return (this.getSolde() + this.montantDecouvertAutorise - montant >= 0);
	}
	
	@Override
	public TypeCompte getTypeCompte() {
		
		return TypeCompte.COMPTE_COURANT;
	}
	
	public void methodeDeCompteCourant() {
		System.out.println("Methode de Compte Courant !");
	}
	
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		
		result.append(super.toString());
		
		result.append(" (montantDecouvertAutorise : " + this.montantDecouvertAutorise + ")");
		
		return result.toString();
	}

	public Double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}

	public void setMontantDecouvertAutorise(Double montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}
}
