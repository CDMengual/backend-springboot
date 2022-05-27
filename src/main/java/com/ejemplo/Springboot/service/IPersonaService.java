
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.persona;
import java.util.List;

public interface IPersonaService {
    
    public List<persona>verPersonas();
    public void crearPersona(persona persona);
    public void borrarPersona(Long id);
    public persona buscarPersona(Long id);
    public void modificarPersona(persona persona);
    
}
