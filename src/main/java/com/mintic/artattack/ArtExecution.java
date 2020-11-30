/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.artattack;

import com.mintic.artattack.model.Exposicion;
import com.mintic.artattack.model.Museo;
import com.mintic.artattack.model.Obra;
import com.mintic.artattack.repository.ExposicionRepository;
import com.mintic.artattack.repository.MuseoRepository;
import com.mintic.artattack.repository.ObraRepository;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author jccas
 */
@Component
public class ArtExecution implements CommandLineRunner {
    
    private static final Logger logger = LoggerFactory.getLogger(ArtExecution.class);
    
    @Autowired
    private MuseoRepository museoRepository;
    
    @Autowired
    private ExposicionRepository exposicionRepository;
   
    @Autowired
    private ObraRepository obraRepository;
    
    public int randomInt(int min, int max)
    {
        Random rnd = new Random();
        return rnd.nextInt(max - min) + min;
    }

    @Override
    public void run(String... args) throws Exception {
        
        Calendar c = new GregorianCalendar(1810,0,1);
        Date min = c.getTime();
        
        Calendar c1 = new GregorianCalendar(1850,11,31);
        Date max = c1.getTime();        
        
        List<Museo> museos = museoRepository.findByFechaFundacionBetween(min, max);
        
        for (Museo museo : museos) {
            logger.info("Nombre: {}, Fecha fundación: {}", museo.getNombre(), museo.getFechaFundacion().toString());
        }
        
        logger.info("***************************************");
        
        museos = museoRepository.findAllOrderByFechaFundacion();
        for (Museo museo : museos) {
            logger.info("Nombre: {}, Fecha fundación: {}", museo.getNombre(), museo.getFechaFundacion().toString());
        }
        
        
//        List<Museo> museos = museoRepository.findAll();
//        
//        for (Museo museo : museos) {
//            
//            int anio = randomInt(1800, 1910);
//            int mes = randomInt(0, 12);
//            int dia = randomInt(1, 29);
//            
//            Calendar c = new GregorianCalendar(anio, mes, dia);            
//            Date fechaFundacion = c.getTime();            
//            museo.setFechaFundacion(fechaFundacion);
//            museoRepository.save(museo);
//            
//            logger.info("Nombre: {}, Fecha fundación: {}", museo.getNombre(), museo.getFechaFundacion().toString());
//        }
        
        
//        List<Exposicion> exposiciones = exposicionRepository.findAll();
//        
//        for (Exposicion exposicion : exposiciones) {
//            
//            logger.info("Expo Id: {}, Expo Nombre: {}", exposicion.getExpId(), exposicion.getExpNombre());
//            
//            for (Obra obra : exposicion.getObras()) {                
//                logger.info("Obra Id: {}, Obra Nombre: {}, Obra Costo: {}", obra.getObrId(), obra.getObrNombre(), obra.getObrCosto());
//            }
//        }
//        
//        logger.info("******************************************");
//        
//        List<Obra> obras = obraRepository.listaObras(1003L, 400.0);
//        for (Obra obra : obras) {                
//            logger.info("Obra Id: {}, Obra Nombre: {}, Obra Costo: {}", obra.getObrId(), obra.getObrNombre(), obra.getObrCosto());
//        }
//        
//        logger.info("******************************************");
//        obras = obraRepository.findByExposicion_ExpIdAndObrCostoGreaterThan(1003L, 400.0);
//        for (Obra obra : obras) {                
//            logger.info("Obra Id: {}, Obra Nombre: {}, Obra Costo: {}", obra.getObrId(), obra.getObrNombre(), obra.getObrCosto());
//        }
//        
//        
//        logger.info("******************************************");
//        
//        obras = obraRepository.findByObrTipoOrderByObrNombre("pintura");
//        for (Obra obra : obras) {                
//            logger.info("Obra Id: {}, Obra Nombre: {}, Obra Tipo: {}", obra.getObrId(), obra.getObrNombre(), obra.getObrTipo());
//        }
//        
//        logger.info("******************************************");
//        
//        obras = obraRepository.buscarPorTipo("pintura");
//        for (Obra obra : obras) {                
//            logger.info("Obra Id: {}, Obra Nombre: {}, Obra Tipo: {}", obra.getObrId(), obra.getObrNombre(), obra.getObrTipo());
//        }
//        
//        logger.info("******************************************");
//        
//        obras = obraRepository.buscarPorFecha("%ene%");
//        logger.info("Se presentaron {} obras en enero", obras.size());
//        for (Obra obra : obras) {                
//            logger.info("Obra Id: {}, Obra Nombre: {}, Obra Tipo: {}", obra.getObrId(), obra.getObrNombre(), obra.getObrTipo());
//        }
//        
//        logger.info("******************************************");
//        
//        Long c = obraRepository.countByObrTipo("pintura");
//        logger.info("Existen {} pinturas en las obras.", c);
//        
//        logger.info("******************************************");
//        
//        c = obraRepository.contarPorFecha("%ene%");        
//        logger.info("Se presentaron {} obras en enero.", c);
        
        
//        logger.info("HOLA MUNDO DESDE SPRINGBOOT");
//        
//        logger.warn("Total museos: " + museoRepository.count());
//        
//        Museo m = new Museo();
//        m.setId(401L);
//        m.setNombre("Museo del oro");
//        museoRepository.save(m);
//        
//        logger.error("Total museos: " + museoRepository.count());
//        
//        List<Museo> museos = museoRepository.findAll();
//        
//        for (Museo museo : museos) {
//            logger.info("Id: " + museo.getId() + ", Nombre: " + museo.getNombre());
//        }
//        
//        Optional<Museo> museoOpt = museoRepository.findById(501L);
//        
//        if(museoOpt.isPresent())
//            logger.info("Nombre del museo: " + museoOpt.get().getNombre());
//        else
//            logger.info("No existe el museo con el id dado");
        
        
    }
    
}
