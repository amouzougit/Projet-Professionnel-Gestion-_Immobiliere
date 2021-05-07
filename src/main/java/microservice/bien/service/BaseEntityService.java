package microservice.bien.service;

import microservice.bien.model.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="baseEntityService")
public interface BaseEntityService {

    public List<BaseEntity> getAll();

    public BaseEntity getById(Long id);

    public BaseEntity save(BaseEntity baseEntitie);

    public List<BaseEntity> saveAll(List<BaseEntity> baseEntities);

    public void delete(BaseEntity baseEntitie);

    public void deleteAll();

}
