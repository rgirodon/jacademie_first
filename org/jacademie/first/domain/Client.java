package org.jacademie.first.domain;

public class Client {

	private String identifiant;
	
	private String prenom;
	
	private String nom;
	
	private CompteCourant compteCourant;
	
	private CompteEpargne compteEpargne;
	
	public Client(String identifiant, String prenom, String nom,
			CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super();
		this.identifiant = identifiant;
		this.prenom = prenom;
		this.nom = nom;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append( "Client [identifiant=" + identifiant + ", prenom=" + prenom
				+ ", nom=" + nom + ", compteCourant=" + compteCourant
				+ ", compteEpargne=" + compteEpargne + "] ");
		
		sb.append("Avoir Global : ").append(this.calculerAvoirGlobal());
		
		return sb.toString();
	}
	
	public Double calculerAvoirGlobal() {
		
		Double total = 0.0;
		
		if (this.compteCourant != null) {
			
			total = total + compteCourant.getSolde();
		}
		
		if (this.compteEpargne != null) {
			
			total = total + compteEpargne.getSolde();
		}
		
		return total;
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

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}
	
	
}
