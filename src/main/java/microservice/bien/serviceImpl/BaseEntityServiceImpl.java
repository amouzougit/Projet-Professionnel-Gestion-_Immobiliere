package microservice.bien.serviceImpl;

import microservice.bien.dao.BaseEntityDao;
import microservice.bien.model.BaseEntity;
import microservice.bien.service.BaseEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("baseEntityService")
public class BaseEntityServiceImpl  implements BaseEntityService {
    @Autowired
    @Qualifier(value="baseEntityDao")
    private BaseEntityDao baseEntityDao;


    @Override
    public List<BaseEntity> getAll()
    {
        return this.baseEntityDao.findAll();
    }

    @Override
    public BaseEntity getById(Long id)
    {
        return this.baseEntityDao.getOne(id);
    }

    @Override
    public BaseEntity save(BaseEntity baseEntitie)
    {
        return this.baseEntityDao.save(baseEntitie);
    }

    @Override
    public List<BaseEntity> saveAll(List<BaseEntity> baseEntities)
    {
        return this.baseEntityDao.saveAll(baseEntities);
    }

    @Override
    public void delete(BaseEntity baseEntitie) {
        this.baseEntityDao.delete(baseEntitie);

    }

    @Override
    public void deleteAll() {
        this.baseEntityDao.deleteAll();


    }
}
