package bo.cossmil.rentistas.repository;

import bo.cossmil.rentistas.model.DescripcionMovimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface DescripcionMovimientoRepository extends JpaRepository<DescripcionMovimiento, String> {

    DescripcionMovimiento findByCodigo(String codigo);

    @Query("select d from DescripcionMovimiento d where d.codigo = ?1")
    Optional<DescripcionMovimiento> findPorCodigo(String codigo);
}
