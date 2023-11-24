package bo.cossmil.rentistas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "r_reparticion")
public class Reparticion {
    @Id
    private String idrepart;
    private String desrepart;
    private String abrrepart;
    private String codalt;
    private String sigla;
}
