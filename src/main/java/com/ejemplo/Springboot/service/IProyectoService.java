
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<proyecto>verProyectos();
    public proyecto crearProyecto(proyecto proyecto);
    public void borrarProyecto(Long id);
   
}
