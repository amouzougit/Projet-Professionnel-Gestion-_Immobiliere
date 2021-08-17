package microservice.bien.controller.Gestion_publication;

import microservice.bien.model.Gestion_publication.Type_Publication;
import microservice.bien.service.Gestion_publication.Type_PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping(value="/service/type_publication")
public class Type_PublicationController {

    @Autowired
    //@Qualifier(value ="type_publicationService")
    private Type_PublicationService type_publicationService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Type_Publication save(@RequestBody Type_Publication type_publication)
    {
        try{
            type_publication = this.type_publicationService.save(type_publication);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return type_publication;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List< Type_Publication> saveAll(@RequestBody List<Type_Publication> type_publications) {
        try {
            type_publications = this.type_publicationService.saveAll(type_publications);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return type_publications;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Type_Publication> getAll()
    {
        List< Type_Publication> lesTypesPublication= new ArrayList<>();

        try {
            lesTypesPublication = this.type_publicationService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lesTypesPublication;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Type_Publication type_publication)
    {
        Boolean result = false;

        try {
            this.type_publicationService.delete(type_publication);
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
            this.type_publicationService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Type_Publication update(@RequestBody Type_Publication type_publicationObj) {
    	type_publicationService.save(type_publicationObj);
    	return type_publicationObj;
    }
    
    
}
