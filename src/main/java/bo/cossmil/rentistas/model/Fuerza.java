package bo.cossmil.rentistas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "r_fuerza")
public class Fuerza {
    @Id
    // @Column(name = "cod_fza")
    // private String codigo;

    @Column(name = "des_fza")
    private String descripcion;

    private String description;
}
