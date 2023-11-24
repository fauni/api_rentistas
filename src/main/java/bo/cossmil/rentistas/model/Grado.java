package bo.cossmil.rentistas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "r_grados")
public class Grado {
    @Id
    //@Column(name = "cod_grd")
    //private String codigo;
    @Column(name = "des1_grd")
    private String descripcion;
    @Column(name = "abr1_grd")
    private String abreviado;
    @Column(name = "abr2_grd")
    private String abreviado2;
    @Column(name = "des2_grd")
    private String descripcion2;
}
