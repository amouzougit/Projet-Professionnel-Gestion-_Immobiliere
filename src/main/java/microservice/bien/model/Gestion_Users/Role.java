package microservice.bien.model.Gestion_Users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import microservice.bien.model.BaseEntity;

@Entity
public class Role extends BaseEntity{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id_role")
	private Integer id_role;
	
	@Column(name = "code", nullable = false)
	private String code;
	
	@Column(name = "libelle", nullable = false)
	private String libelle;
	
	public Role() {
		
	}

	public Role(Integer id_role, String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
		this.id_role = id_role;
	}

	public Integer getIdRole() {
		return id_role;
	}

	public void setIdRole(Integer id_role) {
		this.id_role = id_role;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	

	
	

}
