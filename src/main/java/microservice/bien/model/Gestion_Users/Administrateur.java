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

    public Administrateur(String profil, String nom, String prenom, String adress, String email, String telephone, String password,String username,Role role,Long id) {
        super(profil, nom, prenom, adress, email, telephone,username,password,role);
        this.id = id;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Administrateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adress=" + adress + ", email="
				+ email + ", telephone=" + telephone + ", username=" + username + ", password=" + password
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastModifiedBy=" + lastModifiedBy
				+ ", lastModifiedDate=" + lastModifiedDate + ", getId()=" + getId() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getAdress()=" + getAdress() + ", getEmail()=" + getEmail()
				+ ", getTelephone()=" + getTelephone() + ", getUsername()=" + getUsername() + ", getPassword()="
				+ getPassword() + ", getRole()=" + getRole() + ", getIsVerified()=" + getIsVerified() + ", getProfil()="
				+ getProfil() + ", toString()=" + super.toString() + ", getCreatedBy()=" + getCreatedBy()
				+ ", getCreatedDate()=" + getCreatedDate() + ", getLastModifiedBy()=" + getLastModifiedBy()
				+ ", getLastModifiedDate()=" + getLastModifiedDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

	
	


	
	
	
    
    


    
    

}
