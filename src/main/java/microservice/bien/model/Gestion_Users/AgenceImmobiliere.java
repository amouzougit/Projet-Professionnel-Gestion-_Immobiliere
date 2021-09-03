package microservice.bien.model.Gestion_Users;

import microservice.bien.model.BaseEntity;
import sun.security.krb5.internal.PAEncTSEnc;

import javax.persistence.*;

@Entity
public class AgenceImmobiliere extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id_agenceimmobiliere")
    private Integer id_agenceimmobiliere;

    @Column(name ="nom_agence_immobiliere",nullable = false)
    private String nom_agence_immobiliere;

    @Column(name ="adress",nullable = false)
    private String adress;
    
    @Column(name ="logo",nullable = false)
    private String logo;
    
    @Column(name ="email",nullable = false)
    private String email;
    
    @Column(name ="code",nullable = false)
    private String code;
    
    @Column(name ="description",nullable = false)
    private String description;
    


    public AgenceImmobiliere(){}


    public AgenceImmobiliere(String description, String code, String email, Integer id_agenceimmobiliere, String nom_agence_immobiliere, String adress, String logo) {
        this.id_agenceimmobiliere = id_agenceimmobiliere;
        this.nom_agence_immobiliere = nom_agence_immobiliere;
        this.adress = adress;
        this.logo = logo;
        this.email = email;
        this.description = description;
        this.code = code;
    }

    public Integer getId_agenceimmobiliere()
    {
        return id_agenceimmobiliere;
    }

    public void setId_agenceimmobiliere(Integer id_agenceimmobiliere) {
        this.id_agenceimmobiliere = id_agenceimmobiliere;
    }

    public String getNom_agence_immobiliere() {
        return nom_agence_immobiliere;
    }

    public void setNom_agence_immobiliere(String nom_agence_immobiliere) {
        this.nom_agence_immobiliere = nom_agence_immobiliere;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
    
    
    
}
