
package com.ejemplo.Springboot.service;


import com.ejemplo.Springboot.model.experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<experiencia>verExperiencias();
    public experiencia crearExperiencia(experiencia experiencia);
    public void borrarExperiencia(Long id);
    
}
