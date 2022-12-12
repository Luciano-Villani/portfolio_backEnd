package com.backend.api.services;

import com.backend.api.model.Formacion;
import com.backend.api.repository.FormacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class FormacionService implements IFormacionService{
    
    @Autowired
    public FormacionRepository formaRepo;
    
    @Override
    public List<Formacion> verFormacion () {
       return formaRepo.findAll();
    }

    @Override
    public void crearFormacion(Formacion inf) {
        formaRepo.save(inf);
    }

    @Override
    public void borrarFormacion(Long id) {
        formaRepo.deleteById(id);
    }

    @Override
    public Formacion buscarFormacion(Long id) {
        return formaRepo.findById(id).orElse(null);
       
    }
    
    //agregado
    @Override
    public void actualizarFormacion(Formacion inf) {
        formaRepo.save(inf);
    }

  
}
