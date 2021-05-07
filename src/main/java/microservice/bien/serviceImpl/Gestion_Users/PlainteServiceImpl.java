package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.PlainteDao;
import microservice.bien.model.Gestion_Users.Plainte;
import microservice.bien.service.Gestion_Users.PlainteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("plainteService")
public class PlainteServiceImpl implements PlainteService {

    @Autowired
    @Qualifier(value="plainteDao")
    private PlainteDao plainteDao;

    @Override
    public List<Plainte> getAll() {
        return this.plainteDao.findAll();
    }

    @Override
    public Plainte getById(Integer id) {
        return this.plainteDao.getOne(id);

    }

    @Override
    public Plainte save(Plainte plainte) {
        return this.plainteDao.save(plainte);
    }

    @Override
    public List<Plainte> saveAll(List<Plainte> plaintes) {
        return this.plainteDao.saveAll(plaintes);
    }

    @Override
    public void delete(Plainte plainte) {

        this.plainteDao.delete(plainte);

    }

    @Override
    public void deleteAll() {
        this.plainteDao.deleteAll();
    }
}
