package bo.cossmil.rentistas.controller.dto;
public class MovimientoTitDTO {
    private String mtrmti;
    private Integer tre_mti;

    private DescripcionMovimientoDTO des_mti;
    // private String cdes_mti;

    public MovimientoTitDTO(String mtrmti, Integer tre_mti) {
        this.mtrmti = mtrmti;
        this.tre_mti = tre_mti;
    }

    public MovimientoTitDTO(String mtrmti, Integer tre_mti, DescripcionMovimientoDTO des_mti) {
        this.mtrmti = mtrmti;
        this.tre_mti = tre_mti;
        this.des_mti = des_mti;
    }

    public String getMtrmti() {
        return mtrmti;
    }

    public void setMtrmti(String mtrmti) {
        this.mtrmti = mtrmti;
    }

    public Integer getTre_mti() {
        return tre_mti;
    }

    public void setTre_mti(Integer tre_mti) {
        this.tre_mti = tre_mti;
    }

    public DescripcionMovimientoDTO getDes_mti() {
        return des_mti;
    }

    public void setDes_mti(DescripcionMovimientoDTO des_mti) {
        this.des_mti = des_mti;
    }
}
