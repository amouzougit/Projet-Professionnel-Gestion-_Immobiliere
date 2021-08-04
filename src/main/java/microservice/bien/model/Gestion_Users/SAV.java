package microservice.bien.model.Gestion_Users;

import javax.persistence.*;

@Entity
@Table(name ="sav")
public class SAV extends Personne{
	//@Id
   //@GeneratedValue(strategy = GenerationType.AUTO)
   //@Column(name ="id")
   private Long id;

    public SAV() {
    }

    public SAV(String nom, String prenom, String adress, String email, String telephone, String username, String password, Long id, Role role) {
        super(nom, prenom, adress, email, telephone, username, password,role);
        this.id = id;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
    

}
