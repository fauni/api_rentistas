package bo.cossmil.rentistas.service;

import bo.cossmil.rentistas.model.MovimientoTit;
import bo.cossmil.rentistas.repository.MovimientoTitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoTitService {

    @Autowired
    private MovimientoTitRepository movimientoTitRepository;

    public List<MovimientoTit> getAll(){
        return movimientoTitRepository.findAll();
    }
}
