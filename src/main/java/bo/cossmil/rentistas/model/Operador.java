package bo.cossmil.rentistas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "r_operador")
public class Operador {
    @Id
    @Column(name = "codope")
    private String codigo;
    @Column(name = "patope")
    private String paterno;
    @Column(name = "matope")
    private String materno;
    @Column(name = "nomope")
    private String nombre;
    @Column(name = "estope")
    private String estado;
    @Column(name = "actope")
    private String activo;
    @Column(name = "faltope")
    private LocalDate fecha_alta;
    @Column(name = "fbajope")
    private LocalDate fecha_baja;
    @Column(name = "pasope")
    private String password;
    private String regional;
    private String repart;
}
