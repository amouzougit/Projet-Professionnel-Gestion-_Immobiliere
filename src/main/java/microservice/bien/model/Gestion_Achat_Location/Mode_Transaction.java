package microservice.bien.model.Gestion_Achat_Location;

import microservice.bien.model.BaseEntity;

import javax.persistence.*;

@Entity
public class Mode_Transaction extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_mode_transaction")
    private Integer id_mode_transaction;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String libelle;

    @Column(name = "status", nullable = false)
    private Boolean status;



    public Mode_Transaction(){

    }

    public Mode_Transaction(Integer id_mode_transaction, String code, String libelle,Boolean status) {
        this.id_mode_transaction = id_mode_transaction;
        this.code = code;
        this.libelle = libelle;
        this.status = status;
    }

    public Integer getId_mode_transaction() {
        return id_mode_transaction;
    }

    public void setId_mode_transaction(Integer id_mode_transaction) {
        this.id_mode_transaction = id_mode_transaction;
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

    public void setStatus(String status) {
        this.libelle = status;
    }
}
