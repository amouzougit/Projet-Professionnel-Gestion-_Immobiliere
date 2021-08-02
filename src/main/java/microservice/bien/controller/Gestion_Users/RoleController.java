package microservice.bien.controller.Gestion_Users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import microservice.bien.model.Gestion_Users.Role;
import microservice.bien.service.Gestion_Users.RoleService;


@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/service/role")
public class RoleController {

	 @Autowired
	   
	    private RoleService roleService;

	    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
	    @ResponseBody
	    public Role save(@RequestBody Role role)
	    {
	        try{
	            role = this.roleService.save(role);
	        }catch (Exception ex){
	            System.out.println(ex.getMessage());
	        }
	        return role;
	    }

	    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
	    @ResponseBody public List<Role> saveAll(@RequestBody List<Role> roles) {
	        try {
	            roles = this.roleService.saveAll(roles);
	        } catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }

	        return roles;

	    }

	    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	    @ResponseBody public List< Role> getAll()
	    {
	        List<Role> custome = new ArrayList<>();

	        try {
	        	custome = this.roleService.getAll();
	        } catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }

	        return custome;
	    }


	    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
	    @ResponseBody public Boolean delete(@RequestBody  Role role)
	    {
	        Boolean result = false;

	        try {
	            this.roleService.delete(role);
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
	            this.roleService.deleteAll();
	            result = true;
	        } catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }

	        return result;
	    }

}
