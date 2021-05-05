package microservice.bien.service.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Type_Bien;

import java.util.List;

public interface Type_BienService {

    public List<Type_Bien> getAll();

    public Type_Bien getById(Integer id);

    public Type_Bien save(Type_Bien type_bien);

    public List<Type_Bien> saveAll(List<Type_Bien> type_biens);

    public void delete(Type_Bien type_bien);

    public void deleteAll();


}
