package microservice.bien.model.Gestion_Users;

import microservice.bien.model.BaseEntity;
import sun.security.krb5.internal.PAEncTSEnc;

import javax.persistence.*;

@Entity
public class    AgenceImmobiliere extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id_agenceimmobiliere")
    private Integer id_agenceimmobiliere;

    @Column(name ="nom_agence_immobiliere",nullable = false)
    private String nom_agence_immobiliere;

    @Column(name ="adress",nullable = false)
    private String adress;


    public AgenceImmobiliere(){}


    public AgenceImmobiliere(Integer id_agenceimmobiliere, String nom_agence_immobiliere, String adress) {
        this.id_agenceimmobiliere = id_agenceimmobiliere;
        this.nom_agence_immobiliere = nom_agence_immobiliere;
        this.adress = adress;
    }

    public Integer getId_agenceimmobiliere() {
        return id_agenceimmobiliere;
    }

    public void setId_agenceimmobiliere(Integer id_agenceimmobiliere) {
        this.id_agenceimmobiliere = id_agenceimmobiliere;
    }

    public String getNom_agence_immobiliere() {
        return nom_agence_immobiliere;
    }

    public void setNom_agence_immobiliere(String nom_agence_immobiliere) {
        this.nom_agence_immobiliere = nom_agence_immobiliere;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
