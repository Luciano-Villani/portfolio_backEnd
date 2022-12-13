package com.backend.api.services;

import com.backend.api.model.SoftSkills;
import java.util.List;


public interface ISoftSkillsService {
    public List<SoftSkills> verSoftSkills();
    public void crearSoftSkills (SoftSkills skill);
    public void borrarSoftSkills (Long id);
    public SoftSkills buscarSoftSkills (Long id);
    //agregado 
    public void actualizarSoftSkills (SoftSkills skill);
}
