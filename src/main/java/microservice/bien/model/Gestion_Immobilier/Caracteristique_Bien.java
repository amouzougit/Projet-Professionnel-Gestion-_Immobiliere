package microservice.bien.model.Gestion_Immobilier;

import microservice.bien.model.BaseEntity;

import javax.persistence.*;

@Entity
public class Caracteristique_Bien extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id_caracteristique_bien")
    private Integer id_caracteristique_bien;
    @Column(name = "nbre_chambre", nullable = false)
    private Integer nbre_chambre;

    @Column(name = "nbre_salon", nullable = false)
    private Integer nbre_salon;

    @Column(name = "nrbre_etage", nullable = false)
    private Integer nrbre_etage;

    @Column(name = "balcon", nullable = false)
    private String balcon;

    public Caracteristique_Bien(){

    }
    public Caracteristique_Bien(Integer id_caracteristique_bien, Integer nbre_chambre, Integer nbre_salon, Integer nrbre_etage, String balcon) {
        this.id_caracteristique_bien = id_caracteristique_bien;
        this.nbre_chambre = nbre_chambre;
        this.nbre_salon = nbre_salon;
        this.nrbre_etage = nrbre_etage;
        this.balcon = balcon;
    }

    public Integer getId_caracteristique_bien() {
        return id_caracteristique_bien;
    }

    public void setId_caracteristique_bien(Integer id_caracteristique_bien) {
        this.id_caracteristique_bien = id_caracteristique_bien;
    }

    public Integer getNbre_chambre() {
        return nbre_chambre;
    }

    public void setNbre_chambre(Integer nbre_chambre) {
        this.nbre_chambre = nbre_chambre;
    }

    public Integer getNbre_salon() {
        return nbre_salon;
    }

    public void setNbre_salon(Integer nbre_salon) {
        this.nbre_salon = nbre_salon;
    }

    public Integer getNrbre_etage() {
        return nrbre_etage;
    }

    public void setNrbre_etage(Integer nrbre_etage) {
        this.nrbre_etage = nrbre_etage;
    }

    public String getBalcon() {
        return balcon;
    }

    public void setBalcon(String balcon) {
        this.balcon = balcon;
    }
}
