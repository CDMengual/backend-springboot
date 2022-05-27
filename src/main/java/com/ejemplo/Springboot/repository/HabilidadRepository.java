
package com.ejemplo.Springboot.repository;

import com.ejemplo.Springboot.model.habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository <habilidad, Long> {
    
    public List<habilidad> findByIdPersona(Long idPersona);
}
