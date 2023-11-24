package bo.cossmil.rentistas.repository;

import bo.cossmil.rentistas.model.Rentas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentasRepository extends JpaRepository<Rentas, String> {
}
