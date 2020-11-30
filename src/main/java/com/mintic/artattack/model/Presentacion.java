/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.artattack.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author jccas
 */
@Entity
@Table(name = "presentacion")
public class Presentacion {   
    
    @EmbeddedId
    private PresentacionId presentacionId;

    public PresentacionId getPresentacionId() {
        return presentacionId;
    }

    public void setPresentacionId(PresentacionId presentacionId) {
        this.presentacionId = presentacionId;
    }
    
    
    
}
