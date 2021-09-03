package microservice.bien.controller.Gestion_publication;


import microservice.bien.model.Gestion_Immobilier.Bien;
import microservice.bien.model.Gestion_Immobilier.Document_Bien;
import microservice.bien.model.Gestion_Immobilier.TypeDocument;
import microservice.bien.model.Gestion_Immobilier.Type_Bien;
import microservice.bien.model.Gestion_publication.Publication;
import microservice.bien.service.Gestion_publication.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/service/publication")
public class PublicationController {

    @Autowired
    //@Qualifier(value ="publicationService")
    private PublicationService publicationService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Publication save(@RequestBody Publication publication)
    {
        try{
        	publication.setCode("code");
        	publication.setStatus(true);
        	publication.setCode(System.currentTimeMillis()+"");
            publication = this.publicationService.save(publication);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return publication;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List< Publication> saveAll(@RequestBody List<Publication> publications) {
        try {
            publications = this.publicationService.saveAll(publications);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return publications;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Publication> getAll()
    {
        List< Publication> lesPublication= new ArrayList<>();

        try {
            lesPublication = this.publicationService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lesPublication;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Publication publication)
    {
        Boolean result = false;

        try {
            this.publicationService.delete(publication);
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }

    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean deleteAll()
    {
        Boolean result = false;

        try {
            this.publicationService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Publication update(@RequestBody Publication publicationObj) {
    	publicationService.save(publicationObj);
    	return publicationObj;
 }
    
    @GetMapping("/search/{query}")
    public List<Publication> search(@PathVariable String query) {
    	List<Publication> publications = this.publicationService.getAll();
    	List<Publication> searchpublications = new ArrayList<Publication>();
    	
    	for(Publication publication:publications) {
    		
    		if(publication.getDescription().contains(query)) {
    			searchpublications.add(publication);
    		}
    		
    		
    	}

    	return searchpublications;
 }
   
    
//    @GetMapping("/search/{query}")
//    public List<Type_Bien> getByTypeBien(@PathVariable String query) {
//    	List<Publication> publications = this.publicationService.getAll();
//    	List<Publication> searchpublications = new ArrayList<Publication>();
//    	
//    	for(Publication publication:publications) {
//    		
//    		if(publication.getDescription().contains(query)) {
//    			searchpublications.add(publication);
//    		}
//    		
//    		
//    	}
//
//    	return searchpublications;
// }
   
    	
    	
    
    

    

    @GetMapping("/findbynumber/{number}")
    public List< Publication> findByNumber(@PathVariable Integer number) {
    	List< Publication> publications = this.publicationService.getAll();
    	
    	if(publications.size()>= number) {	
    		publications = publications.subList(
    			(this.publicationService.getAll().size()-1) - number, 			
    			this.publicationService.getAll().size()-1
    			);
    	}
    			
    	return publications;
 }
    
//    
//    @GetMapping("/lastSixPublications/{number}")
//    public List<Publication> lastSixPublications(@PathVariable Integer number) {
//    List<Publication> publications = new ArrayList<Publication>();
//    	
//    	 try {
//    		 publications = this.publicationService.lastSixPublications();
//             
//         } catch (Exception ex) {
//             System.out.println(ex.getMessage());
//         }
//
//         return publications;
//    	
//
//    			
// }
    
    
    @RequestMapping(value ="/image/ajout/{image_id}", method = RequestMethod.POST)
    @ResponseBody public ResponseEntity<?> ajouter_image(
    		@PathVariable("image_id") Long image_id, 
    		@RequestParam("file") MultipartFile file) throws IOException
    {
		/* try{ */
        	String location = "/static/files";
        	Resource resource = new ClassPathResource(location);
        	String url = resource.getURL().toString().substring(6);
        	System.out.println(url);
        	 Path rootLocation = Paths.get("E:\\Afe-Nyui\\MyApp\\MyApp\\src\\assets\\images\\document_image");
        	 
        	Publication publication = this.publicationService.getById(image_id);
        	if(publication == null) {
        		ResponseEntity.badRequest().body("pas de bien trouver avec cet id");
        	}
        	
        	String file_name = UUID.randomUUID().toString();
        	
			Files.copy(file.getInputStream(), rootLocation.resolve(file_name + file.getOriginalFilename()));
			
			publication.setImage(file_name  + file.getOriginalFilename());
			
			Publication update_publication = this.publicationService.save(publication);
			
			return ResponseEntity.ok(update_publication);

        }
    
    
    
    
    @RequestMapping(value ="/document/ajout/{id_publication}", method = RequestMethod.POST)
    @ResponseBody public ResponseEntity<?> ajouter_document(
    		@PathVariable("id_publication") Long id_publication, 
    		@RequestParam("document_libelle") String document_libelle,
    		@RequestParam("file") MultipartFile file) throws IOException
    {
		/* try{ */
        	String location = "/static/files";
        	Resource resource = new ClassPathResource(location);
        	String url = resource.getURL().toString().substring(6);
        	System.out.println(url);
        	 Path rootLocation = Paths.get("E:\\Afe-Nyui\\MyApp\\MyApp\\src\\assets\\images\\document_image");
        	 
        	Publication  publication = this.publicationService.getById(id_publication);
        	if(publication == null) {
        		ResponseEntity.badRequest().body("pas de publication trouver avec cet id");
        	}
        	
        	String type = file.getContentType();
        	
        	/*TypeDocument  typedocument = new TypeDocument("document typecode",type);
        	
        	TypeDocument typedocument_create = this.typedocumentService.save(typedocument);*/
        	
        	String file_name = UUID.randomUUID().toString();
        	
			Files.copy(file.getInputStream(), rootLocation.resolve(file_name + file.getOriginalFilename()));
        
			publication.setImage(file_name + file.getOriginalFilename());
			
			 publication = publicationService.save(publication);

			return ResponseEntity.ok(publication);
			
/*	Document_Bien document_Bien = new Document_Bien(typedocument_create, file_name + file.getOriginalFilename(),"code", document_libelle, true, bien);
        	
        	Document_Bien document_Bien_create = document_BienService.save(document_Bien);
        	
			return ResponseEntity.ok(document_Bien_create);*/

        }
    
    
    
}
