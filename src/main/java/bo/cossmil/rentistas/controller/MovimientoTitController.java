package bo.cossmil.rentistas.controller;

import bo.cossmil.rentistas.controller.dto.MovimientoTitDTO;
import bo.cossmil.rentistas.model.MovimientoTit;
import bo.cossmil.rentistas.service.MovimientoTitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movimientotit")
public class MovimientoTitController {

    @Autowired
    private MovimientoTitService movimientoTitService;

    @GetMapping
    List<MovimientoTit> getAll(){
        return movimientoTitService.getAll();
    }

    @GetMapping("/top")
    List<MovimientoTit> getTop10(){
        return movimientoTitService.findTop10();
    }

    @GetMapping("/listar")
    List<MovimientoTitDTO> getListar(){
        return movimientoTitService.obtenerMovTitAll();
    }
}
