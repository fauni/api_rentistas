package bo.cossmil.rentistas.repository;

import bo.cossmil.rentistas.controller.dto.MovimientoTitDTO;
import bo.cossmil.rentistas.model.MovimientoTit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimientoTitRepository extends JpaRepository<MovimientoTit, String> {
    // List<MovimientoTit> findTop10ByOrderByMtrmtiDesc();
    List<MovimientoTit> findTop10ByOrderByMtrmtiDesc();

    @Query("SELECT new bo.cossmil.rentistas.controller.dto.MovimientoTitDTO(m.mtrmti, m.tre_mti, " +
            "new bo.cossmil.rentistas.controller.dto.DescripcionMovimientoDTO(d.codigo, d.descripcion, d.abreviado)) " +
            "FROM MovimientoTit m LEFT JOIN DescripcionMovimiento d ON m.cdes_mti = d.codigo")
    List<MovimientoTitDTO> obtenerMovimientoTitConDemoren();
}
