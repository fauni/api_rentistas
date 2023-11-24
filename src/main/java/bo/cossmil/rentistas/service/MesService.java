package bo.cossmil.rentistas.service;

import bo.cossmil.rentistas.model.Mes;
import bo.cossmil.rentistas.repository.MesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesService {
    @Autowired
    private MesRepository mesRepository;

    public List<Mes> getAll(){
        return mesRepository.findAll();
    }
}
