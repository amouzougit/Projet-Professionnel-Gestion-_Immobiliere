package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.ProprietaireDao;
import microservice.bien.model.Gestion_Users.Proprietaire;
import microservice.bien.service.Gestion_Users.ProprietaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("proprietaireService")
public class ProprietaireServiceImpl implements ProprietaireService {

    @Autowired
    //@Qualifier("proprietaireDao")
    private ProprietaireDao propritaireDao;


    @Override
    public List<Proprietaire> getAll() {
        return this.propritaireDao.findAll();
    }

    @Override
    public Proprietaire getById(Integer id) {
        return this.propritaireDao.getOne(id);
    }

    @Override
    public Proprietaire save(Proprietaire proprietaire) {
        return this.propritaireDao.save(proprietaire);
    }

    @Override
    public List<Proprietaire> saveAll(List<Proprietaire> proprietaires) {
        return this.propritaireDao.saveAll(proprietaires);
    }

    @Override
    public void delete(Proprietaire proprietaire) {
        this.propritaireDao.delete(proprietaire);

    }

    @Override
    public void deleteAll() {
        this.propritaireDao.deleteAll();

    }
}
