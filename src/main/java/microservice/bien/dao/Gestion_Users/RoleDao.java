package microservice.bien.dao.Gestion_Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import microservice.bien.model.Gestion_Users.Role;

@Repository("roleDao")
public interface RoleDao extends JpaRepository<Role ,Integer>{

}
