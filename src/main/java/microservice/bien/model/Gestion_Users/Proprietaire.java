package microservice.bien.model.Gestion_Users;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="proprietaire")
public class Proprietaire extends Personne{
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
   	//@Column(name = "id",nullable = false)
    private Long id;

    public Proprietaire(){

    }
    public Proprietaire(String profil, String nom, String prenom, String adress, String email, String telephone, String password, Long id,String username, Role role) {
        super(profil, nom, prenom, adress, email, telephone,username,password,role);
        this.id = id;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


    
    
    
    
	
    
}

