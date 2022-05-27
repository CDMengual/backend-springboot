
package com.ejemplo.Springboot.repository;

import com.ejemplo.Springboot.model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <persona, Long>{
    
}
