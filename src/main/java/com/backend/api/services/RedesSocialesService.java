
package com.backend.api.services;

import com.backend.api.model.RedesSociales;
import com.backend.api.repository.RedesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class RedesSocialesService implements IRedesSocialesService{
    
    @Autowired
    public RedesRepository redesRepo;
    
    @Override
    public List<RedesSociales> verRedes() {
       return redesRepo.findAll();
    }

    @Override
    public void crearRedes(RedesSociales red) {
        redesRepo.save(red);
    }

    @Override
    public void borrarRedes(Long id) {
        redesRepo.deleteById(id);
    }

    @Override
    public RedesSociales buscarRedes(Long id) {
        return redesRepo.findById(id).orElse(null);
       
    }
    
    //agregado
    @Override
    public void actualizarRedes(RedesSociales red) {
        redesRepo.save(red);
    }

  
}

