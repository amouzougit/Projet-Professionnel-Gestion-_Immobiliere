package microservice.bien.requete;



public class CreatePersonne {
  
	private String nom;

    private String prenom;

    private String adress;

    private String email;

    private String telephone;

    private String username;

    private String password;
    
    private Integer roleId;
    
    private String nom_cabinet;

    private String carte_identite;
    
	public CreatePersonne() {
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

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getNom_cabinet() {
		return nom_cabinet;
	}

	public void setNom_cabinet(String nom_cabinet) {
		this.nom_cabinet = nom_cabinet;
	}

	public String getCarte_identite() {
		return carte_identite;
	}

	public void setCarte_identite(String carte_identite) {
		this.carte_identite = carte_identite;
	}
	
	
	
	

}
