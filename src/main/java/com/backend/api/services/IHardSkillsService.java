package com.backend.api.services;

import com.backend.api.model.HardSkills;
import java.util.List;


public interface IHardSkillsService {
    public List<HardSkills> verHardSkills();
    public void crearHardSkills (HardSkills skill);
    public void borrarHardSkills (Long id);
    public HardSkills buscarHardSkills (Long id);
    //agregado 
    public void actualizarHardSkills (HardSkills skill);
}
