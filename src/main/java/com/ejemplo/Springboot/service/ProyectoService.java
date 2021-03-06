
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.proyecto;
import com.ejemplo.Springboot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
     @Autowired
    public ProyectoRepository proyectoRepo;

    @Override
    public List<proyecto> verProyectos() {
        return proyectoRepo.findAll();
    }

    @Override
    public proyecto crearProyecto(proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }
    
     public void modificarProyecto(proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }

    public proyecto buscarProyecto(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }
    
}
