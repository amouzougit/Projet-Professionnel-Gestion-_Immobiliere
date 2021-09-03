package microservice.bien.model.Gestion_publication;

import microservice.bien.model.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Type_Publication extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id_type_publication")
    private Integer id_type_publication;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "libelle", nullable = false)
    private String libelle;
    
    
    @Column(name = "commentaires", nullable = false)
    private String commentaires;

    public Type_Publication()
    {
    }

    public Type_Publication(String commentaires, Integer id_type_publication, String code, String libelle) {
        this.id_type_publication = id_type_publication;
        this.code = code;
        this.libelle = libelle;
        this.commentaires = commentaires;
    }

    public Integer getId_type_publication() {
        return id_type_publication;
    }

    public void setId_type_publication(Integer id_type_publication) {
        this.id_type_publication = id_type_publication;
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

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

	@Override
	public String toString() {
		return "Type_Publication [id_type_publication=" + id_type_publication + ", code=" + code + ", libelle="
				+ libelle + ", commentaires=" + commentaires + "]";
	}
    
   
    
    
}
