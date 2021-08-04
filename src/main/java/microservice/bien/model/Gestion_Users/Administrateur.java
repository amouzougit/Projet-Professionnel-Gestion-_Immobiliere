package microservice.bien.model.Gestion_Users;

import javax.persistence.*;
@Entity
@Table(name="administrateur")
public class Administrateur extends Personne{
   // @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id")
   private Long id;

    public Administrateur() {

    }

    public Administrateur(String nom, String prenom, String adress, String email, String telephone, String password,String username,Role role,Long id) {
        super(nom, prenom, adress, email, telephone,username,password,role);
        this.id = id;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
    


    
    

}
