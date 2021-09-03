package microservice.bien.controller.Gestion_Users;
import microservice.bien.service.smsService.SmsService;
import microservice.bien.model.PersonneVerificationRequestData;
import microservice.bien.model.SmsVerification;



import microservice.bien.model.Gestion_Users.Administrateur;
import microservice.bien.model.Gestion_Users.Agent_Immobilier;
import microservice.bien.model.Gestion_Users.Client;
import microservice.bien.model.Gestion_Users.Demarcheur;
import microservice.bien.model.Gestion_Users.Notaire;
import microservice.bien.model.Gestion_Users.Personne;
import microservice.bien.model.Gestion_Users.Proprietaire;
import microservice.bien.model.Gestion_Users.Role;
import microservice.bien.model.Gestion_Users.SAV;
import microservice.bien.requete.CreatePersonne;
import microservice.bien.service.Gestion_Users.AdministrateurService;
import microservice.bien.service.Gestion_Users.Agent_ImmobilierService;
import microservice.bien.service.Gestion_Users.ClientService;
import microservice.bien.service.Gestion_Users.DemarcheurService;
import microservice.bien.service.Gestion_Users.NotaireService;
import microservice.bien.service.Gestion_Users.PersonneService;
import microservice.bien.service.Gestion_Users.ProprietaireService;
import microservice.bien.service.Gestion_Users.RoleService;
import microservice.bien.service.Gestion_Users.SAVService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/service/personne")
public class PersonneController {
	
	@Autowired
	//@Qualifier(value = "personneService")
	private PersonneService personneService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
    private Agent_ImmobilierService agent_immobilierService;

	
	@Autowired
	private AdministrateurService administrateurService;
	
	@Autowired
	private NotaireService notaireService;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ProprietaireService proprietaireService;
	
	@Autowired
	private DemarcheurService demarcheurService;
	
	@Autowired
    private SAVService savService;
	
	@Autowired
	private SmsService smsService;

	@RequestMapping(value = "/save", method= RequestMethod.POST) //headers = "accept = application/json")
	
