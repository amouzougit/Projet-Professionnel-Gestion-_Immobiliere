package microservice.bien.controller.Gestion_Immobilier;


import microservice.bien.model.Gestion_Immobilier.Pays;
import microservice.bien.service.Gestion_Immobilier.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//@CrossOrigin("*")
@RequestMapping("/service/pays")
@RestController
public class PaysController {

    @Autowired
    @Qualifier(value ="paysService")
    private PaysService paysService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody public Pays save(@RequestBody Pays pays)
    {
        try{
            pays = this.paysService.save(pays);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return pays;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List< Pays> saveAll(@RequestBody List<Pays> pays) {
        try {
            pays = this.paysService.saveAll(pays);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return pays;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Pays> getAll()
    {
        List< Pays> lespays = new ArrayList<>();

        try {
            lespays = this.paysService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lespays;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Pays pays)
    {
        Boolean result = false;

        try {
            this.paysService.delete(pays);
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
            this.paysService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
}
