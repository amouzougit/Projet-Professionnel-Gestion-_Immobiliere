package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Cabinet;
import microservice.bien.model.Gestion_Users.Client;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("clientService")
public interface ClientService {

    public List<Client> getAll();

    public Client getById(Integer id);

    public Client save(Client cabinet);

    public List<Client> saveAll(List<Client> clients);

    public void delete(Client client);

    public void deleteAll();
}
