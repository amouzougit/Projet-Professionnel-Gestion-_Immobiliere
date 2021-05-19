package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.SAVDao;
import microservice.bien.model.Gestion_Users.SAV;
import microservice.bien.service.Gestion_Users.SAVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("savService")
public class SAVServiceImpl implements SAVService {
    @Autowired
    //@Qualifier(value="savService")
    private SAVDao savDao;


    @Override
    public List<SAV> getAll() {
        return this.savDao.findAll();
    }

    @Override
    public SAV getById(Integer id) {
        return this.savDao.getOne(id);
    }

    @Override
    public SAV save(SAV sav) {
        return this.savDao.save(sav);
    }

    @Override
    public List<SAV> saveAll(List<SAV> savs) {
        return this.savDao.saveAll(savs);
    }

    @Override
    public void delete(SAV sav) {
        this.savDao.delete(sav);


    }

    @Override
    public void deleteAll() {
        this.savDao.deleteAll();


    }
}
