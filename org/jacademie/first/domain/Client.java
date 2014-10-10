package org.jacademie.first.domain;

import java.util.Collection;
import java.util.HashSet;

public class Client {

	private String identifiant;
	
	private String prenom;
	
	private String nom;
	
	private Collection<Compte> comptes;
	
	public Client(String identifiant, String prenom, String nom) {
		super();
		this.identifiant = identifiant;
		this.prenom = prenom;
		this.nom = nom;
		this.comptes = new HashSet<Compte>();
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append( "Client [identifiant=" + identifiant + ", prenom=" + prenom
				+ ", nom=" + nom + ", nbComptes=" + this.comptes.size() + "] ");
		
		sb.append("Avoir Global : ").append(this.calculerAvoirGlobal());
		
		return sb.toString();
	}
	
	public Double calculerAvoirGlobal() {
		
		Double total = 0.0;
		
		for (Compte compte : this.comptes) {
			
			total += compte.getSolde();
		}
		
		return total;
	}
	
	public void ajouterCompte(Compte compte) {
		
		this.comptes.add(compte);
	}
	
	public void supprimerCompte(Compte compte) {
		
		this.comptes.remove(compte);
	}
	
	public Compte retrouverCompte(String numero) {
		
		Compte result = null;
		
		for (Compte compte : this.comptes) {
			
			if (compte.getNumero().equals(numero)) {
				
				result = compte;
				break;
			}
		}
		
		return result;
	}
	
	public void supprimerCompte(String numero) {
		
		Compte compte = this.retrouverCompte(numero);
		
		if (compte != null) {
			
			this.supprimerCompte(compte);
		}
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}
}
