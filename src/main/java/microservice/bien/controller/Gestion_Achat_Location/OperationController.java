package microservice.bien.controller.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Operation;
import microservice.bien.service.Gestion_Achat_Location.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value="/service/operation")
public class OperationController {

    @Autowired
    //@Qualifier(value ="operationService")
    private OperationService operationService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public  Operation save(@RequestBody  Operation operation)
    {
        try{
            operation = this.operationService.save(operation);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return operation;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List< Operation> saveAll(@RequestBody List<Operation> operations) {
        try {
            operations = this.operationService.saveAll(operations);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return operations;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Operation> getAll()
    {
        List< Operation> operation = new ArrayList<>();

        try {
            operation = this.operationService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return operation;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Operation operation)
    {
        Boolean result = false;

        try {
            this.operationService.delete(operation);
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
            this.operationService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
}
