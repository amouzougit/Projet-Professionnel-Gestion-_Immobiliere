package microservice.bien.dao;

import microservice.bien.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseEntityDao extends JpaRepository <BaseEntity,Long>{
}
