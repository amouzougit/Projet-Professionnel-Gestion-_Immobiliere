package microservice.bien.controller.Gestion_Users;


import microservice.bien.model.Gestion_Immobilier.Bien;
import microservice.bien.model.Gestion_Users.AgenceImmobiliere;
import microservice.bien.model.Gestion_Users.Agent_Immobilier;
import microservice.bien.service.Gestion_Users.AgenceImmobiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@CrossOrigin("*")
@RequestMapping(value = "/service/agenceimmobiliere")
public class AgenceImmobiliereController {

	@Autowired
	//@Qualifier(value ="agenceImmobiliereService")
	private AgenceImmobiliereService agenceImmobiliereService;

	@RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public AgenceImmobiliere save(@RequestBody AgenceImmobiliere agenceImmobiliere)
	{
		try{
			agenceImmobiliere = this.agenceImmobiliereService.save(agenceImmobiliere);
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return agenceImmobiliere;
	}

	@RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody public List<AgenceImmobiliere> saveAll(@RequestBody List<AgenceImmobiliere> agenceImmobilieres) {
		try {
			agenceImmobilieres = this.agenceImmobiliereService.saveAll(agenceImmobilieres);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return agenceImmobilieres;

	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody public List< AgenceImmobiliere> getAll()
	{
		List<AgenceImmobiliere> lesAgences = new ArrayList<>();

		try {
			lesAgences = this.agenceImmobiliereService.getAll();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return lesAgences;
	}


	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
	@ResponseBody public Boolean delete(@RequestBody  AgenceImmobiliere agenceImmobiliere)
	{
		Boolean result = false;

		try {
			this.agenceImmobiliereService.delete(agenceImmobiliere);
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
			this.agenceImmobiliereService.deleteAll();
			result = true;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return result;
	}
	
	  @PutMapping("/{id}/update")
	    public AgenceImmobiliere update(@RequestBody AgenceImmobiliere agenceimmobiliereObj) {
		  agenceImmobiliereService.save(agenceimmobiliereObj);
	    	return agenceimmobiliereObj;
	 }
	  

	  
	  

}
