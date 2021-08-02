package microservice.bien.model.Gestion_Immobilier;

import microservice.bien.model.BaseEntity;
import microservice.bien.model.Gestion_Immobilier.Pays;
import microservice.bien.model.Gestion_Immobilier.Quartier;

import javax.persistence.*;
import java.util.List;
@Entity
public class Ville extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ville")
    private Integer id_ville;

    @ManyToOne
    @JoinColumn(name="id_pays", nullable = false)
    private Pays pays;

  

    @Column(name = "libelle", nullable = false)
    private String libelle;

    @Column(name = "code", nullable = false)
    private String code;

    public Ville(){

    }

    public Ville(Integer id_ville, String libelle, String code, Pays pays) {
        this.id_ville = id_ville;
        this.libelle = libelle;
        this.code = code;
        this.pays = pays;
    }
    public Integer getId_ville() {
        return id_ville;
    }

    public void setId_ville(Integer id_ville) {
        this.id_ville = id_ville;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

	/*public List<Quartier> getQuartier() {
		return quartier;
	}

	public void setQuartier(List<Quartier> quartier) {
		this.quartier = quartier;
	}
	*/

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}
    
    
}
