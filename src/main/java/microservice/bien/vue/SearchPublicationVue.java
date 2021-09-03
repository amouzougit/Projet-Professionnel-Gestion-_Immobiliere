package microservice.bien.vue;

import microservice.bien.model.Gestion_Immobilier.Type_Bien;
import microservice.bien.model.Gestion_Immobilier.Ville;
import microservice.bien.model.Gestion_publication.Type_Publication;

public class SearchPublicationVue {
	private Type_Bien typeBien;
	private Type_Publication typePubliccation;
	private Ville ville;
	private String libelle;
	private Integer nbre_chambre;
	private Integer nbre_etage;
	private Float montant;
	
	public SearchPublicationVue() {
		
	}
	
	public SearchPublicationVue(Float montant, Integer nbre_etage,Integer nbre_chambre,String libelle,Type_Bien typeBien, Type_Publication typePubliccation, Ville ville) {
		this.typeBien = typeBien;
		this.typePubliccation = typePubliccation;
		this.ville = ville;
	}
	public Type_Bien getTypeBien() {
		return typeBien;
	}
	public void setTypeBien(Type_Bien typeBien) {
		this.typeBien = typeBien;
	}
	public Type_Publication getTypePubliccation() {
		return typePubliccation;
	}
	public void setTypePubliccation(Type_Publication typePubliccation) {
		this.typePubliccation = typePubliccation;
	}
	public Ville getQuartier() {
		return ville;
	}
	public void setQuartier(Ville ville) {
		this.ville = ville;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getNbre_chambre() {
		return nbre_chambre;
	}

	public void setNbre_chambre(Integer nbre_chambre) {
		this.nbre_chambre = nbre_chambre;
	}

	public Integer getNbre_etage() {
		return nbre_etage;
	}

	public void setNbre_etage(Integer nbre_etage) {
		this.nbre_etage = nbre_etage;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	
	
	
	
	

	
	
	
	
	

	

}
