
package com.ejemplo.Springboot.repository;

import com.ejemplo.Springboot.model.experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <experiencia, Long> {
    
     public List<experiencia> findByIdPersona(Long idPersona);
    
}
