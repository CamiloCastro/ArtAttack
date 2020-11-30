package com.mintic.artattack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArtAttackApplication {

	public static void main(String[] args) {
            new ArtFrame().setVisible(true);                          
	}
        
        public static void initSpring(String[] args)
        {
            SpringApplication.run(ArtAttackApplication.class, args);  
        }

}
