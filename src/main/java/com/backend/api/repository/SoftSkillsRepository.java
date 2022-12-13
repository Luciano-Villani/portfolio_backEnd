
package com.backend.api.repository;

import com.backend.api.model.SoftSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SoftSkillsRepository  extends JpaRepository <SoftSkills, Long>{
    
}
