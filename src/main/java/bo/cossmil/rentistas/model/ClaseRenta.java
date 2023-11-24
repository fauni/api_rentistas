package bo.cossmil.rentistas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "r_clasrenta")
public class ClaseRenta {
    @Id
    @Column(name = "codren")
    private String codigo;
    @Column(name = "desren")
    private String descripcion;
}
