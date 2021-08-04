package microservice.bien.model.Gestion_Users;

import javax.persistence.*;

@Entity
@Table(name ="client")
public class Client extends Personne {
   //@Id
   //@Column(name = "id")
    private Long id;

    public Client()
    {
    }
    public Client(String nom, String prenom, String adress, String email, String telephone, String password, Long id,String username, Role role) {
        super(nom, prenom, adress, email, telephone, password,username,role);
        this.id = id;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
    
    
    
    
	
    
    
    
    
    


}
