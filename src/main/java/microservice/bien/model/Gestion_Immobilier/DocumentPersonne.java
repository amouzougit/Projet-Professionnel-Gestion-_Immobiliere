package microservice.bien.model.Gestion_Immobilier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import microservice.bien.model.Gestion_Users.Personne;

@Entity
public class DocumentPersonne {
	
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name ="id_document_personne")
    private Integer id_document_personne;
    
	
	 @ManyToOne
	 @JoinColumn(name ="id",nullable = false)
	 private Personne personne;
	    
	

	

}
