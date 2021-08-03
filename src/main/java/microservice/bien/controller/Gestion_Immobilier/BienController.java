package microservice.bien.controller.Gestion_Immobilier;

import microservice.bien.model.Gestion_Achat_Location.Type_Operation;
import microservice.bien.model.Gestion_Immobilier.Bien;
import microservice.bien.model.Gestion_Immobilier.Caracteristique_Bien;
import microservice.bien.model.Gestion_Users.Role;
import microservice.bien.service.Gestion_Immobilier.BienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/service/bien")
//@CrossOrigin("*")
@RestController
public class BienController {

    @Autowired
    //@Qualifier(value ="bienService")
    private BienService bienService;

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
    	bienService.save(bienObj);
    	return bienObj;
    }
    
   

}
