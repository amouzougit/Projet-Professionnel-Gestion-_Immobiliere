package microservice.bien.model.Gestion_Achat_Location;

import javax.persistence.*;

import microservice.bien.model.BaseEntity;
import microservice.bien.model.Gestion_Users.Demarcheur;

@Entity
public class Document_Operation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_document_operation")
    private Integer id_document_operation;
    
    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String libelle;
    
    @ManyToOne
    @JoinColumn(name ="id_operation",nullable = false)
    private Operation operation;

    public Document_Operation(){

    }

    public Document_Operation(Integer id_document_operation, String code, String libelle) {
        this.id_document_operation = id_document_operation;
        this.code = code;
        this.libelle = libelle;
    }
    
    public Integer getId_document_operation() {
        return id_document_operation;
    }

    public void setId_document_operation(Integer id_document_operation) {
        this.id_document_operation = id_document_operation;
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
