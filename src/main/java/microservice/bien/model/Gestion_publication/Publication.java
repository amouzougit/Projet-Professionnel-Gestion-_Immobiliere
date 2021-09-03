package microservice.bien.model.Gestion_publication;

import microservice.bien.model.BaseEntity;
import microservice.bien.model.Gestion_Achat_Location.Operation;
import microservice.bien.model.Gestion_Immobilier.Bien;

import javax.persistence.*;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Entity
public class Publication extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publication", nullable = false, unique = true)
    private Long id_publication;

    @ManyToOne
    @JoinColumn(name="id_bien", nullable = false)
    private Bien bien;

    @ManyToOne
    @JoinColumn(name="id_type_publication", nullable = false)
    private Type_Publication type_publication;


    @Column(name = "date_publication", nullable = false)
    private Date date_publication = new Date();

    @Column(name = "status", nullable = false)
    private Boolean status ;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "montant", nullable = false)
    private Double montant;
    
    @Column(name = "description", nullable = false)
    private String description;
    
    @Column(name = "image", nullable = false)
    private String image;


    public Publication(){

    }

    public Publication(String image, String description,Long id_publication, Bien bien, Date date_publication, Double location_vente, Boolean status, String code,Double montant) {
        this.id_publication = id_publication;
        this.bien = bien;
        this.date_publication = date_publication;
        this.status = status;
        this.code = code;
        this.montant = montant;
        this.description = description;
        this.image = image;
    }

    public Long getId_publication()
    {
        return id_publication;
    }

    public void setId_publication(Long id_publication) {
        this.id_publication = id_publication;
    }

    public Date getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(Date date_publication) {
        this.date_publication = date_publication;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

	public Bien getBien() {
		return bien;
	}

	public void setBien(Bien bien) {
		this.bien = bien;
	}

	public Type_Publication getType_publication() {
		return type_publication;
	}

	public void setType_publication(Type_Publication type_publication) {
		this.type_publication = type_publication;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Publication [id_publication=" + id_publication + ", bien=" + bien + ", type_publication="
				+ type_publication + ", date_publication=" + date_publication + ", status=" + status + ", code=" + code
				+ ", montant=" + montant + ", description=" + description + "]";
	}
	
	
    
}

