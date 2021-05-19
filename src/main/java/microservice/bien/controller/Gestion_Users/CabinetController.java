package microservice.bien.controller.Gestion_Users;


import microservice.bien.model.Gestion_Users.Cabinet;
import microservice.bien.service.Gestion_Users.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value= "/service/cabinet")
public class CabinetController {

	@Autowired
	//@Qualifier(value ="cabinetService")
	private CabinetService cabinetService;

	@RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Cabinet save(@RequestBody Cabinet cabinet)
	{
		try{
			cabinet = this.cabinetService.save(cabinet);
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return cabinet;
	}

	@RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody public List<Cabinet> saveAll(@RequestBody List<Cabinet> cabinets) {
		try {
			cabinets = this.cabinetService.saveAll(cabinets);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return cabinets;

	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody public List< Cabinet> getAll()
	{
		List<Cabinet> lesCabinet = new ArrayList<>();

		try {
			lesCabinet = this.cabinetService.getAll();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return lesCabinet;
	}


	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
	@ResponseBody public Boolean delete(@RequestBody  Cabinet cabinet)
	{
		Boolean result = false;

		try {
			this.cabinetService.delete(cabinet);
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
			this.cabinetService.deleteAll();
			result = true;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return result;
	}

}
