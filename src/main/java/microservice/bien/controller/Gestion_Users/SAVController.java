package microservice.bien.controller.Gestion_Users;


import microservice.bien.model.Gestion_Immobilier.Caracteristique_Bien;
import microservice.bien.model.Gestion_Users.SAV;
import microservice.bien.service.Gestion_Users.SAVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/service/sav")
public class SAVController {

    @Autowired
    //@Qualifier(value ="clientService")
    private SAVService savService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public SAV save(@RequestBody SAV sav)
    {
        try{
            sav = this.savService.save(sav);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return sav;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List<SAV> saveAll(@RequestBody List<SAV> savs) {
        try {
            savs = this.savService.saveAll(savs);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return savs;

    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< SAV> getAll()
    {
        List<SAV> leSav = new ArrayList<>();

        try {
            leSav = this.savService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return leSav;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  SAV sav)
    {
        Boolean result = false;

        try {
            this.savService.delete(sav);
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
            this.savService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    
    @PutMapping("/{id}/update")
    public SAV update(@RequestBody SAV savObj) {
    	savService.save(savObj);
    	return savObj;
    
	}



}
