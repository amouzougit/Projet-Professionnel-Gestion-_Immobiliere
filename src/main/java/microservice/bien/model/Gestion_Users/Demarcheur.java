package microservice.bien.model.Gestion_Users;

import microservice.bien.model.Gestion_Immobilier.Bien;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="demarcheur")
public class Demarcheur  extends Personne{
	//@Id
    //@Column(name = "id",nullable = true)
    public Long id;

    public Demarcheur()
    {
    }
    public Demarcheur(String profil, String nom, String prenom, String adress, String email, String telephone, String password, Long id,String username, Role role) {
        super(profil, nom, prenom, adress, email, telephone,password,username, role);
        this.id = id;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
    
    
	
	
   
}
