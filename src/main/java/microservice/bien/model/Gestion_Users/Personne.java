package microservice.bien.model.Gestion_Users;

import microservice.bien.model.BaseEntity;
import javax.persistence.*;

@Entity
@Table(name= "personne")
@Inheritance(strategy=InheritanceType.JOINED)
public class Personne extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    protected Long id;

    @Column(name = "nom", nullable = false)
    protected String nom;

    @Column(name = "prenom", nullable = false)
    protected String prenom;

    @Column(name = "adress", nullable = false)
    protected String adress;

    @Column(name = "email", nullable = false, unique = true)
    protected String email;

    @Column(name = "telephone", nullable = false)
    protected String telephone;


    @Column(name = "username", nullable = false, unique = true)
    protected String username;


    @Column(name = "password", nullable = false)
    protected String password;
    
	@Column(name = "isVerified", nullable = false)
	private Boolean isVerified = false;
	
	@Column(name = "profil", nullable = false)
	private String profil ;
    
    
    @ManyToOne
    @JoinColumn(name ="id_role",nullable = false)
    private Role role;

    public Personne(){

    }

    public Personne(String profil, String nom, String prenom, String adress, String email, String telephone,String username,String password,Role role) {
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.username = username;
        this.role = role;
        this.profil = profil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	

	public Boolean getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}
	
	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	@Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profil='" + profil + '\'' +

                '}';

    }
}
