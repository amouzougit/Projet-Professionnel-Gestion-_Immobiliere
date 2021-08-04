package microservice.bien.controller.Gestion_Immobilier;


import microservice.bien.model.Gestion_Immobilier.Document_Bien;
import microservice.bien.service.Gestion_Immobilier.Document_BienService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


//@CrossOrigin("*")
@RequestMapping("/service/documentbien")
@RestController
public class Document_BienController {

    @Autowired
    //@Qualifier(value ="operationService")
    private Document_BienService document_BienService;

    @RequestMapping(value ="/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
    public Document_Bien save(@RequestBody Document_Bien document_bien)
    {
        try{
            document_bien = this.document_BienService.getDocument_bien(document_bien);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return document_bien;
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody public List< Document_Bien> saveAll(@RequestBody List<Document_Bien> document_biens) {
        try {
            document_biens = this.document_BienService.saveAll(document_biens);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return document_biens;

    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody public List< Document_Bien> getAll()
    {
        List< Document_Bien> lesdocument_bien = new ArrayList<>();

        try {
            lesdocument_bien = this.document_BienService.listDocumentBien();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lesdocument_bien;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody public Boolean delete(@RequestBody  Document_Bien document_bien)
    {
        Boolean result = false;

        try {
            this.document_BienService.delete(document_bien);
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
            this.document_BienService.deleteAll();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    
    @PutMapping("/{id}/update")
    public Document_Bien update(@RequestBody Document_Bien document_bienObj) {
    	document_BienService.getDocument_bien(document_bienObj);
    	return document_bienObj;
    }
}
