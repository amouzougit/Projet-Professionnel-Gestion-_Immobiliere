package microservice.bien.controller.Gestion_Users;


import microservice.bien.model.Gestion_Users.Notaire;
import microservice.bien.model.Gestion_Users.Notaire_cabinet;
import microservice.bien.service.Gestion_Users.Notaire_cabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/service/notairecabinet")
public class Notaire_cabinetController {

	@Autowired
	//@Qualifier(value ="notaire_cabinetService")
	private Notaire_cabinetService notaire_cabinetService;

	@RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Notaire_cabinet save(@RequestBody Notaire_cabinet notaire_cabinet)
	{
		try{
			notaire_cabinet = this.notaire_cabinetService.save(notaire_cabinet);
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return notaire_cabinet;
	}

	@RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody public List<Notaire_cabinet> saveAll(@RequestBody List<Notaire_cabinet> notaire_cabinets) {
		try {
			notaire_cabinets = this.notaire_cabinetService.saveAll(notaire_cabinets);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return notaire_cabinets;

	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody public List< Notaire_cabinet> getAll()
	{
		List<Notaire_cabinet> NotaireCabinets = new ArrayList<>();

		try {
			NotaireCabinets = this.notaire_cabinetService.getAll();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return NotaireCabinets;
	}


	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
	@ResponseBody public Boolean delete(@RequestBody  Notaire_cabinet notaire_cabinet)
	{
		Boolean result = false;

		try {
			this.notaire_cabinetService.delete(notaire_cabinet);
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
			this.notaire_cabinetService.deleteAll();
			result = true;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return result;
	}
	@PutMapping("/{id}/update")
    public Notaire_cabinet update(@RequestBody Notaire_cabinet notaire_cabinetObj) {
		notaire_cabinetService.save(notaire_cabinetObj);
    	return notaire_cabinetObj;
 }

}
