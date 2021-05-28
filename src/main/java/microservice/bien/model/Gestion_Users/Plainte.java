package microservice.bien.model.Gestion_Users;

import microservice.bien.model.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="plainte")
public class Plainte  extends BaseEntity {
    @Id

    @Column(name ="id_plainte")
    private Integer id_plainte ;

    @Column(name = "code", nullable = false)
    protected String code;


    @Column(name = "objet", nullable = false)
    private String objet;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "personne_cible", nullable = false)
    private String personne_cible;

    @Column(name = "status", nullable = false)
    private Boolean status;


    public Plainte(){

    }

    public Plainte(Integer id_plainte, String code, String objet, String nom, String message, Date date, String personne_cible, Boolean status) {
        this.id_plainte = id_plainte;
        this.code = code;
        this.objet = objet;
        this.nom = nom;
        this.message = message;
        this.date = date;
        this.personne_cible = personne_cible;
        this.status = status;
    }

    public Integer getId_plainte() {
        return id_plainte;
    }

    public void setId_plainte(Integer id_plainte) {
        this.id_plainte = id_plainte;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPersonne_cible() {
        return personne_cible;
    }

    public void setPersonne_cible(String personne_cible) {
        this.personne_cible = personne_cible;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}