	public ResponseEntity<?> save(@RequestBody CreatePersonne createPersonne)
	{
		

		try{
			String username = createPersonne.getUsername() ;
			String email = createPersonne.getEmail() ;
			String nom = createPersonne.getNom() ;
			String prenom = createPersonne.getPrenom() ;
			String telephone = createPersonne.getTelephone() ;
			String adress = createPersonne.getAdress() ;
			String password = createPersonne.getPassword() ;
			Integer roleId = createPersonne.getRoleId() ;
			String carte_identite = createPersonne.getCarte_identite() ;
			String nom_cabinet = createPersonne.getNom_cabinet() ;
			String profil = createPersonne.getProfil() ;

			
		
			
			if(!username.isEmpty()
				&& !email.isEmpty()
				&& !prenom.isEmpty()
				&& !telephone.isEmpty()
				&& !adress.isEmpty()
				&& !password.isEmpty()
				&& !nom.isEmpty()
				&& roleId != null
				) {
				
				
				
				List <Personne> personnes = this.personneService.getAll();
				
				for(Personne per:personnes) {
					if(per.getUsername().equalsIgnoreCase(username)) {
			        	

						return new ResponseEntity<String>("username deja utiliser",HttpStatus.BAD_REQUEST);
					
					}
					if(per.getEmail().equalsIgnoreCase(email)) {
			        	

						return new ResponseEntity<String>("email deja utiliser",HttpStatus.BAD_REQUEST);
					
					}
					
				
				}

					
			
				
				Role role = roleService.getById(roleId);
				System.out.print(role);
				if(role == null) {
					return ResponseEntity.badRequest().body("roleId invalid");
					
				}
				
				//envoi de sms 
				
			/*	String code = smsService.sendCode(createPersonne.getTelephone());
				if(code == null)
				{
					return ResponseEntity.badRequest().body("error lors de l'envoi de code");
				}
				smsService.save(
						new SmsVerification(code,createPersonne.getTelephone())
				);
				*/
				
				
				
				
				
				System.out.println("role libelle "+role.getLibelle());
				
				if(role.getLibelle().equalsIgnoreCase("administrateur")) {
			
					Administrateur admin = new Administrateur();
					admin.setUsername(username);
					admin.setAdress(adress);
					admin.setEmail(email);
					admin.setNom(nom);
					admin.setPrenom(prenom);
					admin.setPassword(password);
					admin.setRole(role);
					admin.setTelephone(telephone);
					admin.setProfil(profil);

					
					
					Administrateur administrateur = administrateurService.save(admin);
					return ResponseEntity.ok(administrateur);
					
				}
				
				else if(role.getLibelle().equalsIgnoreCase("notaire")) {
					if(carte_identite == null) {
						return ResponseEntity.badRequest().body("Carte identite necessaire pour creer un notaire");
						

						
					}
					
					if(nom_cabinet == null) {
						return ResponseEntity.badRequest().body("Nom cabinet necessaire pour creer un notaire");
						

						
					}
					Notaire notair = new Notaire();
					notair.setUsername(username);
					notair.setAdress(adress);
					notair.setEmail(email);
					notair.setNom(nom);
					notair.setPrenom(prenom);
					notair.setPassword(password);
					notair.setRole(role);
					notair.setTelephone(telephone);
					notair.setCarte_identite(carte_identite);
					notair.setNom_cabinet(nom_cabinet);
					notair.setProfil(profil);

					
					Notaire notaire = notaireService.save(notair);
					return ResponseEntity.ok(notaire);
					
				}
				
				
				else if(role.getLibelle().equalsIgnoreCase("client")) {
					Client clien = new Client();
					clien.setUsername(username);
					clien.setAdress(adress);
					clien.setEmail(email);
					clien.setNom(nom);
					clien.setPrenom(prenom);
					clien.setPassword(password);
					clien.setRole(role);
					clien.setTelephone(telephone);
					clien.setProfil(profil);

					
					Client client = clientService.save(clien);
					return ResponseEntity.ok(client);
					
				}
				
				
				else if(role.getLibelle().equalsIgnoreCase("agentimmobilier")) {
					Agent_Immobilier agentImm = new Agent_Immobilier();
					agentImm.setUsername(username);
					agentImm.setAdress(adress);
					agentImm.setEmail(email);
					agentImm.setNom(nom);
					agentImm.setPrenom(prenom);
					agentImm.setPassword(password);
					agentImm.setRole(role);
					agentImm.setTelephone(telephone);
					agentImm.setProfil(profil);

					Agent_Immobilier agent_immobilier = agent_immobilierService.save(agentImm);
					return ResponseEntity.ok(agent_immobilier);
					
				}
				
				
				else if(role.getLibelle().equalsIgnoreCase("proprietaire")) {
					Proprietaire proprio = new Proprietaire();
					proprio.setUsername(username);
					proprio.setAdress(adress);
					proprio.setEmail(email);
					proprio.setNom(nom);
					proprio.setPrenom(prenom);
					proprio.setPassword(password);
					proprio.setRole(role);
					proprio.setTelephone(telephone);
					proprio.setProfil(profil);

					
					Proprietaire proprietaire = proprietaireService.save(proprio);
					return ResponseEntity.ok(proprietaire);
					
				}
				
				
				else if(role.getLibelle().equalsIgnoreCase("demarcheur")) {
					Demarcheur demar = new Demarcheur();
					demar.setUsername(username);
					demar.setAdress(adress);
					demar.setEmail(email);
					demar.setNom(nom);
					demar.setPrenom(prenom);
					demar.setPassword(password);
					demar.setRole(role);
					demar.setTelephone(telephone);
					demar.setProfil(profil);

					
					Demarcheur demarcheur = demarcheurService.save(demar);
					return ResponseEntity.ok(demarcheur);
					
				}
				
				
				else if(role.getLibelle().equalsIgnoreCase("sav")) {
					SAV sav = new SAV();
					sav.setUsername(username);
					sav.setAdress(adress);
					sav.setEmail(email);
					sav.setNom(nom);
					sav.setPrenom(prenom);
					sav.setPassword(password);
					sav.setRole(role);
					sav.setTelephone(telephone);
					sav.setProfil(profil);

					
					SAV savs = savService.save(sav);
					return ResponseEntity.ok(savs);
					
				}
				
				//
				
				
			}
			
			else if(username.isEmpty()) {
				return ResponseEntity.badRequest().body("username obligatoire");
			}
			else if(nom.isEmpty()) {
				return ResponseEntity.badRequest().body("nom obligatoire");
			}
			else if(prenom.isEmpty()) {
				return ResponseEntity.badRequest().body("prenom obligatoire");
			}
			else if(adress.isEmpty()) {
				return ResponseEntity.badRequest().body("adress obligatoire");
			}
			else if(telephone.isEmpty()) {
				return ResponseEntity.badRequest().body("telephone obligatoire");
			}
			else if(password.isEmpty()) {
				return ResponseEntity.badRequest().body("password obligatoire");
			}
			else if(roleId == null) {
				return ResponseEntity.badRequest().body("roleId obligatoire");
			}
			
			else if(profil.isEmpty()) {
				return ResponseEntity.badRequest().body("profil obligatoire");
			}
			return ResponseEntity.badRequest().body("requete echouer");

			
			
			//personne = this.personneService.save(personne);
		}catch(Exception  ex){
			System.out.println(ex.getMessage());
		}
		 
		return ResponseEntity.badRequest().body("requete echouer");
		

	}
	
	
	@RequestMapping(value ="/verify", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> saveVerified(
			@RequestBody PersonneVerificationRequestData data
			)
	{
		SmsVerification smsVerification;
		
		try{
			 smsVerification = this.smsService.getByTelephoneAndCode(data.getTelephone(),data.getCode());
		}catch (Exception ex){
			System.out.println(ex.getMessage());
			return ResponseEntity.badRequest().body("error serveur");
		}
		if(smsVerification == null) {
			return ResponseEntity.badRequest().body("votre code de verification est incorrect");
		}
		
		smsVerification.setIsverified(true);
		smsService.save(smsVerification);
		
		Personne personne = personneService.getByTelephone(data.getTelephone());
		
		if(personne == null) {
			return ResponseEntity.badRequest().body("aucun user trouver avec ce numero");
		}
		
		personne.setIsVerified(true);
		personneService.save(personne);
		
		return ResponseEntity.ok(personne);
		

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
	
	@RequestMapping(value="/findByUsernameAndPassword", method = RequestMethod.POST , headers = "Accept=application/json")
	@ResponseBody public Personne findByUsernameAndPassword(@RequestBody Personne personne) {
		
		personne =  this.personneService.findByUsernameAndPassword(personne.getUsername(),personne.getPassword());
		
		return personne == null ? new Personne() : personne;
		
		
	}
	
	@PutMapping("/{id}/update")
    public Personne update(@RequestBody Personne personneObj) {
		personneService.save(personneObj);
    	return personneObj;
 }
	
	



}
