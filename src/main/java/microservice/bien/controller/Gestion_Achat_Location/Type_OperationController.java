package microservice.bien.controller.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Type_Operation;

import microservice.bien.service.Gestion_Achat_Location.Type_OperationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value="/service/type_service")
public class Type_OperationController {

    @Autowired
    //@Qualifier(value ="operationService")
    private Type_OperationService  type_operationService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Type_Operation save(@RequestBody Type_Operation type_operation)
    {
        try{
            type_operation = this.type_operationService.save(type_operation);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return type_operation;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List< Type_Operation> saveAll(@RequestBody List<Type_Operation> type_operations) {
        try {
            type_operations = this.type_operationService.saveAll(type_operations);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return type_operations;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Type_Operation> getAll()
    {
        List< Type_Operation> type_operations = new ArrayList<>();

        try {
            type_operations = this.type_operationService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return type_operations;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Type_Operation type_operation)
    {
        Boolean result = false;

        try {
            this.type_operationService.delete(type_operation);
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
            this.type_operationService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Type_Operation update(@RequestBody Type_Operation type_operationObj) {
    	type_operationService.save(type_operationObj);
    	return type_operationObj;
    
	}
}
