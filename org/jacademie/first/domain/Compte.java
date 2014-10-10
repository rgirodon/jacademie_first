package org.jacademie.first.domain;

import static org.jacademie.first.constants.Constants.DEBIT_REFUSE;

import org.jacademie.first.constants.Constants;
import org.jacademie.first.exception.CompteException;
import org.jacademie.first.exception.CreditException;
import org.jacademie.first.exception.DebitException;
import org.jacademie.first.util.SoldeConsultable;

abstract public class Compte implements SoldeConsultable {

	private String numero;
	
	private String intitule;
	
	private Double solde;
	
	public Compte() {

		this.solde=0.0;
	}

	public Compte(String numero, String intitule, Double solde) {

		this.numero = numero;
		
		this.intitule = intitule;
		
		if (solde >= 0) {
			
			this.solde = solde;
		}
		else {
			solde = 0.0;
		}
	}

	@Override
	public Double consulteSolde() {
		
		return this.getSolde();
	}
	
	public void effectuerVirement(Compte compteCible, Double montant) throws CompteException {
		
		try {
			this.debiter(montant);
		} 
		catch (DebitException de) {

			throw de;
		}
		
		try {
			compteCible.crediter(montant);
		}
		catch(CreditException ce) {
			
			this.crediter(montant);
			
			throw ce;
		}
	}
	
	public void crediter(Double montant) throws CreditException {
		
		if (!this.isCreditAutorise(montant)) {
			
			throw new CreditException(Constants.CREDIT_REFUSE + " " + this.toString() + " " + montant);
		}
		else {		
			this.solde = this.solde + montant;
		}
	}
	
	public void debiter(Double montant) throws DebitException {
		
		if (!this.isDebitAutorise(montant)) {
			
			throw new DebitException(Constants.DEBIT_REFUSE + " " + this.toString() + " " + montant);
		}
		else {
			this.solde = this.solde - montant;
		}
	}
	
	abstract public TypeCompte getTypeCompte();
	
	abstract protected boolean isDebitAutorise(Double montant);
	
	abstract protected boolean isCreditAutorise(Double montant);

	@Override
	public String toString() {
		return this.getTypeCompte() + " [numero=" + numero + ", intitule=" + intitule
				+ ", solde=" + solde + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}
}
