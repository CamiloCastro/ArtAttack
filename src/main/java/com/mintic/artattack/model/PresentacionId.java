/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.artattack.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author jccas
 */
@Embeddable
public class PresentacionId implements Serializable {    
    
    private String preFecha;    
    
    @ManyToOne
    @JoinColumn(name = "mus_id")
    private Museo museo;    
    
    @ManyToOne
    @JoinColumn(name = "obr_id")
    private Obra obra;

    public String getPreFecha() {
        return preFecha;
    }

    public void setPreFecha(String preFecha) {
        this.preFecha = preFecha;
    }  
    


    public Museo getMuseo() {
        return museo;
    }

    public void setMuseo(Museo museo) {
        this.museo = museo;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
    
    
    
}
