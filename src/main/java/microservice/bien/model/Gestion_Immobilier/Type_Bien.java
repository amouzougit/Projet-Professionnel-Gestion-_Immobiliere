package microservice.bien.model.Gestion_Immobilier;

import microservice.bien.model.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Type_Bien extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_typeBien")
    private  Integer id_typeBien;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String libelle;

   /* @OneToMany(mappedBy="type_bien", fetch=FetchType.EAGER)
    private List<Bien> biens;
    */


    public Type_Bien(){

    }

    public Type_Bien(Integer id_typeBien, String code, String libelle) {
        this.id_typeBien = id_typeBien;
        this.code = code;
        this.libelle = libelle;
    }

    public Integer getId_typeBien() {
        return id_typeBien;
    }

    public void setId_typeBien(Integer id_typeBien) {
        this.id_typeBien = id_typeBien;
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

	/*public List<Bien> getBiens() {
		return biens;
	}

	public void setBiens(List<Bien> biens) {
		this.biens = biens;
	}
    */
}
