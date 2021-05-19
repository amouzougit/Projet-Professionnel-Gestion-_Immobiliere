package microservice.bien.controller.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Document_Transaction;
import microservice.bien.service.Gestion_Achat_Location.Document_TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/service/documenttransaction")
public class Document_TransactionController {

    @Autowired
    //@Qualifier(value ="document_operationService")
    private Document_TransactionService document_transactionService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Document_Transaction save(@RequestBody Document_Transaction document_transaction)
    {
        try{
            document_transaction = this.document_transactionService.save(document_transaction);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return document_transaction;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List<Document_Transaction> saveAll(@RequestBody List<Document_Transaction> document_transactions) {
        try {
            document_transactions = this.document_transactionService.saveAll(document_transactions);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return document_transactions;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List<Document_Transaction> getAll()
    {
        List<Document_Transaction> documents_transactions = new ArrayList<>();

        try {
            documents_transactions = this.document_transactionService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return documents_transactions;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody Document_Transaction document_transaction)
    {
        Boolean result = false;

        try {
            this.document_transactionService.delete(document_transaction);
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
            this.document_transactionService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
}
