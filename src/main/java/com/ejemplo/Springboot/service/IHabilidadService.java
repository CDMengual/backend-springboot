
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.habilidad;
import java.util.List;


public interface IHabilidadService {
    
    public List<habilidad>verHabilidades();
    public habilidad crearHabilidad(habilidad habilidad);
    public void borrarHabilidad(Long id);
    
}
