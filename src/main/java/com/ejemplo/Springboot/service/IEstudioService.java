
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.estudio;
import java.util.List;


public interface IEstudioService {
    
    public List<estudio>verEstudios();
    public estudio crearEstudio(estudio estudio);
    public void borrarEstudio(Long id);
    
}
