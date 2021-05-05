package microservice.bien.service.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Document_Operation;

import java.util.List;

public interface TransactionService {


    public List<Document_Operation> getAll();

    public Document_Operation getById(Integer id);

    public Document_Operation save(Document_Operation document_operation);

    public List<Document_Operation> saveAll(List<Document_Operation>document_operations);

    public  void delete(Document_Operation document_operation);

    public void deleteAll();
















}
