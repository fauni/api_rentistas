package bo.cossmil.rentistas.service;

import bo.cossmil.rentistas.model.ClaseRenta;
import bo.cossmil.rentistas.repository.ClaseRentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaseRentaService {
    @Autowired
    private ClaseRentaRepository claseRentaRepository;

    public List<ClaseRenta> getAll(){
        return claseRentaRepository.findAll();
    }
    public ClaseRenta getById(String id){
        return claseRentaRepository.findById(id).orElse(null);   }
    public ClaseRenta getByCodigo(String id){
        return claseRentaRepository.findByCodigo(id);
    }

    public Optional<ClaseRenta> getPorCodigo(String codigo){
        return claseRentaRepository.findPorCodigo(codigo);
    }

    public ClaseRenta save(ClaseRenta claseRenta){
        return claseRentaRepository.save(claseRenta);
    }

    public void delete(Long id){
        // claseRentaRepository.deleteById(id);
    }
}
