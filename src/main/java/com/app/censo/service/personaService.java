/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.censo.service;

import com.app.censo.entidad.personas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.censo.repository.personaRepository;

/**
 *
 * @author alexs
 */@Service
public class personaService {
    @Autowired
    private personaRepository personaRepository;
    
    public List<personas> listAll(String keyword){
        if(keyword !=null){
            return personaRepository.findAll(keyword);
        }
        return personaRepository.findAll();
        
    }
    public void save(personas personas){
        personaRepository.save(personas);
        
    }
    
    public personas get(int id){
        return (personas) personaRepository.findById(id);
        
    }
    
    public void delete(Long id){
        personaRepository.deleteById(id);
        
    }
    
    public int getTotalHabitantes() {
    return personaRepository.getTotalHabitantes();
}

}
