package microservice.bien.model.Gestion_Achat_Location;

import microservice.bien.model.BaseEntity;
import microservice.bien.model.Gestion_publication.Publication;
import microservice.bien.model.Gestion_publication.Type_Publication;

import javax.persistence.*;
import java.util.List;

@Entity
public class Operation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_operation")
    private Integer id_operation;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String libelle;


    @Column(name = "montant", nullable = false)
    private Double montant;



    @ManyToOne
    @JoinColumn(name="id_publication", nullable = false)
    private Publication publication;

    /*
    @OneToMany(mappedBy="operation", fetch=FetchType.EAGER)
    private List<Document_Operation> document_operations;


    @OneToMany(mappedBy="operation", fetch=FetchType.EAGER)
    private List<Transaction> transactions;
    */


    public Operation ()
    {

    }

    public Operation(Integer id_operation, String code, Double montant,String libelle) {
        this.id_operation = id_operation;
        this.code = code;
        this.montant = montant;
        this.libelle = libelle;
    }

    public Integer getId_operation() {
        return id_operation;
    }

    public void setId_operation(Integer id_operation) {
        this.id_operation = id_operation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}
