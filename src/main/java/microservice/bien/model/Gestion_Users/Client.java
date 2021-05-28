package microservice.bien.model.Gestion_Users;

import javax.persistence.*;

@Entity
@Table(name ="client")
public class Client extends Personne {
    @Id
   @Column(name = "id")
    private Integer id;

    public Client()
    {
    }
    public Client(String nom, String prenom, String adress, String email, String telephone, String password, Integer id,String username) {
        super(nom, prenom, adress, email, telephone, password,username);
       this.id = id;
    }
    


}
