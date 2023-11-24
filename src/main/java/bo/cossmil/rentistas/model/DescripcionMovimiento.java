package bo.cossmil.rentistas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "r_demoren")
public class DescripcionMovimiento {
    @Id
    @Column(name = "cod_dmr")
    private String codigo;
    @Column(name = "des_dmr")
    private String descripcion;
    @Column(name = "abr_dmr")
    private String abreviado;
}
