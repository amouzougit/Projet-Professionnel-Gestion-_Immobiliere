package microservice.bien.serviceImpl.Gestion_Achat_Location;

import microservice.bien.dao.Gestion_Achat_Location.Document_OperationDao;
import microservice.bien.model.Gestion_Achat_Location.Document_Operation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import microservice.bien.service.Gestion_Achat_Location.Document_OperationService;

import java.util.List;

@Service("document_OperationService")
public class Document_OperationServiceImpl  implements Document_OperationService {

@Qualifier(value = "document_operationdao")
    private Document_OperationDao document_OperationDao;



    public List<Document_Operation> getAll() {
        return this.document_OperationDao.findAll();
    }


    public Document_Operation getById(Integer id) {
        return this.document_OperationDao.getOne(id);
    }


    public Document_Operation save(Document_Operation document_operation) {
        return this.document_OperationDao.save(document_operation);
    }

    public List<Document_Operation> saveAll(List<Document_Operation> document_operations) {
        return  this.document_OperationDao.saveAll(document_operations);
    }


    public void delete(Document_Operation document_operation) {
        this.document_OperationDao.delete(document_operation);

    }

    public void deleteAll() {
        this.document_OperationDao.deleteAll();

    }
}
