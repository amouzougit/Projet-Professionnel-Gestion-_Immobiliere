package microservice.bien.controller.Gestion_Users;

import microservice.bien.model.Gestion_Users.Demarcheur;
import microservice.bien.model.Gestion_Users.Notaire_cabinet;
import microservice.bien.service.Gestion_Users.DemarcheurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value="/service/demarcheur")
public class DemarcheurController {

    @Autowired
    //@Qualifier(value ="demarcheurService")
    private DemarcheurService demarcheurService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Demarcheur save(@RequestBody Demarcheur demarcheur)
    {
        try{
            demarcheur = this.demarcheurService.save(demarcheur);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return demarcheur;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List<Demarcheur> saveAll(@RequestBody List<Demarcheur> demarcheurs) {
        try {
            demarcheurs = this.demarcheurService.saveAll(demarcheurs);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return demarcheurs;

    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Demarcheur> getAll()
    {
        List<Demarcheur> lesdemarcheurs = new ArrayList<>();

        try {
            lesdemarcheurs = this.demarcheurService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lesdemarcheurs;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Demarcheur demarcheur)
    {
        Boolean result = false;

        try {
            this.demarcheurService.delete(demarcheur);
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
            this.demarcheurService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
	@PutMapping("/{id}/update")
    public Demarcheur update(@RequestBody Demarcheur demarcheurObj) {
		demarcheurService.save(demarcheurObj);
    	return demarcheurObj;
 }
}
