
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.estudio;
import com.ejemplo.Springboot.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService{
    
    @Autowired
    public EstudioRepository estudioRepo;

    @Override
    public List<estudio> verEstudios() {
        return estudioRepo.findAll();
    }

    @Override
    public estudio crearEstudio(estudio estudio) {
        return estudioRepo.save(estudio);
    }

    @Override
    public void borrarEstudio(Long id) {
        estudioRepo.deleteById(id);
    }

    public void modificarEstudio(estudio estudio) {
        estudioRepo.save(estudio);
    }

    public estudio buscarEstudio(Long id) {
        return estudioRepo.findById(id).orElse(null);
    }
}
