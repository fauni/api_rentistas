package bo.cossmil.rentistas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "r_regional")
public class Regional {
    @Id
    @Column(name = "cod_reg")
    private String codigo;
    private String descripcion;
    private int cod_alt;
    @Column(name = "abr_reg")
    private String abreviado;
}
