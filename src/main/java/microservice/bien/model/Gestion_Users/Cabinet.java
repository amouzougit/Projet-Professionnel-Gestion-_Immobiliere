package microservice.bien.model.Gestion_Users;

import microservice.bien.model.BaseEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cabinet  extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id_cabinet")
    private Integer id_cabinet;

    @Column(name = "nom_cabinet", nullable = false)
    private String nom_cabinet;
    
    @Column(name = "longitude", nullable = false)
    private Float longitude;
    
    @Column(name = "latitude", nullable = false)
    private Float latitude;

  /*  @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "notaire_cabinet",
            joinColumns = @JoinColumn(name = "id_cabinet", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_notaire", referencedColumnName = "id"))
    private Set<Notaire> notaires;
    */

    public Cabinet(Integer id_cabinet, String nom_cabinet, Float longitude, Float latitude) {
        this.id_cabinet = id_cabinet;
        this.nom_cabinet = nom_cabinet;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Cabinet(){

    }

    public Integer getId_cabinet() {
        return id_cabinet;
    }

    public void setId_cabinet(Integer id_cabinet) {
        this.id_cabinet = id_cabinet;
    }

    public String getNom_cabinet() {
        return nom_cabinet;
    }

    public void setNom_cabinet(String nom_cabinet) {
        this.nom_cabinet = nom_cabinet;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }
}
