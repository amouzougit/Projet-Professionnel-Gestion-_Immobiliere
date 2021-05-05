package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.ClientDao;
import microservice.bien.model.Gestion_Users.Cabinet;
import microservice.bien.model.Gestion_Users.Client;
import microservice.bien.service.Gestion_Users.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("clientService")
public class ClientServiceImpl implements ClientService {
		@Autowired
		@Qualifier(value="clientDao")
		private ClientDao clientDao;

	@Override
	public List<Client> getAll() {
		return this.clientDao.findAll();
	}

	@Override
	public Client getById(Integer id) {
		return this.clientDao.getOne(id);
	}

	@Override
	public Client save(Client client) {
		return this.clientDao.save(client);
	}

	@Override
	public List<Client> saveAll(List<Client> clients) {
		return this.clientDao.saveAll(clients);
	}

	@Override
	public void delete(Client client) {
		this.clientDao.delete(client);

	}

	@Override
	public void deleteAll() {
		this.clientDao.deleteAll();

	}
}
