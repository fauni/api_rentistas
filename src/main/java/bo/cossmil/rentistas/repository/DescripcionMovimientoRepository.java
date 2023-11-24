package bo.cossmil.rentistas.repository;

import bo.cossmil.rentistas.model.DescripcionMovimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescripcionMovimientoRepository extends JpaRepository<DescripcionMovimiento, String> {
}
