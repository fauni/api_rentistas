package bo.cossmil.rentistas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "r_tempo1")
public class Tempo {
    @Id
    private String mtr_tmp1;
    private Double ci_tmp1;
    private String mca_tmp1;
    private int nbe_tmp1;
    private Double rref_temp1;
    private Double por_tmp1;
    private Double rbasic_tmp1;
    private Double tingreso_tmp1;
    private Double tganado_tmp1;
    private Double tdesc_tmp1;
    private Double lpagable_tmp1;
    private Double nboleta_tmp1;
    private Double tipren_tmp1;
    private Double rdignidad_tmp1;
    private Double dagui_tmp1;
    private String mesproc_tmp1;
    private String nmesproc_tmp1;
    private LocalDate fecproc_tmp1;
    private String gestion_tmp1;
    private String estado_tmp1;
    private String usimp_tmp1;
    private LocalDate fecrbol_tmp1;
    private String estreim_tmp1;
    private LocalDate fecreim_tmp1;
    private String usreim_tmp1;
}
