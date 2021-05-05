package microservice.bien.serviceImpl.Gestion_Immobilier;

import microservice.bien.dao.Gestion_Immobilier.Caracteristique_BienDao;
import microservice.bien.model.Gestion_Immobilier.Caracteristique_Bien;
import microservice.bien.service.Gestion_Immobilier.Caracteristique_BienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("caracteristique_bienService")
public class Caracteristique_BienServiceImpl  implements Caracteristique_BienService {
@Autowired
@Qualifier(value="caracteristique_bienDao")
	private Caracteristique_BienDao caracteristique_bienDao;



	public List<Caracteristique_Bien> getAll() {
		return this.caracteristique_bienDao.findAll();
	}


	public Caracteristique_Bien getById() {
		return this.caracteristique_bienDao.getOne(Integer id);
	}


	public Caracteristique_Bien save(Caracteristique_Bien caracteristique_bien) {


		 return this.caracteristique_bienDao.save(caracteristique_bien);
	}

	public List<Caracteristique_Bien> saveAll(List<Caracteristique_Bien> caracteristique_biens) {

		return this.caracteristique_bienDao.saveAll(caracteristique_biens);
	}


	public void delete(Caracteristique_Bien caracteristique_bien) {
		this.caracteristique_bienDao.delete(caracteristique_bien);

	}


	public void deleteAll() {
		this.caracteristique_bienDao.deleteAll();

	}


}
