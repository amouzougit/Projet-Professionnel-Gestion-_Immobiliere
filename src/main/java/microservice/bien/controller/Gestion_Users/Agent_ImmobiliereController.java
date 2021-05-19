package microservice.bien.controller.Gestion_Users;


import microservice.bien.model.Gestion_Users.Agent_Immobiliere;
import microservice.bien.service.Gestion_Users.Agent_ImmobiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value= "/service/agentImmobiliereService")
public class Agent_ImmobiliereController {

	@Autowired
	//@Qualifier(value ="agent_immobiliereServiceService")
	private Agent_ImmobiliereService agent_immobiliereService;

	@RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Agent_Immobiliere save(@RequestBody Agent_Immobiliere agentImmobiliere)
	{
		try{
			agentImmobiliere = this.agent_immobiliereService.save(agentImmobiliere);
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return agentImmobiliere;
	}

	@RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody public List<Agent_Immobiliere> saveAll(@RequestBody List<Agent_Immobiliere> agentImmobilieres) {
		try {
			agentImmobilieres = this.agent_immobiliereService.saveAll(agentImmobilieres);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return agentImmobilieres;

	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody public List< Agent_Immobiliere> getAll()
	{
		List<Agent_Immobiliere> lesAgencesImmobiliere = new ArrayList<>();

		try {
			lesAgencesImmobiliere = this.agent_immobiliereService.getAll();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return lesAgencesImmobiliere;
	}


	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
	@ResponseBody public Boolean delete(@RequestBody  Agent_Immobiliere agentImmobilieres)
	{
		Boolean result = false;

		try {
			this.agent_immobiliereService.delete(agentImmobilieres);
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
			this.agent_immobiliereService.deleteAll();
			result = true;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return result;
	}

}
