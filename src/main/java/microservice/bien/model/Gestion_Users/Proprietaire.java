package microservice.bien.model.Gestion_Users;

import microservice.bien.model.Gestion_Immobilier.Bien;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="proprietaire")
public class Proprietaire extends Personne{
   @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id",nullable = false)
    private Integer id;

    @OneToMany(mappedBy="proprietaire", fetch= FetchType.EAGER)
    private List<Bien> biens;

    public Proprietaire(){

    }
    public Proprietaire(String nom, String prenom, String adress, String email, String telephone, String password, Integer id,String username) {
        super(nom, prenom, adress, email, telephone,username,password);
       this.id = id;
    }
}

