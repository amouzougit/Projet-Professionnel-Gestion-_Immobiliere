package microservice.bien.controller.Gestion_Users;

import microservice.bien.model.Gestion_Users.Notaire;
import microservice.bien.model.Gestion_Users.Personne;
import microservice.bien.service.Gestion_Users.NotaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value="/service/notaire")
public class NotaireController {


	@Autowired
	//@Qualifier(value ="notaireService")
	private NotaireService notaireService;

	@RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Notaire save(@RequestBody Notaire notaire)
	{
		try{
			notaire = this.notaireService.save(notaire);
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return notaire;
	}

	@RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody public List<Notaire> saveAll(@RequestBody List<Notaire> notaires) {
		try {
			notaires = this.notaireService.saveAll(notaires);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return notaires;

	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody public List< Notaire> getAll()
	{
		List<Notaire> Notary = new ArrayList<>();

		try {
			Notary = this.notaireService.getAll();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return Notary;
	}


	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
	@ResponseBody public Boolean delete(@RequestBody  Notaire notaire)
	{
		Boolean result = false;

		try {
			this.notaireService.delete(notaire);
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
			this.notaireService.deleteAll();
			result = true;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return result;
	}
	
	@PutMapping("/{id}/update")
    public Notaire update(@RequestBody Notaire notaireObj) {
		notaireService.save(notaireObj);
    	return notaireObj;
 }
}
