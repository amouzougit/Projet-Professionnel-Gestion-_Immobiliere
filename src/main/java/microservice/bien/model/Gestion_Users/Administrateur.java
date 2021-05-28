package microservice.bien.model.Gestion_Users;

import javax.persistence.*;
@Entity
@Table(name="administrateur")
public class Administrateur extends Personne{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
   private Integer id;

    public Administrateur() {

    }

    public Administrateur(String nom, String prenom, String adress, String email, String telephone, String password, Integer id,String username) {
        super(nom, prenom, adress, email, telephone,username,password);
        this.id = id;
    }
    

}
