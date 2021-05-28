package microservice.bien.model.Gestion_Users;

import javax.persistence.*;

import microservice.bien.model.Gestion_Immobilier.Bien;

import java.awt.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name ="notaire")
public class Notaire extends Personne{
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
   private Integer id;

    @Column(name = "nom_cabinet", nullable = false)
    private String nom_cabinet;

    @Column(name = "carte_identite", nullable = false)
    private String carte_identite;
    

   // @ManyToMany(mappedBy = "cabinet")
    //private Set<Cabinet> cabinets = new HashSet<>();

    public Notaire(){
    }

    public Notaire(String nom, String prenom, String adress, String email, String telephone, String password, Integer id, String nom_cabinet,String carte_identite,String username) {
        super(nom, prenom, adress, email, telephone,username,password);
        this.id = id;
        this.nom_cabinet = nom_cabinet;
        this.carte_identite =carte_identite;
    }
    
    

	public String getNom_cabinet() {
		return nom_cabinet;
	}

	public void setNom_cabinet(String nom_cabinet) {
		this.nom_cabinet = nom_cabinet;
	}

	public String getCarte_identite() {
		return carte_identite;
	}

	public void setCarte_identite(String carte_identite) {
		this.carte_identite = carte_identite;
	}
    
    
}
