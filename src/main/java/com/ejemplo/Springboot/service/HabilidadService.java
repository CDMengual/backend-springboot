
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.habilidad;
import com.ejemplo.Springboot.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{
    
    @Autowired
    public HabilidadRepository habilidadRepo;

    @Override
    public List<habilidad> verHabilidades() {
        return habilidadRepo.findAll();
    }

    @Override
    public habilidad crearHabilidad(habilidad habilidad) {
        return habilidadRepo.save(habilidad);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habilidadRepo.deleteById(id);
    }
    
     public void modificarHabilidad(habilidad habilidad) {
        habilidadRepo.save(habilidad);
    }

    public habilidad buscarHabilidad(Long id) {
        return habilidadRepo.findById(id).orElse(null);
    }
    
}
