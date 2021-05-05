package microservice.bien.model.Gestion_Immobilier;


import microservice.bien.model.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Quartier extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_quartier")
    private Long id_quartier;


    @ManyToOne
    @JoinColumn(name ="id_ville",nullable = false)
    private Ville ville;


    @OneToMany(mappedBy="quartier", fetch=FetchType.EAGER)
    private List<Bien> biens;
    
    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String libelle;




    public Quartier(){

    }

    public Quartier(Long id_quartier, Ville ville, String code, String libelle) {
        this.id_quartier = id_quartier;
        this.ville = ville;
        this.code = code;
        this.libelle = libelle;
    }

    public Long getId_quartier() {
        return id_quartier;
    }

    public void setId_quartier(Long id_quartier) {
        this.id_quartier = id_quartier;
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
