package microservice.bien.service.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Caracteristique_Bien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("caracteristique_bienService")
public interface Caracteristique_BienService {
    public List<Caracteristique_Bien> getAll();

    public Caracteristique_Bien getById(Integer id);

    public Caracteristique_Bien save(Caracteristique_Bien id_caracteristique_bien);

    public List<Caracteristique_Bien> saveAll(List<Caracteristique_Bien>caracteristique_biens);

    public void delete(Caracteristique_Bien caracteristique_bien);

    public void deleteAll();

}
