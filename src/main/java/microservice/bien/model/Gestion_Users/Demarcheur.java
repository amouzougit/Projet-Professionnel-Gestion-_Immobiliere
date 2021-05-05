package microservice.bien.model.Gestion_Users;

import microservice.bien.model.Gestion_Immobilier.Bien;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="demarcheur")
public class Demarcheur  extends Personne{
   @Id
    @Column(name = "id",nullable = true)
    public Integer id;

    @OneToMany(mappedBy="demarcheur", fetch= FetchType.EAGER)
    private List<Bien> biens;

    public Demarcheur()
    {
    }
    public Demarcheur(String nom, String prenom, String adress, String email, String telephone, String password, Integer id,String username) {
        super(nom, prenom, adress, email, telephone,password,username);
        this.id = id;
    }
}
