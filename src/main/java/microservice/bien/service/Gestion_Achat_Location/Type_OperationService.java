package microservice.bien.service.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Document_Operation;
import microservice.bien.model.Gestion_Achat_Location.Type_Operation;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("type_operationService")
public interface Type_OperationService {

    public List<Type_Operation> getAll();

    public Type_Operation getById(Integer id);

    public Type_Operation save(Type_Operation type_operation);

    public List<Type_Operation> saveAll(List<Type_Operation>type_operation);

    public  void delete(Type_Operation type_operation);

    public void deleteAll();


}
