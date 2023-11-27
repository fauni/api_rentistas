package bo.cossmil.rentistas.controller.dto;

import bo.cossmil.rentistas.model.DescripcionMovimiento;

public class DescripcionMovimientoDTO {
    private String codigo;
    private String descripcion;
    private String abreviado;

    DescripcionMovimientoDTO(){

    }

    public DescripcionMovimientoDTO(String codigo, String descripcion, String abreviado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.abreviado = abreviado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviado() {
        return abreviado;
    }

    public void setAbreviado(String abreviado) {
        this.abreviado = abreviado;
    }
}

