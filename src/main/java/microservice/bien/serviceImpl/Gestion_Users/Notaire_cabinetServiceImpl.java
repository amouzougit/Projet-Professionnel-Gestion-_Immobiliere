package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.Notaire_cabinetDao;
import microservice.bien.model.Gestion_Users.Notaire_cabinet;
import microservice.bien.service.Gestion_Users.Notaire_cabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service()
public class Notaire_cabinetServiceImpl implements Notaire_cabinetService {
    @Autowired
    @Qualifier(value="notaire_cabinetDao")
    private Notaire_cabinetDao notaire_cabinetDao;



    public List<Notaire_cabinet> getAll() {
        return this.notaire_cabinetDao.findAll();
    }

    public Notaire_cabinet getById(Integer id) {
        return this.notaire_cabinetDao.getOne(id);
    }


    public Notaire_cabinet save(Notaire_cabinet notaire_cabinet) {
        return this.notaire_cabinetDao.save(notaire_cabinet);
    }


    public List<Notaire_cabinet> saveAll(List<Notaire_cabinet> notaire_cabinets) {
        return this.notaire_cabinetDao.saveAll(notaire_cabinets);
    }


    public void delete(Notaire_cabinet notaire_cabinet) {
        this.notaire_cabinetDao.delete(notaire_cabinet);

    }

    public void deleteAll() {
        this.notaire_cabinetDao.deleteAll();

    }
}
