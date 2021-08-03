package microservice.bien.controller.Gestion_Immobilier;


import microservice.bien.model.Gestion_Achat_Location.Type_Operation;
import microservice.bien.model.Gestion_Immobilier.Caracteristique_Bien;
import microservice.bien.service.Gestion_Immobilier.Caracteristique_BienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/service/caracteristiquebien")
//@CrossOrigin("*")
@RestController
public class Caracteristique_BienController {

    @Autowired
    //@Qualifier(value ="caracteristique_bienService")
    private Caracteristique_BienService caracteristique_bienService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Caracteristique_Bien save(@RequestBody Caracteristique_Bien caracteristique_bien)
    {
        try{
            caracteristique_bien = this.caracteristique_bienService.save(caracteristique_bien);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return caracteristique_bien;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List< Caracteristique_Bien> saveAll(@RequestBody List<Caracteristique_Bien> caracteristique_biens) {
        try {
            caracteristique_biens = this.caracteristique_bienService.saveAll(caracteristique_biens);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return caracteristique_biens;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Caracteristique_Bien> getAll()
    {
        List< Caracteristique_Bien> caracteristiqueDesBiens = new ArrayList<>();

        try {
            caracteristiqueDesBiens = this.caracteristique_bienService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return caracteristiqueDesBiens;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Caracteristique_Bien caracteristique_bien)
    {
        Boolean result = false;

        try {
            this.caracteristique_bienService.delete(caracteristique_bien);
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
            this.caracteristique_bienService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Caracteristique_Bien update(@RequestBody Caracteristique_Bien caracteristique_bienObj) {
    	caracteristique_bienService.save(caracteristique_bienObj);
    	return caracteristique_bienObj;
    
	}
}
