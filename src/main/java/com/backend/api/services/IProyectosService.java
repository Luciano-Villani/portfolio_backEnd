
package com.backend.api.services;

import com.backend.api.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    public List<Proyectos> verProyectos();
    public void crearProyecto (Proyectos pro);
    public void borrarProyecto (Long id);
    public Proyectos buscarProyecto (Long id);
    //agregado 
    public void actualizarProyecto (Proyectos pro);
}
