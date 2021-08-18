package microservice.bien.controller.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Bien;
import microservice.bien.model.Gestion_Immobilier.Document_Bien;
import microservice.bien.service.Gestion_Immobilier.BienService;
import microservice.bien.service.Gestion_Immobilier.Document_BienService;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping("/service/bien")
@CrossOrigin("*")
@RestController
public class BienController {

    @Autowired
    //@Qualifier(value ="bienService")
    private BienService bienService;
    
    @Autowired
    private Document_BienService document_BienService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody public Bien save(@RequestBody Bien bien)
    {
        try{
            bien = this.bienService.createBien(bien);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return bien;
    }
    

    @RequestMapping(value ="/document/ajout/{bien_id}", method = RequestMethod.POST)
    @ResponseBody public ResponseEntity<?> ajouter_document(
    		@PathVariable("bien_id") Long bien_id, 
    		@RequestParam("document_libelle") String document_libelle,
    		@RequestParam("file") MultipartFile file) throws IOException
    {
		/* try{ */
        	String location = "/static/files";
        	Resource resource = new ClassPathResource(location);
        	String url = resource.getURL().toString().substring(6);
        	System.out.println(url);
        	 Path rootLocation = Paths.get(url);
        	Bien  bien = this.bienService.getById(bien_id);
        	if(bien == null) {
        		ResponseEntity.badRequest().body("pas de bien trouver avec cet id");
        	}
        	
        	String file_name = UUID.randomUUID().toString();
        	
			Files.copy(file.getInputStream(), rootLocation.resolve(file_name));

			
			String document_url = "http://localhost:8095/service/bien/files/" + file_name;
        	
        	Document_Bien document_Bien = new Document_Bien(document_url,"code", document_libelle, true, bien);
        	
        	Document_Bien document_Bien_create = document_BienService.save(document_Bien);
        	
			return ResponseEntity.ok(document_Bien_create);

        }
    
    

	@GetMapping(value="/files/{filename:.+}",   produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public ResponseEntity<?> serveFile(@PathVariable String filename) {

	  	String location = "/static/files";
    	Resource r = new ClassPathResource(location);
    	String url;
		try {
			url = r.getURL().toString().substring(6);

	   	 	Path rootLocation = Paths.get(url);

			Path file = Paths.get(url+"/"+filename);
	    	System.out.println(file);
			Resource resource = new UrlResource(file.toUri());
			/*
			 * if(resource.exists() || resource.isReadable()) { return resource; }
			 */
			 InputStream in = getClass()
					      .getResourceAsStream("/com/baeldung/produceimage/image.jpg");
			byte[] bit =  IOUtils.toByteArray(resource.getInputStream());
			return ResponseEntity.ok().body(bit);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.badRequest().body(null);
			
		}
	}
    
    

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List< Bien> saveAll(@RequestBody List<Bien> biens) {
        try {
            biens = this.bienService.saveAll(biens);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return biens;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Bien> getAll()
    {
        List< Bien> lesbiens = new ArrayList<>();

        try {
            lesbiens = this.bienService.listBiens();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lesbiens;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Bien bien)
    {
        Boolean result = false;

        try {
            this.bienService.delete(bien);
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
            this.bienService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Bien update(@RequestBody Bien bienObj) {
    	bienService.createBien(bienObj);
    	return bienObj;
    }
    
   

}
