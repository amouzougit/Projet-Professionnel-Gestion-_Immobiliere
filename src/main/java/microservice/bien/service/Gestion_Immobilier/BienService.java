package microservice.bien.service.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Bien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bienService")
public interface BienService {
    public List<Bien> listBiens();
    
    public Bien getById(Long id);

    public Bien createBien(Bien bien);

    public List<Bien> saveAll(List<Bien> bien);

    public void delete(Bien bien);

    public void deleteAll();






}
