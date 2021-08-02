package microservice.bien.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import microservice.bien.dao.Gestion_Users.RoleDao;
import microservice.bien.model.Gestion_Users.Role;
import microservice.bien.service.Gestion_Users.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
	
		@Autowired
		private RoleDao roleDao;

	@Override
	public List<Role> getAll() {
		return this.roleDao.findAll();
	}

	@Override
	public Role getById(Integer id) {
		return this.roleDao.getOne(id);
	}

	@Override
	public Role save(Role role) {
		return this.roleDao.save(role);
	}

	@Override
	public List<Role> saveAll(List<Role> roles) {
		return this.roleDao.saveAll(roles);
	}

	@Override
	public void delete(Role role) {
		this.roleDao.delete(role);

	}

	@Override
	public void deleteAll() {
		this.roleDao.deleteAll();

	}
}
