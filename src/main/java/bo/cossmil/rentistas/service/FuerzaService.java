package bo.cossmil.rentistas.service;

import bo.cossmil.rentistas.model.Fuerza;
import bo.cossmil.rentistas.repository.FuerzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuerzaService {
    @Autowired
    private FuerzaRepository fuerzaRepository;

    public List<Fuerza> getAll(){
        return fuerzaRepository.findAll();
    }

}
