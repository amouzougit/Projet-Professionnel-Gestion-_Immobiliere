package microservice.bien.controller.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Document_Operation;
import microservice.bien.model.Gestion_Users.Cabinet;
import microservice.bien.service.Gestion_Achat_Location.Document_OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//@CrossOrigin("*")
@RestController
@RequestMapping(value = "/service/documentOperation")
public class Document_OperationController {
	
    @Autowired
    //@Qualifier(value ="document_operationService")
    private Document_OperationService document_operationService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Document_Operation save(@RequestBody Document_Operation document_operation)
    {
        try{
            document_operation = this.document_operationService.save(document_operation);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return document_operation;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List<Document_Operation> saveAll(@RequestBody List<Document_Operation> document_operations) {
        try {
            document_operations = this.document_operationService.saveAll(document_operations);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return document_operations;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List<Document_Operation> getAll()
    {
        List<Document_Operation> document_operations = new ArrayList<>();

        try {
            document_operations = this.document_operationService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return document_operations;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody Document_Operation document_operation)
    {
        Boolean result = false;

        try {
            this.document_operationService.delete(document_operation);
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
            this.document_operationService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
	@PutMapping("/{id}/update")
    public Document_Operation update(@RequestBody Document_Operation document_operationObj) {
		document_operationService.save(document_operationObj);
    	return document_operationObj;
    
	}

}
