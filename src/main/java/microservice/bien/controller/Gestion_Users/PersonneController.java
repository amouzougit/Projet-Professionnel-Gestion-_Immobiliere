package microservice.bien.controller.Gestion_Users;

import microservice.bien.model.Gestion_Users.Personne;
import microservice.bien.service.Gestion_Users.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/service/personne")
public class PersonneController {

	@Autowired
	@Qualifier(value = "personneService")
	private PersonneService personneService;

	@RequestMapping(value = "/save", method= RequestMethod.POST,headers = "accept = application/json")
	@ResponseBody
	public Personne save(@RequestBody Personne personne)
	{
		try{
			personne = this.personneService.save(personne);
		}catch(Exception  ex){
			System.out.println(ex.getMessage());
		}
		return personne;

	}

	@RequestMapping(value = "saveAll",method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody public List<Personne> saveAll(@RequestBody List<Personne> personnes){
		try{
			personnes = this.personneService.saveAll(personnes);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return personnes;
	}

	@RequestMapping(value = "/delete",method = RequestMethod.DELETE,headers = "Accept = application/json")
	@ResponseBody public Boolean delete(@RequestBody Personne personne)
	{
		Boolean result = false;

		try{
			this.personneService.delete(personne);
			 result = true;
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return result;
	}
	@RequestMapping(value = "/deleteAll",method = RequestMethod.DELETE,headers = "Accept = application/json")
	@ResponseBody public Boolean deleteAll()
	{
		Boolean result = false;

		try {
			this.personneService.deleteAll();
			result = true;
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return result;
	}
	@RequestMapping(value="/getAll",method = RequestMethod.GET,headers = "Accept = application/json")
	@ResponseBody public List<Personne> getAll()
	{
		List<Personne> persons = new ArrayList<>();
		try {
				persons = this.personneService.getAll();
			} catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return persons;
	}



}
