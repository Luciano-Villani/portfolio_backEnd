
package com.backend.api.services;

import com.backend.api.model.Formacion;
import java.util.List;



public interface IFormacionService {
    public List<Formacion> verFormacion();
    public void crearFormacion (Formacion inf);
    public void borrarFormacion (Long id);
    public Formacion buscarFormacion (Long id);
    //agregado 
    public void actualizarFormacion (Formacion inf);
    
}
