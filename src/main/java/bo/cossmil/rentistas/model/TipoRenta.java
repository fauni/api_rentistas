package bo.cossmil.rentistas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "r_tipren")
public class TipoRenta {
    @Id
    private Double tre1;
    private String detalle;
}
