package microservice.bien.model.Gestion_Achat_Location;

import microservice.bien.model.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Document_Transaction extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_document_transaction")
    private Integer id_document_transaction;
    
    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String libelle;

    @Column(name = "status", nullable = false)
    private Boolean status;

    /*
    @OneToMany(mappedBy="document_transaction", fetch=FetchType.EAGER)
    private List<Transaction> transactions;
    */


    public Document_Transaction(){

    }


    public Document_Transaction(Integer id_document_transaction, String code, String libelle, Boolean status) {
        this.id_document_transaction = id_document_transaction;
        this.code = code;
        this.libelle = libelle;
        this.status = status;
    }

    public Integer getId_document_transaction() {
        return id_document_transaction;
    }

    public void setId_document_transaction(Integer id_document_transaction) {
        this.id_document_transaction = id_document_transaction;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}
