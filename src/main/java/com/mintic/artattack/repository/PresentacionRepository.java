/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.artattack.repository;

import com.mintic.artattack.model.Presentacion;
import com.mintic.artattack.model.PresentacionId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jccas
 */
public interface PresentacionRepository extends JpaRepository<Presentacion, PresentacionId> {    
        
}
