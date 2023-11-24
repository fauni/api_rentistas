package bo.cossmil.rentistas.repository;

import bo.cossmil.rentistas.model.ClaseRenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ClaseRentaRepository extends JpaRepository<ClaseRenta, String> {
    ClaseRenta findByCodigo(String codigo);

    @Query("select c from ClaseRenta c where c.codigo = ?1")
    Optional<ClaseRenta> findPorCodigo(String codigo);
}
