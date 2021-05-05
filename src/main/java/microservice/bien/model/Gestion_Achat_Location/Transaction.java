package microservice.bien.model.Gestion_Achat_Location;

import microservice.bien.model.BaseEntity;
import microservice.bien.model.Gestion_publication.Type_Publication;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transaction")
    private Integer id_transaction;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String libelle;

    @Column(name = "montant", nullable = false)
    private String montant;

    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name="id_operation", nullable = false)
    private Operation operation;


    @ManyToOne
    @JoinColumn(name="id_document_transaction", nullable = false)
    private Document_Transaction document_transaction;


    public Transaction(){

    }

    public Transaction(Integer id_transaction, String code, String libelle,String montant,Date date) {
        this.id_transaction = id_transaction;
        this.code = code;
        this.libelle = libelle;
        this.montant = montant;
        this.date = date;
    }

    public Integer getId_transaction() {
        return id_transaction;
    }

    public void setId_transaction(Integer id_transaction) {
        this.id_transaction = id_transaction;
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

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
