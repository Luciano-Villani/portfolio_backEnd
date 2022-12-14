package com.backend.api.controller;

import com.backend.api.model.Formacion;
import com.backend.api.services.IFormacionService;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
        
public class FormacionController {
    
    
    
  @Autowired
  private IFormacionService formaServ;
  
  
    @PostMapping ("/new/formacion")
    public void agregarFormacion (@RequestBody Formacion formas){
        
        formaServ.crearFormacion(formas);
    }
    @GetMapping ("/ver/formacion")
    @ResponseBody
    public List<Formacion> verFormacion (){
        return formaServ.verFormacion();
        
    }
    @DeleteMapping("/formacion/delete/{id}")
    public void borrarFormacion (@PathVariable Long id){
        formaServ.borrarFormacion(id);
        
        //agregado mio
    }
    @PutMapping ("/actualizar/formacion")
    public void actualizarFormacion (@RequestBody Formacion forms){
        formaServ.actualizarFormacion(forms);
}
}
