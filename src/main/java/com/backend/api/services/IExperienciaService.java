
package com.backend.api.services;

import com.backend.api.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia> verExperiencias();
    public void crearExperiencia (Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);
    //agregado 
    public void actualizarExperiencia (Experiencia exp);
}
