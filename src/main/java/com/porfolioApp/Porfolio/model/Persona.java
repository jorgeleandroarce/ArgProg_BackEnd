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
    
    private String imgportada;
    private String imgfoto;
    private String nombre;
    private String profesion;
    private String descripcion;
    private String instagram;
    private String telefono;
    private String e_mail;
    
    public Persona() {
    }

    public Persona(Long id, String imgportada, String imgfoto, String nombre, String profesion,
            String descripcion, String instagram, String telefono, String e_mail) {
        this.id = id;
        this.imgportada = imgportada;
        this.imgfoto = imgfoto;
        this.nombre = nombre;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.instagram = instagram;
        this.telefono = telefono;
        this.e_mail = e_mail;
    }

}

