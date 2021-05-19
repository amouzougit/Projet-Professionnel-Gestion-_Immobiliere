package microservice.bien.controller.Gestion_Immobilier;


import microservice.bien.model.Gestion_Immobilier.Ville;
import microservice.bien.service.Gestion_Immobilier.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin("*")
@RequestMapping("/service/ville")
public class VilleController {

    @Autowired
    //@Qualifier(value ="villeService")
    private VilleService villeService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Ville save(@RequestBody Ville ville)
    {
        try{
            ville = this.villeService.save(ville);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return ville;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List< Ville> saveAll(@RequestBody List<Ville> villes) {
        try {
            villes = this.villeService.saveAll(villes);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return villes;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Ville> getAll()
    {
        List< Ville> lesVilles = new ArrayList<>();

        try {
            lesVilles = this.villeService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lesVilles;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Ville ville)
    {
        Boolean result = false;

        try {
            this.villeService.delete(ville);
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
            this.villeService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
}
