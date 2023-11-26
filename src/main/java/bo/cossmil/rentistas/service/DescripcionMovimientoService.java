package bo.cossmil.rentistas.service;

import bo.cossmil.rentistas.model.ClaseRenta;
import bo.cossmil.rentistas.model.DescripcionMovimiento;
import bo.cossmil.rentistas.repository.DescripcionMovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescripcionMovimientoService {
    @Autowired
    private DescripcionMovimientoRepository descripcionMovimientoRepository;

    public List<DescripcionMovimiento> getAll(){
        return descripcionMovimientoRepository.findAll();
    }
    public DescripcionMovimiento getById(String id){
        return descripcionMovimientoRepository.findById(id).orElse(null);   }

    public DescripcionMovimiento getByCodigo(String id){
        return descripcionMovimientoRepository.findByCodigo(id);
    }

    public Optional<DescripcionMovimiento> getPorCodigo(String codigo){
        return descripcionMovimientoRepository.findPorCodigo(codigo);
    }
    public DescripcionMovimiento save(DescripcionMovimiento descripcionMovimiento){
        return descripcionMovimientoRepository.save(descripcionMovimiento);
    }

    public void delete(Long id){
        // claseRentaRepository.deleteById(id);
    }
}
