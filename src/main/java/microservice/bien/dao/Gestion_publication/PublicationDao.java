package microservice.bien.dao.Gestion_publication;

import microservice.bien.model.Gestion_Immobilier.Type_Bien;
import microservice.bien.model.Gestion_publication.Publication;
import microservice.bien.model.Gestion_publication.Type_Publication;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("publicationDao")
public interface PublicationDao extends JpaRepository<Publication,Long> {
	
	
//	@Query(value ="SELECT p from publication p WHERE p.bien.typeBien = :typeBien AND p.status = true")
//	public List<Type_Bien> getByTypeBien(Type_Bien typeBien);
//	
//	@Query(value ="SELECT p from publication p WHERE p.typepublication = :typepublication ")
//	public List<Publication> findByTypePublication(Type_Publication typepublication);

	
	//@Query( nativeQuery = true, value ="SELECT * from Publication p WHERE p.status = 1 order by p.createdDate desc limit 6")
	// List<Publication> lastSixPublications(@Param("number") Integer number, Pageable pageable);


	//public List<Publication> lastSixPublications(Integer number, PageRequest of);
	
	



}
