package microservice.bien.controller.Gestion_Users;


import microservice.bien.model.Gestion_Users.Administrateur;
import microservice.bien.model.Gestion_Users.Agent_Immobiliere;
import microservice.bien.service.Gestion_Users.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/service/administrateur")
public class AdministrateurController {

    @Autowired
    //@Qualifier(value ="administrateurService")
    private AdministrateurService administrateurService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Administrateur save(@RequestBody Administrateur administrateur)
    {
        try{
            administrateur = this.administrateurService.save(administrateur);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return administrateur;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List<Administrateur> saveAll(@RequestBody List<Administrateur> administrateurs) {
        try {
            administrateurs = this.administrateurService.saveAll(administrateurs);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return administrateurs;

    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Administrateur> getAll()
    {
        List<Administrateur> admins = new ArrayList<>();

        try {
            admins = this.administrateurService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return admins;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Administrateur administrateur)
    {
        Boolean result = false;

        try {
            this.administrateurService.delete(administrateur);
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
            this.administrateurService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Administrateur update(@RequestBody Administrateur administrateurObj) {
    	administrateurService.save(administrateurObj);
    	return administrateurObj;
 }

}
