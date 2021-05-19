package microservice.bien.controller.Gestion_Users;

import microservice.bien.model.Gestion_Users.Plainte;
import microservice.bien.service.Gestion_Users.PlainteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value ="/service/plainte")
public class PlainteController {

	@Autowired
	//@Qualifier(value ="plainteService")
	private PlainteService plainteService;

	@RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Plainte save(@RequestBody Plainte plainte)
	{
		try{
			plainte = this.plainteService.save(plainte);
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return plainte;
	}

	@RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody public List<Plainte> saveAll(@RequestBody List<Plainte> plaintes) {
		try {
			plaintes = this.plainteService.saveAll(plaintes);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return plaintes;

	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody public List< Plainte> getAll()
	{
		List<Plainte> complaints = new ArrayList<>();

		try {
			complaints = this.plainteService.getAll();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return complaints;
	}


	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
	@ResponseBody public Boolean delete(@RequestBody  Plainte plainte)
	{
		Boolean result = false;

		try {
			this.plainteService.delete(plainte);
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
			this.plainteService.deleteAll();
			result = true;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return result;
	}

}
