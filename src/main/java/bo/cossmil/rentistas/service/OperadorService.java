package bo.cossmil.rentistas.service;

import bo.cossmil.rentistas.model.Operador;
import bo.cossmil.rentistas.repository.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperadorService {
    @Autowired
    private OperadorRepository operadorRepository;

    public List<Operador> getAll(){
        return operadorRepository.findAll();
    }

}
