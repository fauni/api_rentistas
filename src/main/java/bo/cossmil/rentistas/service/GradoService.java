package bo.cossmil.rentistas.service;

import bo.cossmil.rentistas.model.Fuerza;
import bo.cossmil.rentistas.model.Grado;
import bo.cossmil.rentistas.repository.GradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradoService {
    @Autowired
    private GradoRepository gradoRepository;

    public List<Grado> getAll(){
        return gradoRepository.findAll();
    }

}
