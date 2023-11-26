package bo.cossmil.rentistas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "r_movtit")
public class MovimientoTit {
    @Id
    private String mtr_mti;
    private Float ci_mti;
    private int tre_mti;
    private String cdes_mti;
    private double can_mti;
    private double efec_mti;
    private int mon_mti;
    private LocalDate fvenc_mti;
    private int procmes_mti;
    private int mes_mti;
    private int gestion_mti;
    private int reg_mti;
    private int cuenta_mti;
    private long ci;
}
