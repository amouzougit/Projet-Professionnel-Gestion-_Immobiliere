package microservice.bien.controller.Gestion_Achat_Location;



import microservice.bien.model.Gestion_Achat_Location.Transaction;
import microservice.bien.service.Gestion_Achat_Location.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/service/transaction")
public class TransactionController {

    @Autowired
    //@Qualifier(value ="operationService")
    private TransactionService transactionService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody public Transaction save(@RequestBody Transaction transaction)
    {
        try{
            transaction = this.transactionService.save(transaction);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return transaction;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List<Transaction> saveAll(@RequestBody List<Transaction> transactions) {
        try {
            transactions = this.transactionService.saveAll(transactions);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return transactions;

    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Transaction> getAll()
    {
        List<Transaction> transactions = new ArrayList<>();

        try {
            transactions = this.transactionService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return transactions;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Transaction transaction)
    {
        Boolean result = false;

        try {
            this.transactionService.delete(transaction);
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
            this.transactionService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Transaction update(@RequestBody Transaction transactiontObj) {
    	transactionService.save(transactiontObj);
    	return transactiontObj;
    
	}


}

