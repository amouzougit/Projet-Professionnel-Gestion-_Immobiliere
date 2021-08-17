package microservice.bien.model.Gestion_Immobilier;

import microservice.bien.model.BaseEntity;
import microservice.bien.model.Gestion_publication.Publication;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pays")
public class Pays extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_pays" )
    private Integer id_pays;

    @Column(name = "libelle", nullable = false)
    private String libelle;

    @Column(name = "code", nullable = false)
    private  String code;

    public Pays()
    {
    }

    public Pays(Integer id_pays, String code, String libelle) {
        this.id_pays = id_pays;
        this.libelle = libelle;
        this.code = code;

    }

    public Integer getId_pays() {
        return id_pays;
    }

    public void setId_pays(Integer id_pays) {
        this.id_pays = id_pays;
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
    
}
