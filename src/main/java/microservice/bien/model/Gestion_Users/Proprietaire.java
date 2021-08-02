package microservice.bien.model.Gestion_Users;

import microservice.bien.model.Gestion_Immobilier.Bien;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="proprietaire")
public class Proprietaire extends Personne{
   //@Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
   //@Column(name = "id",nullable = false)
    private Long id;

    @OneToMany(mappedBy="proprietaire", fetch= FetchType.EAGER)
    private List<Bien> biens;

    public Proprietaire(){

    }
    public Proprietaire(String nom, String prenom, String adress, String email, String telephone, String password, Long id,String username, Role role) {
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

