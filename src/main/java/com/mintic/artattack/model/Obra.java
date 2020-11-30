/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.artattack.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jccas
 */
@Entity
@Table(name = "obra")
public class Obra {
    
    @Id    
    private Long obrId;    
    private String obrNombre;
    private String obrTipo; 
    private Double obrCosto;

    @ManyToOne
    @JoinColumn(name = "exp_id")
    private Exposicion exposicion;      

    public Long getObrId() {
        return obrId;
    }

    public void setObrId(Long obrId) {
        this.obrId = obrId;
    }

    public String getObrNombre() {
        return obrNombre;
    }

    public void setObrNombre(String obrNombre) {
        this.obrNombre = obrNombre;
    }

    public String getObrTipo() {
        return obrTipo;
    }

    public void setObrTipo(String obrTipo) {
        this.obrTipo = obrTipo;
    }

    public Double getObrCosto() {
        return obrCosto;
    }

    public void setObrCosto(Double obrCosto) {
        this.obrCosto = obrCosto;
    }
    
    
    

    public Exposicion getExposicion() {
        return exposicion;
    }

    public void setExposicion(Exposicion exposicion) {
        this.exposicion = exposicion;
    }
    
    

    
    
    
    
}
