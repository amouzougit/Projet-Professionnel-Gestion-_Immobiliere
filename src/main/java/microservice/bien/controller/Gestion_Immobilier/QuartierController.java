package microservice.bien.controller.Gestion_Immobilier;


import microservice.bien.model.Gestion_Immobilier.Quartier;
import microservice.bien.service.Gestion_Immobilier.QuartierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin("*")
@RequestMapping(value="/service/quartier")
public class QuartierController {

	
	 @Autowired
	 @Qualifier(value ="quartierService") 
	 private QuartierService quartierService;
	  
	 @RequestMapping(value ="/save", method = RequestMethod.POST, headers = "Accept=application/json")
	 @ResponseBody 
	 public Quartier save(@RequestBody Quartier quartier) { 
		 try{
			 quartier = this.quartierService.save(quartier); 
		 }catch (Exception ex){
			 System.out.println(ex.getMessage()); 
		 } 
		 return quartier; 
	}
	  
	 @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers =
	 "Accept=application/json")
	 
	 @ResponseBody public List< Quartier> saveAll(@RequestBody List<Quartier>
	 quartiers) { try { quartiers = this.quartierService.saveAll(quartiers); }
	 catch (Exception ex) { System.out.println(ex.getMessage()); }
	  
	 return quartiers;
	  
	 }
	  
	  
	 @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers =
	 "Accept=application/json")
	 
	 @ResponseBody public List< Quartier> getAll() { List< Quartier> lesquartiers
	 = new ArrayList<>();
	  
	 try { lesquartiers = this.quartierService.getAll(); } catch (Exception ex) {
	 System.out.println(ex.getMessage()); }
	  
	 return lesquartiers; }
	  
	  
	  @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers =
	 "Accept=application/json")
	  
	 @ResponseBody public Boolean delete(@RequestBody Quartier quartier) { Boolean
	 result = false;
	  
	 try { this.quartierService.delete(quartier); result = true; } catch
	 (Exception ex) { System.out.println(ex.getMessage()); }
	  
	 return result; }
	  
	 @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE, headers
	 = "Accept=application/json")
	  
	 @ResponseBody public Boolean deleteAll() { Boolean result = false;
	  
	 try { this.quartierService.deleteAll(); result = true; } catch (Exception ex)
	 { System.out.println(ex.getMessage()); }
	  
	 return result; }
	 
}
