package microservice.bien.service.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Operation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("operationService")
public interface OperationService {


    public List<Operation> getAll();

    public Operation getById(Integer id);

    public Operation save(Operation operation);

    public List<Operation> saveAll(List<Operation> operation);

    public void delete(Operation operation);

    public void deleteAll();


}
