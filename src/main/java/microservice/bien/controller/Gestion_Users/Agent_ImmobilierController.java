package microservice.bien.controller.Gestion_Users;


import microservice.bien.model.Gestion_Users.Agent_Immobilier;
import microservice.bien.service.Gestion_Users.Agent_ImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@CrossOrigin("*")
@RequestMapping(value="/sevice/agentImmobilier")
public class Agent_ImmobilierController {

    @Autowired
    //@Qualifier(value ="agentImmobilierService")
    private Agent_ImmobilierService agent_immobilierService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Agent_Immobilier save(@RequestBody Agent_Immobilier agent_immobilier)
    {
        try{
            agent_immobilier = this.agent_immobilierService.save(agent_immobilier);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return agent_immobilier;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List<Agent_Immobilier> saveAll(@RequestBody List<Agent_Immobilier> agent_immobiliers) {
        try {
            agent_immobiliers = this.agent_immobilierService.saveAll(agent_immobiliers);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return agent_immobiliers;

    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Agent_Immobilier> getAll()
    {
        List<Agent_Immobilier> lesAgents = new ArrayList<>();

        try {
            lesAgents = this.agent_immobilierService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lesAgents;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Agent_Immobilier agent_immobilier)
    {
        Boolean result = false;

        try {
            this.agent_immobilierService.delete(agent_immobilier);
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
            this.agent_immobilierService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
}
