package microservice.bien.controller.Gestion_Users;


import microservice.bien.model.Gestion_Users.Client;
import microservice.bien.model.Gestion_Users.Demarcheur;
import microservice.bien.service.Gestion_Users.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/service/client")
public class ClientController {

    @Autowired
    //@Qualifier(value ="clientService")
    private ClientService clientService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Client save(@RequestBody Client client)
    {
        try{
            client = this.clientService.save(client);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return client;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List<Client> saveAll(@RequestBody List<Client> clients) {
        try {
            clients = this.clientService.saveAll(clients);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return clients;

    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Client> getAll()
    {
        List<Client> customer = new ArrayList<>();

        try {
            customer = this.clientService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return customer;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Client client)
    {
        Boolean result = false;

        try {
            this.clientService.delete(client);
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
            this.clientService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Client update(@RequestBody Client clientObj) {
    	clientService.save(clientObj);
    	return clientObj;
 }
}
