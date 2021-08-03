package microservice.bien.controller.Gestion_publication;


import microservice.bien.model.Gestion_Users.Agent_Immobiliere;
import microservice.bien.model.Gestion_publication.Publication;
import microservice.bien.service.Gestion_publication.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin("*")
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
}
