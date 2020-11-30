/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.artattack.repository;

import com.mintic.artattack.model.Exposicion;
import com.mintic.artattack.model.Obra;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jccas
 */
public interface ObraRepository extends JpaRepository<Obra, Long> {
    
    @Query("select o from Obra o where o.exposicion.expId = ?1 and o.obrCosto > ?2")
    List<Obra> listaObras(Long idExpo, Double costo);
    
    List<Obra> findByObrTipoOrderByObrNombre(String tipoObra);
    
    List<Obra> findByExposicion_ExpIdAndObrCostoGreaterThan(Long idExpo, Double costo);
    
    @Query("select x from Obra x where x.obrTipo like ?1 order by x.obrNombre")
    List<Obra> buscarPorTipo(String tipoObra);
    
    @Query("select o from Obra o join Presentacion p on o.obrId = p.presentacionId.obra.obrId where p.presentacionId.preFecha like ?1")
    List<Obra> buscarPorFecha(String fecha);
    
    Long countByObrTipo(String tipoObra);
    
    @Query("select count(o) from Obra o join Presentacion p on o.obrId = p.presentacionId.obra.obrId where p.presentacionId.preFecha like ?1")
    Long contarPorFecha(String fecha);
    
}

