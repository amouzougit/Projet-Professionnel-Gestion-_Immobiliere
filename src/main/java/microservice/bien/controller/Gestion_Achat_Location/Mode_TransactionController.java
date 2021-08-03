package microservice.bien.controller.Gestion_Achat_Location;


import microservice.bien.model.Gestion_Achat_Location.Mode_Transaction;
import microservice.bien.model.Gestion_Immobilier.Pays;
import microservice.bien.service.Gestion_Achat_Location.Mode_TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/service/modetransaction")
public class Mode_TransactionController {

    @Autowired
    //@Qualifier(value ="mode_transactionService")
    private Mode_TransactionService mode_transactionService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Mode_Transaction save(@RequestBody Mode_Transaction mode_transaction)
    {
        try{
            mode_transaction = this.mode_transactionService.save(mode_transaction);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return mode_transaction;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List<Mode_Transaction> saveAll(@RequestBody List<Mode_Transaction> mode_transactions) {
        try {
            mode_transactions = this.mode_transactionService.saveAll(mode_transactions);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return mode_transactions;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List<Mode_Transaction> getAll()
    {
        List<Mode_Transaction> modes_transactions = new ArrayList<>();

        try {
            modes_transactions = this.mode_transactionService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return modes_transactions;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody Mode_Transaction document_transaction)
    {
        Boolean result = false;

        try {
            this.mode_transactionService.delete(document_transaction);
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
            this.mode_transactionService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Mode_Transaction update(@RequestBody Mode_Transaction mode_transactionObj) {
    	mode_transactionService.save(mode_transactionObj);
    	return mode_transactionObj;
    }
}
