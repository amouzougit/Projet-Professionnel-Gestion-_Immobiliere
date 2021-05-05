package microservice.bien.service.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Ville;

import java.util.List;

public interface VilleService {


    public List<Ville> getAll();

    public Ville getById(Integer id);

    public Ville save(Ville ville);

    public List<Ville> saveAll(List<Ville> villes);

    public void delete(Ville ville);

    public void deleteAll();


}
