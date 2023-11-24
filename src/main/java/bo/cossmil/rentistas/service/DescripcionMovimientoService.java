package bo.cossmil.rentistas.service;

import bo.cossmil.rentistas.model.DescripcionMovimiento;
import bo.cossmil.rentistas.repository.DescripcionMovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DescripcionMovimientoService {
    @Autowired
    private DescripcionMovimientoRepository descripcionMovimientoRepository;

    public List<DescripcionMovimiento> getAll(){
        return descripcionMovimientoRepository.findAll();
    }
    public DescripcionMovimiento getById(String id){
        return descripcionMovimientoRepository.findById(id).orElse(null);   }

    public DescripcionMovimiento save(DescripcionMovimiento descripcionMovimiento){
        return descripcionMovimientoRepository.save(descripcionMovimiento);
    }

    public void delete(Long id){
        // claseRentaRepository.deleteById(id);
    }
}
