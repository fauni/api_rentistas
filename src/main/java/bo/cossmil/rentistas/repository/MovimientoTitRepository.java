package bo.cossmil.rentistas.repository;

import bo.cossmil.rentistas.model.MovimientoTit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoTitRepository extends JpaRepository<MovimientoTit, String> {
}
