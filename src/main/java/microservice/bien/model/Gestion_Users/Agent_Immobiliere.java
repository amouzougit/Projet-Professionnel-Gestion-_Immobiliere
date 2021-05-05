package microservice.bien.model.Gestion_Users;

import java.util.Date;

import javax.persistence.*;

import microservice.bien.model.BaseEntity;

@Entity
@Table(name= "agent_immobiliere")
public class Agent_Immobiliere extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private Integer id;
    
   
    @Column(name = "date_debut", nullable = false)
    protected String date_debut;

    @Column(name = "date_fin", nullable = true)
    private Date date_fin;

    @Column(name = "status", nullable = false)
    private Boolean status;
    
    @ManyToOne
    @JoinColumn(name ="agent_Immobilier",nullable = false)
    private Agent_Immobilier agent_immobilier;
    
    @ManyToOne
    @JoinColumn(name ="agence_Immobiliere",nullable = false)
    private AgenceImmobiliere agenceImmobiliere;
    
    
    public Agent_Immobiliere() {
    	
    }


	public Agent_Immobiliere(Integer id, String date_debut, Date date_fin, Boolean status,
			Agent_Immobilier agent_immobilier, AgenceImmobiliere agenceImmobiliere) {
		super();
		this.id = id;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.status = status;
		this.agent_immobilier = agent_immobilier;
		this.agenceImmobiliere = agenceImmobiliere;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public Agent_Immobilier getAgent_immobilier() {
		return agent_immobilier;
	}


	public void setAgent_immobilier(Agent_Immobilier agent_immobilier) {
		this.agent_immobilier = agent_immobilier;
	}


	public AgenceImmobiliere getAgenceImmobiliere() {
		return agenceImmobiliere;
	}


	public void setAgenceImmobiliere(AgenceImmobiliere agenceImmobiliere) {
		this.agenceImmobiliere = agenceImmobiliere;
	}
	
}
