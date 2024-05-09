/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.censo.repository;

import com.app.censo.entidad.personas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author alexs
 */
public interface personaRepository extends JpaRepository< personas, Long>{

    public Object findById(int id);
    
    @Query("SELECT p FROM personas p WHERE p.departamento LIKE %?1%")
    public List<personas> findAll(String keyword);
    
    
    
@Query("SELECT SUM(CantidaDeHabitantes) FROM personas")
int getTotalHabitantes();

    
}
