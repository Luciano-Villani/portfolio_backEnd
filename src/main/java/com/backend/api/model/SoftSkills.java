package com.backend.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class SoftSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre;
    private Float porcentaje;
    
    public SoftSkills(){ 
               
    }
    public SoftSkills(Long id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        
    }
    
}