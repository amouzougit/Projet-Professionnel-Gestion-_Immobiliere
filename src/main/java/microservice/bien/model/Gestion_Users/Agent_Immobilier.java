package microservice.bien.model.Gestion_Users;

import javax.persistence.*;


@Entity
@Table(name="agent_Immobilier")
public class Agent_Immobilier extends Personne{
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id_agent_immobilier",nullable = true)
    private Long id;

    public Agent_Immobilier() {
    	
    }
 
    public Agent_Immobilier(String profil, String nom, String prenom, String adress, String email, String telephone, String password, Long id, String username, Role role) {
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
