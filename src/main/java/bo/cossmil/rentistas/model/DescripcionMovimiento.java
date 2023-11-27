package bo.cossmil.rentistas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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
