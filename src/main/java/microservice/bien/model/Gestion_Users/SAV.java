package microservice.bien.model.Gestion_Users;

import javax.persistence.*;

@Entity
@Table(name ="sav")
public class SAV extends Personne{
	@Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name ="id")
   private Integer id;

    public SAV() {
    }

    public SAV(String nom, String prenom, String adress, String email, String telephone, String username, String password, Integer id) {
        super(nom, prenom, adress, email, telephone, username, password);
       this.id = id;
    }

}
