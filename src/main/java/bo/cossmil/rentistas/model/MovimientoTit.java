package bo.cossmil.rentistas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "r_movtit")
public class MovimientoTit {
    @Id
    @Column(name = "mtr_mti")
    private String mtrmti;
    private Float ci_mti;
    private Integer tre_mti;
    private String cdes_mti;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "descripcion_movimiento_codigo", referencedColumnName = "mtrmti")
    private DescripcionMovimiento descripcionMovimiento;
    private Double can_mti;
    private Double efec_mti;
    private Double mon_mti;
    private LocalDate fvenc_mti;
    private Integer procmes_mti;
    private Integer mes_mti;
    private Integer gestion_mti;
    private Integer reg_mti;
    private Double cuenta_mti;
    private Double ci;
}
