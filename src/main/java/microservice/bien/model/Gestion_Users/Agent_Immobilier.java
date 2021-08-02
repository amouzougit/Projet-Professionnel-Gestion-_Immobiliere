package microservice.bien.model.Gestion_Users;

import javax.persistence.*;


@Entity
@Table(name="agent_Immobilier")
public class Agent_Immobilier extends Personne{
    //@Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id_agent_immobilier",nullable = true)
    private Integer id_agent_immobilier;

    public Agent_Immobilier() {
    	
    }
 
    public Agent_Immobilier(String nom, String prenom, String adress, String email, String telephone, String password, Integer id_agent_immobilier, String username, Role role) {
        super(nom, prenom, adress, email, telephone,username,password,role);
        this.id_agent_immobilier = id_agent_immobilier;

    }

	public Integer getId_agent_immobilier() {
		return id_agent_immobilier;
	}

	public void setId_agent_immobilier(Integer id_agent_immobilier) {
		this.id_agent_immobilier = id_agent_immobilier;
	}
	
	
	
	
    
    
    
    

    
 


}
