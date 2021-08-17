package microservice.bien.controller.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Type_Bien;
import microservice.bien.service.Gestion_Immobilier.Type_BienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/service/type_bien")
public class Type_BienController {

    @Autowired
    //@Qualifier(value ="type_bienService")
    private Type_BienService type_bienService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Type_Bien save(@RequestBody Type_Bien type_bien)
    {
        try{
            type_bien = this.type_bienService.save(type_bien);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return type_bien;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List< Type_Bien> saveAll(@RequestBody List<Type_Bien> type_biens) {
        try {
            type_biens = this.type_bienService.saveAll(type_biens);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return type_biens;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Type_Bien> getAll()
    {
        List< Type_Bien> lesTypesBiens = new ArrayList<>();

        try {
            lesTypesBiens = this.type_bienService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lesTypesBiens;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Type_Bien type_bien)
    {
        Boolean result = false;

        try {
            this.type_bienService.delete(type_bien);
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
            this.type_bienService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Type_Bien update(@RequestBody Type_Bien type_bienObj) {
    	type_bienService.save(type_bienObj);
    	return type_bienObj;
    }
}
