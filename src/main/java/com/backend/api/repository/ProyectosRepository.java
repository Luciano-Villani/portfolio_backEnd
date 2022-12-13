
package com.backend.api.repository;

import com.backend.api.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectosRepository  extends JpaRepository <Proyectos, Long>{
    
}
