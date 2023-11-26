package bo.cossmil.rentistas.controller;

import bo.cossmil.rentistas.controller.dto.ClaseRentaDTO;
import bo.cossmil.rentistas.controller.dto.DescripcionMovimientoDTO;
import bo.cossmil.rentistas.model.ClaseRenta;
import bo.cossmil.rentistas.model.DescripcionMovimiento;
import jakarta.websocket.server.PathParam;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import bo.cossmil.rentistas.service.DescripcionMovimientoService;
import java.util.List;
@RestController
@RequestMapping("/api/descripcion/movimiento")

public class DescripcionMovimientoController {
    @Autowired
            private  DescripcionMovimientoService descripcionMovimientoService;

    @GetMapping
    List<DescripcionMovimiento> getAll(){
        return descripcionMovimientoService.getAll();
    }

    @GetMapping("/{id}")
    DescripcionMovimiento getById(@PathVariable String id){return descripcionMovimientoService.getByCodigo(id); }

    @GetMapping("codigo/{codigo}")
    DescripcionMovimientoDTO getPorCodigo(@PathVariable String codigo){
        // ClaseRenta claseRenta = claseRentaService.getPorCodigo(codigo).orElseThrow();
        //ClaseRentaDTO dto = new ClaseRentaDTO();
        //dto.setDescripcion(claseRenta.getDescripcion());
        //return dto;
        return new ModelMapper().map(descripcionMovimientoService.getPorCodigo(codigo), DescripcionMovimientoDTO.class);
    }

    @PostMapping
    public DescripcionMovimiento save(@RequestBody DescripcionMovimiento descripcionMovimiento){
        return descripcionMovimientoService.save(descripcionMovimiento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        descripcionMovimientoService.delete(id);
    }

}
