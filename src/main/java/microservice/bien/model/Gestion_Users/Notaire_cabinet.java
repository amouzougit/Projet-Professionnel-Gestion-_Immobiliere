package microservice.bien.model.Gestion_Users;

import microservice.bien.model.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="notaire_cabinet")
public class Notaire_cabinet extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private Integer id;
    
    
    @ManyToOne
    @JoinColumn(name ="id_cabinet",nullable = false)
    private Cabinet cabinet;
    
    @ManyToOne
    @JoinColumn(name ="id_notaire",nullable = false)
    private Notaire notaire;



    @Column(name = "date_debut", nullable = false)
    protected String date_debut;

    @Column(name = "date_fin", nullable = true)
    private Date date_fin;

    @Column(name = "status", nullable = false)
    private Boolean status;
    
    public Notaire_cabinet() {
    	
    }

	public Notaire_cabinet(Integer id, Cabinet cabinet, Notaire notaire, String date_debut, Date date_fin,
			Boolean status) {
		super();
		this.id = id;
		this.cabinet = cabinet;
		this.notaire = notaire;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cabinet getCabinet() {
		return cabinet;
	}

	public void setCabinet(Cabinet cabinet) {
		this.cabinet = cabinet;
	}

	public Notaire getNotaire() {
		return notaire;
	}

	public void setNotaire(Notaire notaire) {
		this.notaire = notaire;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
    
    

}
