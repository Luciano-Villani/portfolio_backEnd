
package com.backend.api.repository;

import com.backend.api.model.HardSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HardSkillsRepository  extends JpaRepository <HardSkills, Long>{
    
}
