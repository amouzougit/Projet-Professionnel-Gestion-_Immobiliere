package microservice.bien.controller.Gestion_Users;


import microservice.bien.model.Gestion_Users.Administrateur;

import microservice.bien.service.Gestion_Users.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/service/administrateur")
public class AdministrateurController {

    @Autowired
    //@Qualifier(value ="administrateurService")
    private AdministrateurService administrateurService;

    //,headers = "Accept=application/json"
    @RequestMapping(value ="/save", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> save(@RequestBody Administrateur administrateur)
    {
    	
        try{
        	System.out.println("admin");
			List <Administrateur> administrateurs = this.administrateurService.getAll();
			
			for(Administrateur admin:administrateurs) {
				if(admin.getUsername().equalsIgnoreCase(administrateur.getUsername())) {
		        	System.out.println("admin reponse");

					return new ResponseEntity<String>("username deja utiliser",HttpStatus.BAD_REQUEST);
				
				}
				if(admin.getEmail().equalsIgnoreCase(administrateur.getEmail())) {
		        	System.out.println("admin reponse");

					return new ResponseEntity<String>("email deja utiliser",HttpStatus.BAD_REQUEST);
				
				}
			}

            Administrateur ad = this.administrateurService.save(administrateur);
    		return ResponseEntity.ok(ad);
    		

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
		
		return new ResponseEntity<String>("requete echouer",HttpStatus.BAD_REQUEST);


    }
    


    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List<Administrateur> saveAll(@RequestBody List<Administrateur> administrateurs) {
        try {
            administrateurs = this.administrateurService.saveAll(administrateurs);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return administrateurs;

    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Administrateur> getAll()
    {
        List<Administrateur> admins = new ArrayList<>();

        try {
            admins = this.administrateurService.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return admins;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Administrateur administrateur)
    {
        Boolean result = false;

        try {
            this.administrateurService.delete(administrateur);
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
            this.administrateurService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    @PutMapping("/{id}/update")
    public Administrateur update(@RequestBody Administrateur administrateurObj) {
    	administrateurService.save(administrateurObj);
    	return administrateurObj;
 }

}
