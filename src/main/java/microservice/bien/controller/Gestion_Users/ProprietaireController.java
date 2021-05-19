package microservice.bien.controller.Gestion_Users;

import microservice.bien.model.Gestion_Users.Proprietaire;
import microservice.bien.service.Gestion_Users.ProprietaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/service/proprietaire")
public class ProprietaireController {

	@Autowired
	//@Qualifier(value ="proprietaireService")
	private ProprietaireService proprietaireService;

	@RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Proprietaire save(@RequestBody Proprietaire proprietaire)
	{
		try{
			proprietaire = this.proprietaireService.save(proprietaire);
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return proprietaire;
	}

	@RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody public List<Proprietaire> saveAll(@RequestBody List<Proprietaire> proprietaires) {
		try {
			proprietaires = this.proprietaireService.saveAll(proprietaires);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return proprietaires;

	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody public List< Proprietaire> getAll()
	{
		List<Proprietaire> owners = new ArrayList<>();

		try {
			owners = this.proprietaireService.getAll();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return owners;
	}


	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
	@ResponseBody public Boolean delete(@RequestBody  Proprietaire proprietaire)
	{
		Boolean result = false;

		try {
			this.proprietaireService.delete(proprietaire);
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
			this.proprietaireService.deleteAll();
			result = true;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return result;
	}

}
