package microservice.bien.service.Gestion_Users;

import java.util.List;

import org.springframework.stereotype.Service;

import microservice.bien.model.Gestion_Users.Role;

@Service("roleService")
public interface RoleService {
	
	public List<Role> getAll();

    public Role getById(Integer id);

    public Role save(Role role);

    public List<Role> saveAll(List<Role> roles);

    public void delete(Role role);

    public void deleteAll();

}
