package bo.cossmil.rentistas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "r_mes")
public class Mes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_mes")
    private int codigo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "abr_mes")
    private String abreviado;
}
