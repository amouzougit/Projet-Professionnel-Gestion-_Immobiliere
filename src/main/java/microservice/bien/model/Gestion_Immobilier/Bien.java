package microservice.bien.model.Gestion_Immobilier;

import microservice.bien.model.BaseEntity;
import microservice.bien.model.Gestion_Users.Agent_Immobilier;
import microservice.bien.model.Gestion_Users.Demarcheur;
import microservice.bien.model.Gestion_Users.Proprietaire;
import microservice.bien.model.Gestion_publication.Publication;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
public class Bien extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bien",nullable=false)
    private Long id_bien;
    
    @OneToOne
    @JoinColumn(name = "type_bien_fk")
    private Type_Bien type_bien;
    
    @ManyToOne
    @JoinColumn(name ="id_quartier",nullable = false)
    private Quartier quartier;

    @ManyToOne
    @JoinColumn(name ="id_demarcheur",nullable = true)
    private Demarcheur demarcheur;
    

    @ManyToOne
    @JoinColumn(name ="id_agent_immobilier",nullable = true)
    private Agent_Immobilier agent_immobilier;


    @ManyToOne
    @JoinColumn(name ="id_proprietaire",nullable = true)
    private Proprietaire proprietaire;

    @Column(name = "code", nullable = false, unique = false)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String libelle;

    @Column(name = "date_ajout", nullable = false)
    private Date date_ajout = new Date();

    @Column(name = "surface", nullable = false)
    private Float surface;


    @Column(name = "disponibilite", nullable = false)
    private Boolean disponibilite;

    @Column(name = "latitude", nullable = false)
    private int latitude;

    @Column(name = "longitude", nullable = false)
    private int longitude;

    @Column(name = "statuts", nullable = false)
    private Boolean statuts;

    @Column(name = "certificat", nullable = false)
    private String certificat;
    
    @Column(name = "prix", nullable = false)
    private String prix;

    public Bien()
    {

    }

    public Bien(Long id_bien, String code, String libelle, Date date_ajout, Float surface, Boolean disponibilite, Boolean statuts, String certificat,int latitude,int longitude, Agent_Immobilier agent_immobilier,Type_Bien type_bien,Demarcheur demarcheur,Proprietaire proprietaire,Quartier quartier,String prix) {
        this.id_bien = id_bien;
        this.code = code;
        this.libelle = libelle;
        this.date_ajout = date_ajout;
        this.surface = surface;
        this.disponibilite = disponibilite;
        this.latitude = latitude;
        this.longitude = longitude;
        this.statuts = statuts;
        this.certificat = certificat;
        this.agent_immobilier = agent_immobilier;
        this. type_bien = type_bien;
        this.demarcheur = demarcheur;
        this.proprietaire = proprietaire;
        this.quartier = quartier;
        this.prix = prix;


    }
    
    public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public Long getId_bien() {
        return id_bien;
    }

    public void setId_bien(Long id_bien) {
        this.id_bien = id_bien;
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

    public Date getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(Date date_ajout) {
        this.date_ajout = date_ajout;
    }

    public Float getSurface() {
        return surface;
    }

    public void setSurface(Float surface) {
        this.surface = surface;
    }

    public Boolean getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public Boolean getStatuts() {
        return statuts;
    }

    public void setStatuts(Boolean statuts) {
        this.statuts = statuts;
    }

    public String getCertificat() {
        return certificat;
    }

    public void setCertificat(String certificat) {
        this.certificat = certificat;
    }
    

    public Type_Bien getType_bien() {
		return type_bien;
	}

	public void setType_bien(Type_Bien type_bien) {
		this.type_bien = type_bien;
	}

	public Quartier getQuartier() {
		return quartier;
	}

	public void setQuartier(Quartier quartier) {
		this.quartier = quartier;
	}

	public Demarcheur getDemarcheur() {
		return demarcheur;
	}

	public void setDemarcheur(Demarcheur demarcheur) {
		this.demarcheur = demarcheur;
	}
	

	public Agent_Immobilier getAgent_immobilier() {
		return agent_immobilier;
	}

	public void setAgent_immobilier(Agent_Immobilier agent_immobilier) {
		this.agent_immobilier = agent_immobilier;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	@Override
    public String toString() {
        return "Bien{" +
                "id_bien=" + id_bien +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", date_ajout=" + date_ajout +
                ", surface=" + surface +
                ", disponibilite=" + disponibilite +

                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", statuts=" + statuts +
                 ", prix=" + prix +
                ", certificat='" + certificat + '\'' +

                '}';
    }
}
