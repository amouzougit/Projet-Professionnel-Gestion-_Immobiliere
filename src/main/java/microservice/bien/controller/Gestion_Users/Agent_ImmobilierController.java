package microservice.bien.controller.Gestion_Users;


import microservice.bien.model.Gestion_Users.AgenceImmobiliere;
import microservice.bien.model.Gestion_Users.Agent_Immobilier;
import microservice.bien.model.Gestion_Users.Agent_Immobiliere;
import microservice.bien.service.Gestion_Users.AgenceImmobiliereService;
import microservice.bien.service.Gestion_Users.Agent_ImmobilierService;
import microservice.bien.service.Gestion_Users.Agent_ImmobiliereService;

import org.springframework.beans.factory.annotation.Autowired;
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
    
    
	@Autowired
	//@Qualifier(value ="agenceImmobiliereService")
	private AgenceImmobiliereService agenceImmobiliereService;
    

	@Autowired
	//@Qualifier(value ="agent_immobiliereServiceService")
	private Agent_ImmobiliereService agent_immobiliereService;

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
    
    @PutMapping("/{id}/update")
    public Agent_Immobilier update(@RequestBody Agent_Immobilier agent_immobilierObj) {
    	agent_immobilierService.save(agent_immobilierObj);
    	return agent_immobilierObj;
 }
    
    
	  @GetMapping("/findbyagenceimmobiliere/{agence_id}")
	   public List< Agent_Immobilier> findByAgenceImmobiliere(@PathVariable Integer agence_id) {
	    	
		   List<Agent_Immobiliere> agentimmobilieres = this.agent_immobiliereService.getAll();
		   
		   AgenceImmobiliere agenceimmobiliere = this.agenceImmobiliereService.getById(agence_id);
		   
		   List<Agent_Immobilier> agentimmobiliers = new ArrayList<Agent_Immobilier>();
		   
		   for(Agent_Immobiliere agentimmobiliere: agentimmobilieres) {
			   
			   if(agentimmobiliere.getAgenceImmobiliere().getId_agenceimmobiliere() == agenceimmobiliere.getId_agenceimmobiliere()) {
				   
				   agentimmobiliers.add(agentimmobiliere.getAgent_immobilier());
			   }
		   }
		   
		   return agentimmobiliers;
		   
		   
 
	    
	   
	 }
    
    
}
