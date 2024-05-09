package com.app.censo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class personas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String departamento;

    private String municipio;

    private String colonia;

    private String tipoDeVivienda;
    
    private Integer CantidaDeHabitantes;

    public personas(int id, String nombre, String departamento, String municipio, String colonia, String tipoDeVivienda, Integer CantidaDeHabitantes) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.municipio = municipio;
        this.colonia = colonia;
        this.tipoDeVivienda = tipoDeVivienda;
        this.CantidaDeHabitantes = CantidaDeHabitantes;
    }

    public personas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getTipoDeVivienda() {
        return tipoDeVivienda;
    }

    public void setTipoDeVivienda(String tipoDeVivienda) {
        this.tipoDeVivienda = tipoDeVivienda;
    }

    public Integer getCantidaDeHabitantes() {
        return CantidaDeHabitantes;
    }

    public void setCantidaDeHabitantes(Integer CantidaDeHabitantes) {
        this.CantidaDeHabitantes = CantidaDeHabitantes;
    }

  
 
}
