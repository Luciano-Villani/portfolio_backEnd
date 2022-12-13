
package com.backend.api.controller;


import com.backend.api.model.HardSkills;
import com.backend.api.services.IHardSkillsService;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
        
public class HardSkillsController {
    
  @Autowired
  private IHardSkillsService hardSkillsServ;
  
    @PostMapping ("/new/hardskill")
    public void agregarHardSkills (@RequestBody HardSkills skills){
        hardSkillsServ.crearHardSkills(skills);
    }
    @GetMapping ("/ver/hardskills")
    @ResponseBody
    public List<HardSkills> verHardSkills (){
        return hardSkillsServ.verHardSkills();
        
    }
    @DeleteMapping("/hardskills/delete/{id}")
    public void borrarHardSkills (@PathVariable Long id){
        hardSkillsServ.borrarHardSkills(id);
        
        //agregado mio
    }
    @PutMapping ("/actualizar/hardskill")
    public void actualizarHardSkills (@RequestBody HardSkills skills){
        hardSkillsServ.actualizarHardSkills(skills);
}
}
