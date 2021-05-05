package microservice.bien.service.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Document_Bien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("document_bienService")
public interface Document_BienService {


    public List<Document_Bien> listDocumentBien();
    public Document_Bien getById(Integer id);
    public  Document_Bien getDocument_bien(Document_Bien document_bien);
    public List<Document_Bien> saveAll(List<Document_Bien>document_biens);
    public void delete(Document_Bien document_bien);
    public void deleteAll();
}
