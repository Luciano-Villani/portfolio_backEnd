
package com.backend.api.repository;

import com.backend.api.model.RedesSociales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedesRepository extends JpaRepository <RedesSociales, Long>{
    
}


