package bo.cossmil.rentistas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "r_rentas")
public class Rentas {
    @Id
    //private String matricula;
    private String ci1;
    private Double ci2;
    private String ext_ren;
    private Double tre;
    // private String mcausante;
    private String paterno;
    private String materno;
    private String prefijo;
    private String apcasada;
    private String nombre;
    private String nombre2;
    private int regional;
    private String fuerza;
    private String grados;
    private String uc;
    private String fc;
    private String um;
    private String fm;
    private int estado;
    private String cuenta;
    private LocalDate fnac;
    private String estciv;
    private LocalDate fingre;
    private String afpren;
    private String rendig;
    private String poder;
    private String codban;
    private int telefono;
    private int celular;
}
