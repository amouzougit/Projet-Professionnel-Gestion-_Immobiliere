package microservice.bien.model.Gestion_Achat_Location;

import microservice.bien.model.BaseEntity;

import javax.persistence.*;

@Entity
public class Type_Operation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_type_operation;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String  libelle;


    public Type_Operation(){

    }


    public Type_Operation(Integer id_type_operation, String code, String libelle) {
        this.id_type_operation = id_type_operation;
        this.code = code;
        this.libelle = libelle;
    }

    public Integer getId_type_operation() {
        return id_type_operation;
    }

    public void setId_type_operation(Integer id_type_operation) {
        this.id_type_operation = id_type_operation;
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
