package com.porfolioApp.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String instagram;
    private String telefonowasap;
    private String imgportada;
    private String imgfoto;
    private String nombre;
    private String profesion;
    private String descripcion;
    
   
    public Persona() {
    }

    public Persona(Long id, String instagram, String telefonowasap, String imgportada, 
            String imgfoto, String nombre, String profesion, String descripcion) {
        this.id = id;
        this.instagram = instagram;
        this.telefonowasap = telefonowasap;
        this.imgportada = imgportada;
        this.imgfoto = imgfoto;
        this.nombre = nombre;
        this.profesion = profesion;
        this.descripcion = descripcion;
    }
}
