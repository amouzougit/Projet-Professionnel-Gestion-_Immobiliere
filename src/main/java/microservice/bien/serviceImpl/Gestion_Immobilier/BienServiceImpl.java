package microservice.bien.serviceImpl.Gestion_Immobilier;

import microservice.bien.dao.Gestion_Immobilier.BienDao;
import microservice.bien.model.Gestion_Immobilier.Bien;
import microservice.bien.service.Gestion_Immobilier.BienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bienService")
public class BienServiceImpl implements BienService {
	
	@Autowired
	private BienDao bienDao;


	@Override
	public List<Bien> listBiens() {
		return this.bienDao.findAll();
	}
	
	@Override
	public Bien getById(Long id) {
		return this.bienDao.getOne(id);
	}


	public Bien createBien(Bien bien) {
		return this.bienDao.save(bien);
	}


	public List<Bien> saveAll(List<Bien> bien) {
		return this.bienDao.saveAll(bien);
	}


	public void delete(Bien bien) {
		 this.bienDao.delete(bien);

	}


	public void deleteAll() {
		this.bienDao.deleteAll();

	}
}
