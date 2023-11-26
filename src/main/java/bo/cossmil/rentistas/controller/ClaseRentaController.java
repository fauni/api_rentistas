package bo.cossmil.rentistas.controller;

import bo.cossmil.rentistas.controller.dto.ClaseRentaDTO;
import bo.cossmil.rentistas.model.ClaseRenta;
import bo.cossmil.rentistas.service.ClaseRentaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/renta/clase")
public class ClaseRentaController {
    @Autowired
    private ClaseRentaService claseRentaService;

     @GetMapping
    List<ClaseRenta> getAll(){
        return claseRentaService.getAll();
    }

    @GetMapping("/{id}")
    ClaseRenta getById(@PathVariable String id){
        return claseRentaService.getByCodigo(id);
    }

    @GetMapping("codigo/{codigo}")
    ClaseRentaDTO getPorCodigo(@PathVariable String codigo){
        // ClaseRenta claseRenta = claseRentaService.getPorCodigo(codigo).orElseThrow();
        //ClaseRentaDTO dto = new ClaseRentaDTO();
        //dto.setDescripcion(claseRenta.getDescripcion());
        //return dto;
        return new ModelMapper().map(claseRentaService.getPorCodigo(codigo), ClaseRentaDTO.class);
    }

    @PostMapping
    public ClaseRenta save(@RequestBody ClaseRenta claseRenta){
        return claseRentaService.save(claseRenta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        claseRentaService.delete(id);
    }
}
