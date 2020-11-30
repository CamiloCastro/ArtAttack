/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.artattack.repository;

import com.mintic.artattack.model.Museo;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jccas
 */
public interface MuseoRepository extends JpaRepository<Museo, Long> {
    
    List<Museo> findByNombre(String nombre);
    
    List<Museo> findByFechaFundacionBetween(Date min, Date max);
    
    @Query("select x from Museo x order by x.fechaFundacion")
    List<Museo> findAllOrderByFechaFundacion();
    
}
