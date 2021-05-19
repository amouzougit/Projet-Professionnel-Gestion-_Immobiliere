package microservice.bien.dao.Gestion_Users;


import microservice.bien.model.Gestion_Users.Notaire_cabinet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("notaire_cabinetDao")
public interface Notaire_cabinetDao extends JpaRepository<Notaire_cabinet,Integer> {
}
