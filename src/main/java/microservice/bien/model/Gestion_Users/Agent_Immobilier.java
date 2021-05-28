package microservice.bien.model.Gestion_Users;

import microservice.bien.model.Gestion_Immobilier.Bien;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="agent_Immobilier")
public class Agent_Immobilier extends Personne{
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = true)
    private Integer id;

    public Agent_Immobilier() {

    }

    public Agent_Immobilier(Integer id) {
       this.id = id;

    }
    

    /*@OneToMany(mappedBy="agent_immobilier", fetch= FetchType.EAGER)
    private List<Bien> biens;
    */

    public Agent_Immobilier(String nom, String prenom, String adress, String email, String telephone, String password, Integer id, String username) {
        super(nom, prenom, adress, email, telephone,username,password);
        this.id = id;

    }

    
 


}
