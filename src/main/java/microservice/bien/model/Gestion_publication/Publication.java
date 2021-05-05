package microservice.bien.model.Gestion_publication;

import microservice.bien.model.BaseEntity;
import microservice.bien.model.Gestion_Achat_Location.Operation;
import microservice.bien.model.Gestion_Immobilier.Bien;

import javax.persistence.*;
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


    @OneToMany(mappedBy="publication", fetch=FetchType.EAGER)
    private List<Operation> operations;

    @Column(name = "date_publication", nullable = false)
    private Date date_publication;


    @Column(name = "status", nullable = false)
    private Boolean status ;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "montant", nullable = false)
    private Double montant;


    public Publication(){

    }

    public Publication(Long id_publication, Bien bien, Date date_publication, Double location_vente, Boolean status, String code,Double montant) {
        this.id_publication = id_publication;
        this.bien = bien;
        this.date_publication = date_publication;
        this.status = status;
        this.code = code;
        this.montant = montant;
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
}

