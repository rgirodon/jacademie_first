package org.jacademie.first.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {

	private String identifiant;
	
	private String prenom;
	
	private String nom;
	
	private Map<String, Compte> comptesMap;
	
	public Client(String identifiant, String prenom, String nom) {
		super();
		this.identifiant = identifiant;
		this.prenom = prenom;
		this.nom = nom;
		this.comptesMap = new HashMap<>();
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append( "Client [identifiant=" + identifiant + ", prenom=" + prenom
				+ ", nom=" + nom + ", "
				+ "nbComptes=" + this.getNbComptes() 
				+ ", nbCompteCourants=" + this.getNbCompteCourants()
				+ ", nbCompteEpargnes=" + this.getNbCompteEpargnes()
				+ "] ");
		
		sb.append("Avoir Global : ").append(this.calculerAvoirGlobal());
		
		return sb.toString();
	}
	
	public Double calculerAvoirGlobal() {
		
		Double total = 0.0;
		
		for (Compte compte : this.getComptes()) {
			
			total += compte.getSolde();
		}
		
		return total;
	}
	
	public Integer getNbComptes() {
		
		return this.comptesMap.size();
	}
	
	private Integer getNbComptesForType(TypeCompte typeCompte) {
		
		Integer result = 0;
		
		for (Compte compte : this.getComptes()) {
			
			if (compte.getTypeCompte() == typeCompte) {
				
				result++;
			}
		}
		
		return result;
	}
	
	public Integer getNbCompteCourants() {
		
		return this.getNbComptesForType(TypeCompte.COMPTE_COURANT);
	}
	
	public Integer getNbCompteEpargnes() {
		
		return this.getNbComptesForType(TypeCompte.COMPTE_EPARGNE);
	}
	
	public Collection<Compte> getComptes() {
		
		return comptesMap.values();
	}
	
	public void ajouterCompte(Compte compte) {
		
		this.comptesMap.put(compte.getNumero(), compte);
	}
	
	public void supprimerCompte(Compte compte) {
		
		this.comptesMap.remove(compte.getNumero());
	}
	
	public Compte retrouverCompte(String numero) {
		
		return this.comptesMap.get(numero);
	}
	
	public void supprimerCompte(String numero) {
		
		this.comptesMap.remove(numero);
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

	
}
