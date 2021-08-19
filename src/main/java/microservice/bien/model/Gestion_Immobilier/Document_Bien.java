package microservice.bien.model.Gestion_Immobilier;

import microservice.bien.model.BaseEntity;

import javax.persistence.*;

@Entity
public class Document_Bien extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name ="id_document_bien")
    private Integer id_document_bien;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String libelle;

    @Column(name = "status", nullable = false)
    private Boolean status;
    
    
    @Column(name = "url", nullable = false)
    private String url;


    @ManyToOne
    @JoinColumn(name ="id_bien",nullable = false)
    private Bien bien;
    
    
    @ManyToOne
    @JoinColumn(name ="id_type_document",nullable = false)
    private TypeDocument typeDocument;
    


    public Document_Bien(){

    }

    public Document_Bien(TypeDocument typeDocument, String url, String code, String libelle, Boolean status, Bien bien) {
        this.code = code;
        this.libelle = libelle;
        this.status = status;
        this.bien = bien;
        this.url = url;
        this.typeDocument = typeDocument;
    }

    public Integer getId_document_bien() {
        return id_document_bien;
    }

    public void setId_document_bien(Integer id_document_bien) {
        this.id_document_bien = id_document_bien;
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

	public Bien getBien() {
		return bien;
	}

	public void setBien(Bien bien) {
		this.bien = bien;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public TypeDocument getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(TypeDocument typeDocument) {
		this.typeDocument = typeDocument;
	}
	
	
	
	
	
    
}
