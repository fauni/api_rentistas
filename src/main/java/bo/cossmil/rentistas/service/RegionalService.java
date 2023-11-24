package bo.cossmil.rentistas.service;

import bo.cossmil.rentistas.model.Regional;
import bo.cossmil.rentistas.repository.RegionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionalService {
    @Autowired
    private RegionalRepository regionalRepository;

    public List<Regional> getAll(){
        return regionalRepository.findAll();
    }
}
